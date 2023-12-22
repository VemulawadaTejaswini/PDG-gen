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
        long ans = 1000;
        for (int i = 1; i < N; i++) {
            if (A[i-1] < A[i]) {
                long t = ans / A[i-1];
                ans += (A[i]-A[i-1]) * t;
            }
        }
        System.out.println(ans);
    }
}
