import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int gcd = gcd(n,m);
        int lcm = lcm(n,m);
        for (int i = 0; i < gcd; i++) {
            if (s[n/gcd*i] != t[m/gcd*i]) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(lcm);
    }

    private static int gcd(int a, int b) {
        int r;
        while( (r = a % b) != 0 ) {
            a = b;
            b = r;
        }
        return b;
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
}