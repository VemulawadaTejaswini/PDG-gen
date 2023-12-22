import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] cSum = new long[n+1];
        cSum[0] = 0;
        for (int i = 0;i<n;++i)
        {
            a[i] = sc.nextLong();
            cSum[i+1] = cSum[i] + a[i];
        }
        sc.close();

        cSum[n] = cSum[n-1] + a[n-1];
        //for (int i = 0;i<cSum.length;++i) System.err.println(cSum[i]);

        long sum = 0;
        long mod = (long) Math.pow(10,9)+7;

        for (int i = 0;i<n;++i)
        {
            sum += a[i] * (cSum[n] - cSum[i+1]);
        }

        System.out.println(sum%mod);
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}