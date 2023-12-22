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
        long N = scan.nextLong();
        c(N);
    }
    private long pow(int base, int count) {
        if (count == 0) {
            return 1;
        }
        if (count % 2 == 1) {
            return base * pow(base, count-1);
        }
        long t = pow(base, count / 2);
        return t * t;
    }
    public void c(long N) {
        int len = 0;
        for (len = 1; len < 12; len++) {
            long t = pow(26, len);
            if (N <= t) {
                N -= 1;
                break;
            }
            N -= t;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int t = (int) (N % 26);
            sb.append((char)(t + 'a'));
            N /= 26;
        }
        System.out.println(sb.reverse().toString());
    }
}
