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
        int H = scan.nextInt();
        int W = scan.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            if (A < H) {
                continue;
            }
            if (B < W) {
                continue;
            }
            ans += 1;
        }
        System.out.println(ans);
    }
}
