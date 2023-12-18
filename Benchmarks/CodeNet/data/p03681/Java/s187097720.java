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

        long res = 0;
        if (m == n) {
            res = 2;
            long tmp = calcF(m, mod);
            res = res * tmp % mod;
            res = res * tmp % mod;
        } else {
            long tmp = calcF(m, mod);
            long tmp2 = calcF(n, mod);
            res = res * tmp % mod;
            res = res * tmp2 % mod;
        }
        System.out.println(res);
    }

    private static long calcF(int m, int mod) {
        long tmp =1;
        while (m > 0) {
            tmp = tmp * m % mod;
            m--;
        }
        return tmp;
    }
}