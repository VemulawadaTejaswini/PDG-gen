
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        if (A[N-1] != 2) {
            System.out.println(-1);
            return;
        }
        long min = 2;
        long max = 3;
        for (int i = N - 2; 0 <= i; i--) {
            if (max < A[i]) {
                System.out.println(-1);
                return;
            }
            long from = min / A[i];
            if (min % A[i] != 0) {
                from += 1;
            }
            long to = max / A[i];
            long next_min = from * A[i];
            long next_max = to * A[i] + A[i] - 1;
            if (max < next_min) {
                System.out.println(-1);
                return;
            }
            min = next_min;
            max = next_max;
        }
        System.out.printf("%d %d\n", min, max);
    }
}
