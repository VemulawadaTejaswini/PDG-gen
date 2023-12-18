
import java.util.Scanner;

public class Main {

    static double N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextDouble();
        K = sc.nextDouble();

        double ans1 = N % K;
        System.out.println((int)Math.min(ans1, K - ans1));
    }
}
