import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
        }

        int a = W[0];
        int b = 0;
        for (int i = 1; i < N; i++) {
            b += W[i];
        }

        int ans = Math.abs(a - b);

        for (int i = 1; i < N-1; i++) {
            a += W[i];
            b -= W[i];
            ans = Math.min(ans, Math.abs(a - b));
        }

        System.out.println(ans);
    }
}
