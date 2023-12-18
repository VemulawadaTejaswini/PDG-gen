import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        BigInteger ansb=pow(2,n);
        ansb=ansb.subtract(frac(n).divide(frac(a)).divide(frac(n-a)));
        ansb=ansb.subtract(frac(n).divide(frac(b)).divide(frac(n-b)));
        ansb=ansb.add(BigInteger.valueOf(-1));
        int ans=divq(ansb,1000000007);
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
        static BigInteger pow(int a,int b){
        BigInteger result=BigInteger.valueOf(1);
        for (int i=1;i<=b;i++){
            result=result.multiply(BigInteger.valueOf(a));
        }
        return result;
    }
    static int divq(BigInteger a,int b){
        BigInteger r=a.divide(BigInteger.valueOf(b));
        r=a.subtract(r.multiply(BigInteger.valueOf(b)));
        return r.intValue();
    }

}