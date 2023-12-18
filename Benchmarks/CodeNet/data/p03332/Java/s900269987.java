import java.util.*;

class Main
{
    static int MOD = 998244353;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long K = sc.nextLong();
        long ans = 0;
//        long yy = Math.max(K / n - B , 0);
//        long xx = Math.min(n, K / A); 
        for(long x = 0; x <= n; x++){
            long q = K - A * x;
            if(q % B == 0 && 0 <= q && q <= B * n){
                long y = q / B;
                ans = (ans + calc(n, x) * calc(n, y) % MOD) % MOD;
            }
        }
        System.out.println(ans);
    }
    public static long calc(int n, long a)
    {
        long MulSumN = 1;
        long MulSumA = 1;
        for(int i = 1; i <= a; i++){
            MulSumN *= n - i + 1;
            MulSumN %= MOD;
            MulSumA *= i;
            MulSumA %= MOD;
        }
        return MulSumN * pow(MulSumA, MOD - 2) % MOD;
    }
    public static long pow(long a, int b){
        if(b == 1) return a;
        if(b % 2 == 0){
            long d = pow(a, b / 2);
            return d * d % MOD;
        }
        return a * pow(a, b - 1) % MOD;
    }
}