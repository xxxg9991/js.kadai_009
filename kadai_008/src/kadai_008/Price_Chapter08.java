package kadai_008;
public class Price_Chapter08 {
    public static void main(String[] args) {
        int userAge = 3;
        int serviceCost = 3000;
        switch (userAge) {
            case 0 -> serviceCost = 1000;
            case 1 -> serviceCost = 2000;
            case 2, 3 -> {
                serviceCost = 3000;
                System.out.println("30代の料金は3000円");
            }
            case 4, 5, 6 -> serviceCost = 4000;
            case 7 -> serviceCost = 5000;
            default -> serviceCost = 500;
        }
    }
};