import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int gcd = gcd(a, b);
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= gcd; i++) {
            if (a % i == 0 && b % i == 0) {
                divisors.add(i);
            }
        }

        if (n == 3) {
            int c = in.nextInt();
            Iterator<Integer> iter = divisors.iterator();
            while (iter.hasNext()) {
                int div = iter.next();
                if (c % div != 0) {
                    iter.remove();
                }
            }
        }

        for (int x : divisors) {
            System.out.println(x);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}