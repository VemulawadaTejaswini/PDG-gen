import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());

        // int ans = A < 10 && B < 10 ? A * B : -1;

        long ans = -1;

        for (long i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                if (ans == -1 || ans >= i + (N / i) - 2) {
                    ans = i + (N / i) - 2;
                }
            }
        }

        System.out.println(ans);

    }
}