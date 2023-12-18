import java.util.*;

public class Main{
    static int MOD = (int)1e9+7;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int[] div = new int[n];

        long lcm = arr[0];
        for (int i=1; i<n; i++){
            lcm = lcm(lcm, arr[i]);
        }

        long ans = 0;

        for (int i=0; i<n; i++){
            ans += lcm/arr[i];
            ans %= MOD;
        }

        System.out.println(ans);
    }
    public static long lcm(long m, long n){
        return m*n/gcd(m, n);
    }

    public static long gcd(long m, long n){
        if (m<n) return gcd(n, m);
        if (n==0) return m;
        return gcd(n, m%n);
    }
}