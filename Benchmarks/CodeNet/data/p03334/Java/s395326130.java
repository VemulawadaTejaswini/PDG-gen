
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final int n;
    private final long d1;
    private final long d2;

    public Main(final int n, final long d1, final long d2) {
        this.n = n;
        this.d1 = d1;
        this.d2 = d2;
    }

    static class Pos {
        final long x;
        final long y;

        public Pos(final long x, final long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }

        public long getX() {return this.x;}

        public long getY() {return this.y;}

        @Override
        public boolean equals(final Object o) {
            if (o == this) { return true; }
            if (!(o instanceof Pos)) { return false; }
            final Pos other = (Pos) o;
            if (!other.canEqual((Object) this)) { return false; }
            if (this.getX() != other.getX()) { return false; }
            if (this.getY() != other.getY()) { return false; }
            return true;
        }

        @Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final long $x = this.getX();
            result = result * PRIME + (int) ($x >>> 32 ^ $x);
            final long $y = this.getY();
            result = result * PRIME + (int) ($y >>> 32 ^ $y);
            return result;
        }

        protected boolean canEqual(final Object other) {return other instanceof Pos;}
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long d1 = scanner.nextLong();
        final long d2 = scanner.nextLong();

        final Main main = new Main(n, d1, d2);
        final List<Pos> positions = main.main();
        positions.forEach(item -> System.out.println(item));
    }

    public List<Pos> main() {
        final long d1arr[] = new long[n * 4 + 1];
        final long d2arr[] = new long[n * 4 + 1];

        final int[][] ints = new int[n * 2][n * 2];
        for (int i = 0; i < ints.length; ++i) {
            ints[i] = new int[n * 2];
        }

        for (int i = -n * 2; i < n * 2; ++i) {
            final long intsqrt1 = intsqrt(d1 - i * i);
            d1arr[i + n * 2] = intsqrt1;

            final long intsqrt2 = intsqrt(d2 - i * i);
            d2arr[i + n * 2] = intsqrt2;
        }

        final List<Pos> positions = new ArrayList<>();
        for (int x = 0; x < n * 2; ++x) {
            for (int y = 0; y < n * 2; ++y) {
                if (ints[x][y] < 0) {
                    continue;
                }
                positions.add(new Pos(x, y));

                for (int yd = -y; yd < n * 2 - y; yd++) {
                    final int y_ = n * 2 + yd;
                    if (d1arr[y_] >= 0 && (x + d1arr[y_] < n * 2)) {
                        ints[x + (int) d1arr[y_]][y + yd] = -1;
                    }
                    if (d2arr[y_] >= 0 && (x + d2arr[y_] < n * 2)) {
                        ints[x + (int) d2arr[y_]][y + yd] = -1;
                    }
                }
                if (positions.size() == n * n) {
                    break;
                }
            }
            if (positions.size() == n * n) {
                break;
            }
        }
        return positions;

    }

    static long intsqrt(final long i) {
        for (long k = 0; k < i + 1; ++k) {
            if (i == k * k) {
                return k;
            }
            if (i < k * k) {
                return -1;
            }
        }
        return -1;
    }
}
