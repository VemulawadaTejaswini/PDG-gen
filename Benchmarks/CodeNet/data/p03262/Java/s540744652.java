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
        long X = scan.nextLong();
        long[] x = new long[N];
        for (int i = 0; i < N; i++) {
            x[i] = Math.abs(scan.nextLong() - X);
        }
        System.out.println(gcd_list(x));
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
