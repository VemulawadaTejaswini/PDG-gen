import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mod = (int) Math.pow(10,9) + 7;

        if (Math.abs(m-n) > 1) {
            System.out.println(-1);
            return;
        }

        long tmp = calcF(m, mod);
        long tmp2 = calcF(n, mod);
        long res = tmp;
        res *= tmp2;
        res %= mod;
        if (m == n)  {
            res *= 2;
            res %= mod;
        }

        System.out.println(res);
    }

    private static long calcF(int m, int mod) {
        long tmp =1;
        while (m > 0) {
            tmp *= m;
            tmp %= mod;
            m--;
        }
        return tmp;
    }
}