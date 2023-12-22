import java.io.PrintStream;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        doit(args, new Scanner(System.in), System.out);
    }

    static void doit(String[] args, Scanner scanner, PrintStream out) {
        while (scanner.hasNext()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long gcd = gcd(a, b);
            long lcm = a * b / gcd;
            out.println(String.format("%d %d", gcd, lcm));
        }
    }

    static long gcd(long a, long b) {
        long large = Math.max(a, b);
        long small = Math.min(a, b);
        while (true) {
            long r = large % small;
            if (r == 0) {
                return small;
            }
            large = small;
            small = r;
        }
    }
}