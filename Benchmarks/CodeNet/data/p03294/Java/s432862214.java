import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        long LCM = a[0];
        for(int i = 1; i < n; i++){
            LCM = lcm(LCM, a[i]);
        }
        LCM -= 1;
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += LCM % a[i];
        }
        System.out.println(ans);
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
        private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}
