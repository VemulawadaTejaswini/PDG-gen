import java.util.Scanner;

public class Main {

    static long mod = 1_000_000_007L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0L;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[1000001];
        for (int i = 0; i < n; i++) {
            int c = a[i];
            int d = (int)Math.sqrt(c) + 1;
            for (int j = 2; j < d; j++) {
                int cnt = 0;
                while(c % j == 0){
                    cnt++;
                    c /= j;
                }
                b[j] = Math.max(b[j], cnt);
            }
            if(1 < c) b[c] = Math.max(b[c], 1);
        }
        long lcm = 1L;
        for (int i = 2; i < 1000001; i++) {
            if(0 < b[i]){
                lcm *= modPow(i, b[i]);
                lcm %= mod;
            }
        }
        for (int i = 0; i < n; i++) {
            ans += lcm * modPow(a[i], (int)mod-2);
            ans %= mod;
        }
        System.out.println(ans);
        sc.close();

    }

    private static long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
    }

}
