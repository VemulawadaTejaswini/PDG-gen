import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();

        long ans1 = N % K;
        long ans2 = K - ans1;

        System.out.println(Math.min(ans1, ans2));
    }
}
