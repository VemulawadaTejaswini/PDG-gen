import java.math.*;
import java.util.*;
public class Main
{
        public static void main(String[] args)
        {
            Scanner cin = new Scanner(System.in);
            int T;
            T = cin.nextInt();
            BigInteger t = new BigInteger("1000000000000000000");
            BigInteger an = BigInteger.valueOf(1);
            for(int i = 1;i <= T;i ++)
            {
                int f;
                BigInteger m = cin.nextBigInteger();
                int s = m.compareTo(BigInteger.valueOf(0));
                if (s == 0)
                {
                    an = BigInteger.valueOf(0);
                }
                f = an.compareTo(t);
                if(s != 0 && flag <= 0)
                an = an.multiply(m);
            }
            int k = an.compareTo(t);
            if(k <= 0)
                System.out.println(ans);
            else System.out.println("-1\n");
        }
}