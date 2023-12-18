import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a = new long[N];
        long all = 1;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
            all *= a[i];
        }
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += all / a[i];
        }
        double answer = 0;
        answer = (double) all / sum;
        System.out.println(String.format("%.9f", answer));
    }
}
