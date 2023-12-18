import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int count_even = N / 2;
        int count_odd = N / 2 + (N % 2 == 1 ? 1 : 0);
        double ans = (double) count_odd / N;
        System.out.printf("%.7f", ans);
    }
}
