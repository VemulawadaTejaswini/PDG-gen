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
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0 && a[i] % 2 == 1) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
