import java.util.*;

public class Main {

    static long MOD = 1_000_000_007;

    static int n;
    static char[] l;
    static long[] a;
    static long[] b;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        l = sc.next().toCharArray();
        n = l.length;
        a = new long[n];
        b = new long[n];
        Arrays.fill(a, -1);
        Arrays.fill(b, -1);

        System.out.println(calc(0, true));

    }

    static long calc(int depth, boolean exact) {

        if(depth == n) return 1;

        long res = 0;
        if(exact && a[depth] >= 0) {
            return a[depth];
        }
        if(!exact && b[depth] >= 0) {
            return b[depth];
        }

        if(exact) {
            if(l[depth] == '1') {
                res += calc(depth+1, true) * 2 + calc(depth+1, false);
            } else {
                res += calc(depth+1, true);
            }
            a[depth] = res % MOD;
        } else {
            res += calc(depth+1, false) * 3;
            b[depth] = res % MOD;
        }

        return res % MOD;
    }

}
