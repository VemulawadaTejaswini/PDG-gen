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
        long[] B = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            B[i] = scan.nextLong();
        }
        long diff = 0;
        for (int i = N - 1; 0 <= i; i--) {
            long target = A[i] + diff;
            long x = (target + (B[i] - 1))/ B[i];
            diff += x * B[i] - target;
        }
        System.out.println(diff);
    }
}
