import java.util.*;

public class Main {
    public void main(Scanner sc) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if (a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(check(n, d, a - d, -c, b + n * c) ? "YES" : "NO");
    }

    private boolean check(long n, long a, long b, long c, long d) {
        // f(x)=ax+bとg(x)=cx+dの交点
        long dy = d - b;
        long dx = a - c;
        if (dy % dx != 0) {
            return false;
        }

        long x = dy / dx;
        if (x < 1 || x > n) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
