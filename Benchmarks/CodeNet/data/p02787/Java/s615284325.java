import java.util.Scanner;

class Solver {
    public void Solve() {
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < b.length; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int dp[] = new int[h + 1111];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 1_000_000_000;
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < n; j++) {
                if (i - a[j] < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - a[j]] + b[j]);
            }
        }
        int min = 1_000_000_000;
        for (int i = h; i < dp.length; i++) {
            min = Math.min(min, dp[i]);
        }
        System.out.println(min);
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
