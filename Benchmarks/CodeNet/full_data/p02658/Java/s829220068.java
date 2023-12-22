import java.math.*;
import java.util.*;
public class Main
{
        public static void main(String[] args)
        {
            Scanner cin = new Scanner(System.in);
            int T;
            T = cin.nextInt();
            BigInteger ans = BigInteger.valueOf(1);
            for(int i = 1;i <= T;i ++)
            {
                BigInteger m = cin.nextBigInteger();
                //BigInteger n = m.subtract(BigInteger.valueOf(1));
                //BigInteger  ans = m.multiply(n);
                //ans = ans.divide(BigInteger.valueOf(2));
                ans = ans.multiply(m);
            }
            BigInteger t = new BigInteger("1000000000000000000");
            int flag = ans.compareTo(t);
            if(flag <= 0)
            System.out.println(ans);
            else System.out.println("-1\n");
        }
}