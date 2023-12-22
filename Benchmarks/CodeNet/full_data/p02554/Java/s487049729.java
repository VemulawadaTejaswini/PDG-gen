import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        final long MOD = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //----------------------------------------
        long ans = ( powmod(10,n) - powmod(9,n) )%MOD;
        ans = (ans - powmod(9,n) )%MOD;
        ans = ( ans + powmod(8,n))%MOD;

        ans = (ans+MOD)%MOD;
        System.out.println(ans);

        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }

    public static long powmod(long x, long y)
    {
        long ret = 1;
        long MOD = (long)Math.pow(10,9)+7;
        for (int i = 0;i<y;++i)
        {
            ret = ret * x % MOD;
        }
        return ret;
    }
}