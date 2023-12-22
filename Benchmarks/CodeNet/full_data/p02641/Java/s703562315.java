import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int N = scan.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(scan.nextInt());
        }
        int diff = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i <= 101; i++) {
            if (set.contains(i)) {
                continue;
            }
            int t = Math.abs(i - X);
            if (t < diff) {
                ans = i;
                diff = t;
            }
        }
        System.out.println(ans);
    }
}
