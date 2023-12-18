import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static double taxRateA = 0.08;
    static double taxRateB = 0.1;

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int priceLowerBoundA = (int) Math.ceil(a / taxRateA);
        int priceUpperBoundA = (int) Math.floor((a + 1) / taxRateA);
        int priceLowerBoundB = (int) Math.ceil(b / taxRateB);
        int priceUpperBoundB = (int) Math.floor((b + 1) / taxRateB);

        int lb = Math.max(priceLowerBoundA, priceLowerBoundB);
        int ub = Math.min(priceUpperBoundA, priceUpperBoundB);

        if(lb > ub) System.out.println(-1);
        else System.out.println(lb);
    }
}
