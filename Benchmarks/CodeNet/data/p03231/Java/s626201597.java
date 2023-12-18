import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        long gcd = gcd(n,m);
        for (int i = 0; i < gcd; i++) {
            if (s[(int) (n/gcd*i)] != t[(int) (m/gcd*i)]) {
                System.out.println(-1);
                return;
            }
        }

        long lcm = lcm(n,m);
        System.out.println(lcm);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }

    private static long lcm(long a, long b) {
        return a / gcd(a,b) * b;
    }
}