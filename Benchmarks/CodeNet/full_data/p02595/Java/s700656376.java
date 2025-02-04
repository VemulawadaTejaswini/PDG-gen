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
        long D = scan.nextLong();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            long X = scan.nextLong();
            long Y = scan.nextLong();
            if (X * X + Y * Y <= D * D) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
