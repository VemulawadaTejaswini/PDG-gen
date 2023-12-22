import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String str;
        while (true) {
            str = sc.nextLine();
            String[] sp = str.split(" ");
            int n = Integer.parseInt(sp[0]);
            int x = Integer.parseInt(sp[1]);
            if (isFin(n, x)) break;
            System.out.println(sim(n, x));
        }
    }

    int sim(int n, int x) {
        int cnt = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                if (i == j) continue;
                int k = x - i - j;
                if (i == k || j == k) continue;
                if (j < k && k <= n) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    boolean isFin(int n, int x) {
        return n == 0 && x == 0;
    }

}
