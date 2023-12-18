import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N;
    static int[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        solve();
    }

    static void solve() {
        long[] cumsum = new long[N];
        cumsum[0] = A[0];

        for (int i = 1; i < N; i++) {
            cumsum[i] = cumsum[i-1] + A[i];
        }

        long[] xorsum = new long[N];
        xorsum[0] = A[0];
        for (int i = 1; i < N; i++) {
            xorsum[i] = xorsum[i-1] ^ A[i];
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                long sum = cumsum[j] - (i == 0 ? 0 : cumsum[i-1]);
                long xor = xorsum[j] ^ (i == 0 ? 0 : xorsum[i-1]);

                if (sum == xor) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
