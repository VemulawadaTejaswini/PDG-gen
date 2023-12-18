import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        for (int i = 0 ; i < n ; i++) {
            t[i] = sc.nextLong();
        }
        long ans = 1;
        for (int i = 0 ; i < n ; i++) {
            ans = LCM(ans, t[i]);
        }
        System.out.println(ans);

    }
    //ユーグリッド互除法により最大公約数を求める
    private static long GCD(long a, long b) {
        if (a < b) {
            return GCD(b, a);
        }
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    //最小公倍数を求める。
    private static long LCM(long a, long b) {
        long temp = a / GCD(a, b);
        return temp * b;
    }

}