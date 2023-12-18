import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        final long limit = (int)(Math.pow(10,9) + 7);
        BigInteger res;

        int sub = Math.abs(n -m);

        if(sub >= 2)
            res = BigInteger.ZERO;
        else if(n == m)
            res = (BigInteger.valueOf(2).multiply(kaijo(n)).multiply(kaijo(m))).mod(new BigInteger(String.valueOf(limit)));
        else
            res = (kaijo(n).multiply(kaijo(m))).mod(new BigInteger(String.valueOf(limit)));

        System.out.println(res);
    }
    public static BigInteger kaijo(int n)
    {
        BigInteger tmp = BigInteger.ONE;
        for(int i = 2;i <= n;i++)
            tmp = tmp.multiply(new BigInteger(String.valueOf(i)));
        return tmp;
    }
}
