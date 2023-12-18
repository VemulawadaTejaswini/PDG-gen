import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        BigInteger ansa=BigInteger.valueOf(2).pow(n);
        BigInteger ansb=frac(n).divide(frac(a)).divide(frac(n-a));
        BigInteger ansc=frac(n).divide(frac(b)).divide(frac(n-b));        
        ansa=ansa.subtract(ansb).subtract(ansc).subtract(BigInteger.valueOf(1));
        ansa=ansa.mod(BigInteger.valueOf(1000000007));
        int ans =ansa.intValue();
        System.out.println(ans);
    }
    static long adjust(long a){
        long q=a/1000000007;
        return (a-q*1000000007);
    }
    static BigInteger frac(int a){
        BigInteger result=BigInteger.valueOf(1);
        for (int i=2;i<=a;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static int divq(BigInteger a,int b){
        BigInteger r=a.divide(BigInteger.valueOf(b));
        r=a.subtract(r.multiply(BigInteger.valueOf(b)));
        return r.intValue();
    }

}