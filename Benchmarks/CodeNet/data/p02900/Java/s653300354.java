import java.util.Scanner;
import java.util.stream.LongStream;

class Solver {

    private final long A;
    private final long B;

    Solver(Scanner in) {
        A = in.nextLong();
        B = in.nextLong();
    }

    void solve() {
        System.out.println(factorize(gcd(A, B)).length + 1);
    }

    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long[] factorize(long x) {
        LongStream.Builder builder = LongStream.builder();
        long i = 2;
        for (; i * i <= x; i++) {
            int c = 0;
            while (x % i == 0) {
                x /= i;
                c++;
            }
            if (c > 0) builder.accept(x);
        }
        if (x != 1) builder.accept(i);
        return builder.build().toArray();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}