import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0;i<n;++i) a[i] = sc.nextLong();
        sc.close();

        long ans = 0;
        long mod = (long) Math.pow(10,9)+7;

        long x = 0;
        for (int i = 0;i<n;++i)
        {
            ans += (a[i]%mod) * x;
            ans %= mod;
            x += (a[i]%mod);
        }

        System.out.println(ans);
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}