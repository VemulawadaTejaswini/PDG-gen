import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(System.out);
        int N = scan.nextInt();
        String X = scan.next();
        char[] data = X.toCharArray();
        int count_original = 0;
        for (int j = 0; j < N; j++) {
            if (data[j] == '1') {
                count_original += 1;
            }
        }
        long initial = 0;
        long initial_negative = 0;
        for (int i = 0; i < N; i++) {
            if (data[i] == '1') {
                initial += pow(2, N - 1 - i, count_original+1);
                initial %= (count_original+1);
            }
        }
        if (0 < count_original) {
            for (int i = 0; i < N; i++) {
                if (data[i] == '1') {
                    initial_negative += pow(2, N - 1 - i, count_original-1);
                    initial_negative %= (count_original-1);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            long current = 0;
            if (data[i] == '0') {
                current = initial;
                current += pow(2, N - 1 - i, (count_original+1));
                current %= (count_original+1);
            } else {
                if (count_original - 1 == 0) {
                    out.println(0);
                    continue;
                }
                current = initial_negative;
                current -= pow(2, N - 1 - i, (count_original-1));
                current += (count_original-1);
                current %= (count_original-1);
            }
            long ans = 1;
            while (current != 0) {
                char[] x = Long.toBinaryString(current).toCharArray();
                int len = x.length;
                int c = 0;
                for (int j = 0; j < len; j++) {
                    if (x[j] == '1') {
                        c += 1;
                    }
                }
                current = 0;
                for (int j = 0; j < len; j++) {
                    if (x[j] == '0') {
                        continue;
                    }
                    current += pow(2, len - 1 - j, c);
                    current %= c;
                }
                ans += 1;
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    private long pow(int base, int count, long mod) {
        if (count == 0) {
            long t = 1 % mod;
            return t;
        }
        if (count % 2 == 1) {
            long t = base * pow(base, count - 1, mod);
            t %= mod;
            return t;
        }
        long t = pow(base, count / 2, mod);
        t *= t;
        t %= mod;
        return t;
    }
}
