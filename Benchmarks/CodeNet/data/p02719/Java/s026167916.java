
import java.util.Scanner;

public class Main {

    static long N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        K = sc.nextLong();

        long ans1 = N % K;
        System.out.println(Math.min(ans1, K - ans1));
    }
}
