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
        long X = scan.nextLong();
        // B = 0 A^5 = X
        if (sub(0, X)) {
            return;
        }
        // B = 1 A^5 = X + 1
        if (sub(1, X+1)) {
            return;
        }
        // B = -1 A^5 = X - 1
        if (sub(-1, X-1)) {
            return;
        }
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i * i <= X; i++) {
            if (X % i == 0) {
                divisors.add(i);
                if (i * i != X) {
                    divisors.add(X / i);
                }
            }
        }
        for (long d1 : divisors) {
            long d2 = X / d1;
            if (sub2(d1, d2)) {
                return;
            }
            if (sub2(d2, d1)) {
                return;
            }
        }
    }
    private boolean sub2(long d1, long d2) {
        boolean found = true;
        int k;
        int B;
        for (k = 1; k <= d1+1 && found; k++) {
            long t = pow(k, 5);
            if (d1+1 < t) {
                found = false;
                break;
            }
            if (d1 + 1 == t) {
                break;
            }
        }
        for (B = 1; B <= d2 && found; B++) {
            long t = pow(B, 5);
            if (d2 < t) {
                found = false;
                break;
            }
            if (d2 == t) {
                break;
            }
        }
        if (found) {
            System.out.printf("%d %d\n", k*B, B);
            return true;
        }
        return false;
    }
    private boolean sub(long B, long X) {
        for (int i = 0;  i <= X; i++) {
            long t = pow(i, 5);
            if (t == X) {
                System.out.printf("%d %d\n", i, B);
                return true;
            }
            if (X < t) {
                return false;
            }
        }
        return false;
    }
    private long pow(int base, int c) {
        if (c == 0) {
            return 1;
        }
        if (c % 2 == 1) {
            return base * pow(base, c - 1);
        }
        long x = pow(base, c / 2);
        return x * x;
    }
}
