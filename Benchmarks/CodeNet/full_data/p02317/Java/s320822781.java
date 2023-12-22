import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    int[] as;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
    }

    void solve(){
        int[] dp = new int[n];
        //Arrays.fill(dp, Integer.MAX_VALUE);
        int length = 1;
        dp[0] = as[0];
        for (int i = 1; i < n; i++) {
            if (dp[length - 1] < as[i])
                dp[length++] = as[i];
            else {
                dp[getIndex(dp, length, as[i])] = as[i];
            }
        }
        System.out.println(length);
    }

    int getIndex(int[] as, int length, int v) {
        int l = 0;
        int r = length;
        while (r != l) {
            int mid = l + (r - l) / 2;
            if (as[mid] >= v)
                r = mid;
            else
                l = mid + 1;
        }
        return r;
    }

}