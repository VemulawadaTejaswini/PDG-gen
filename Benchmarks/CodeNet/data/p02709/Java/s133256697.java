
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        AObj[] a = new AObj[n];
        for (int i = 0; i < n; i++) {
            a[i] = new AObj(i, Integer.parseInt(scan.next()));
        }
        scan.close();

        Arrays.sort(a, (x, y) -> y.value_ - x.value_);

        long[][] dp = new long[n + 1][n + 1];
        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            for (int x = 0; x <= i; x++) {
                int y = i - x;
                dp[x + 1][y] = Math.max(dp[x + 1][y], dp[x][y] + (long)Math.abs(x - a[i].index_) * a[i].value_);
                dp[x][y + 1] = Math.max(dp[x][y + 1], dp[x][y] + (long)Math.abs(a.length - 1 - y - a[i].index_) * a[i].value_);
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum < dp[i][n - i]) {
                sum = dp[i][n - i];
            }
        }
        System.out.println(sum);
    }

}

class AObj {
    int index_;
    int value_;

    public AObj(int index, int value) {
        index_ = index;
        value_ = value;
    }
}
