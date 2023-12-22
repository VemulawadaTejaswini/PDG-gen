import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        long ans = 1;
        for (int i = 0; i < N; i++) {
            final long A = sc.nextLong();
            ans *= A;
        }

        if (1000000000000000000L < ans || ans < 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
