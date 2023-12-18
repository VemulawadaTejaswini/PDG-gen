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
        int[] d = new int[101];
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        d[a] += 1;
        d[b] += 1;
        d[c] += 1;
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            if (0 < d[i]) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
