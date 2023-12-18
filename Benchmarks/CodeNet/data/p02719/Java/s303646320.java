import java.util.Scanner;

class Solver {
    public void Solve() {
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = gcd(n, k);
        if (a == 1) {
            a = 0;
        }

        System.out.println(a);
    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
