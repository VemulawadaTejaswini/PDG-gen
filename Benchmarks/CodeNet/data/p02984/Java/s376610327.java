import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] A = new long[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            sum += A[i];
        }
        StringJoiner sj = new StringJoiner(" ");
        long current = sum;
        for (int i = 1; i * 2 < N; i++) {
            current -= A[i * 2 - 1] * 2;
        }
        sj.add(Long.toString(current));
        for (int i = 1; i < N; i++) {
            current = 2 * A[i - 1] - current;
            sj.add(Long.toString(current));
        }
        System.out.println(sj.toString());
    }
}
