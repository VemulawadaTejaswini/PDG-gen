import java.util.*;
class Main
{
    static long MOD = (long) Math.pow(10, 9) + 7;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] p = fact(m);
        long ans = 1;
        for(int i = 0; i < p.length; i++){
            ans *= aHb(p[i], n);
            ans %= MOD;
        }
        System.out.println(ans);
    }
    static int[] fact (int M)
    {
        int[] res = new int[30];
        int index = 0;
        for(int i = 2; i <= M; i++){
            boolean flag = true;
            while(flag){
                if(M % i == 0){
                    res[index]++;
                    M /= i;
                }
                else{
                    flag = false;
                }
            }
            if(res[index] > 0) index++;
        }
        int[] ans = new int[index];
        for(int i = 0; i < index; i++) ans[i] = res[i];
        return ans;
    }
    static long aHb (long a, long b)
    {
        long x = a + b - 1;
        long y = b - 1;
        long MulSum = 1, DivSum = 1;
        for(int i = 1; i <= y; i++){
            MulSum *= x - i + 1;
            MulSum %= MOD;
            DivSum *= i;
            DivSum %= MOD;
        }
        return MulSum * pow(DivSum, MOD - 2) % MOD;
    }
   static long pow(long a, long b)
    {
        if(b == 0) return 1;
        if(b % 2 == 0){
            long d = pow(a, b / 2);
            return d * d % MOD;
        }
        else return  a *  pow(a, b - 1) % MOD;
    }
 }


