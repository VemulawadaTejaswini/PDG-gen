import java.math.BigDecimal;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        a[0] = -1;
        for (int i = 1;i<=n;++i) a[i] = sc.nextLong();
        sc.close();

        //long sum = 0;
        long lmod = (long)Math.pow(10,9) + 7;
        BigDecimal mod = new BigDecimal(lmod);
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1;i<=n;++i)
        {
            for (int j = i+1;j<=n;++j)
            {
                //System.err.println(a[i] + "*" +  a[j] + " = " + (a[i] * a[j]) % mod);
                //sum += (a[i] * a[j]) % mod;
                BigDecimal e1 = new BigDecimal(a[i]);
                BigDecimal e2 = new BigDecimal(a[j]);
                BigDecimal result = e1.multiply(e2);
                BigDecimal result2 = result.remainder(mod);
//                long l = result2.longValue();
//                System.err.println(l);
                sum = sum.add(result);
            }
        }

        //System.out.println(sum);
        System.out.println(sum.remainder(mod));

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}