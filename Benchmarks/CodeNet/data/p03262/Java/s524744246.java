import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long X = scan.nextLong();
        long[] x = new long[N+1];
        x[0] = X;
        for (int i = 1; i <= N; i++) {
            x[i] = scan.nextLong();
        }
        Arrays.sort(x);
        long[] dx = new long[N];
        for (int i = 0; i < N; i++) {
            dx[i] = x[i+1] - x[i];
        }
        System.out.println(gcd_list(dx));
    }
    public long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
    public long gcd_list(long [] x) {
        long answer = 0;
        for (int i = 0; i < x.length; i++) {
            answer = gcd(x[i], answer);
        }
        return answer;
    }
}
