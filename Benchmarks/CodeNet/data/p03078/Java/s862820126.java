import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();

        long[] A = new long[X];
        long[] B = new long[Y];
        long[] C = new long[Z];
        for (int i = 0; i < X; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < Y; i++) {
            B[i] = sc.nextLong();
        }
        for (int i = 0; i < Z; i++) {
            C[i] = sc.nextLong();
        }

        int N = X * Y * Z;
        long[] sums = new long[N];
        int cnt = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                for (int k = 0; k < Z; k++) {
                    sums[cnt] = A[i] + B[j] + C[k];
                    cnt++;
                }
            }
        }
        Arrays.sort(sums);
        for (int i = N - 1; i >= N - K ; i--) {
            System.out.println(sums[i]);
        }
    }

    // Main
    public static void main(String[] args) {
        new Main_123_D_1().solve();
    }

}
