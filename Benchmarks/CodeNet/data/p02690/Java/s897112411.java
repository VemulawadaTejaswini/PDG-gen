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
            if (d2 < d1) {
                continue;
            }
            // B == 0
            if (sub(X, d1, 0)) {
                System.out.printf("%d %d\n", d1, 0);
                return;
            }
            for (long B = 1; B <= X; B++) {
                long t = pow(B, 5);
                if (X < t) {
                    break;
                }
                if (sub(X, d1 + B, B)) {
                    System.out.printf("%d %d\n", d1 + B, B);
                    return;
                }
                if (sub(X, d1 - B, -B)) {
                    System.out.printf("%d %d\n", d1 - B, -B);
                    return;
                }
            }
        }
    }
    private boolean sub(long X, long A, long B) {
        long d1 = A - B;
        long d2 = sub2(A, B);
        return d1 * d2 == X;
    }
    private long sub2(long A, long B) {
        long x = A * A * A * A;
        x += A * A * A * B;
        x += A * A * B * B;
        x += A * B * B * B;
        x += B * B * B * B;
        return x;
    }

    private long pow(long base, long c) {
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
