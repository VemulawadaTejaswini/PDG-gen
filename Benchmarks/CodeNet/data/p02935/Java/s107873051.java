import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        Arrays.sort(a);
        double answer = a[0];
        for (int i = 0; i < N; i++) {
            answer = (answer + (double) a[i]) / 2;
        }
        System.out.println(String.format("%.9f", answer));
    }
}
