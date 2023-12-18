import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = scan.nextLong();
        long B = scan.nextLong();
        long N = scan.nextLong();
        if (B - 1 <= N) {
            long ans = A * (B - 1) / B;
            System.out.println(ans);
            return;
        }
        long ans = A * N / B;
        System.out.println(ans);
    }
}
