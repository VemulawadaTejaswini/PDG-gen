import java.math.BigDecimal;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        if (x == d)
        {
            if (k == 1) System.out.println(0);
            else System.out.println(x);
            System.exit(0);
        }
//        if (x >= k*d) System.out.println(x-(k*d));
//        else
//        {
//            long tmp = x/d;
//            long tmp1 = Math.abs(x-(d*tmp));
//            long tmp2 = Math.abs(x-(d*(tmp+1)));
//            if (tmp+1 >= k) System.out.println(tmp2);
//            else System.out.println(Math.min(tmp1,tmp2));
//        }

        BigDecimal bx = new BigDecimal(x);
        BigDecimal bk = new BigDecimal(k);
        BigDecimal bd = new BigDecimal(d);

        if (bx.compareTo(bk.multiply(bd)) >= 0) System.out.println(bx.subtract(bd.multiply(bk)));
        else
        {
            long tmp = x/d;
            BigDecimal tmp1 = bx.subtract(bd.multiply(new BigDecimal(tmp))).abs();
            BigDecimal tmp2 = bx.subtract(bd.multiply(new BigDecimal(tmp+1))).abs();
            if (tmp+1 >= k) System.out.println(tmp2);
            else
            {
                if (tmp1.compareTo(tmp2) >= 0) System.out.println(tmp2);
                else System.out.println(tmp1);
            }
        }
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}