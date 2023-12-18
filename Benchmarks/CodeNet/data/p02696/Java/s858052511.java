
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long N = in.nextLong();
        BigInteger max = new BigInteger("0");
        for(long i = B-1; i <= N; i+=B){
            BigInteger t = f(i,A,B);
            if(t.compareTo(max)>0){
                max = t;
            }
        }
        System.out.print(max);
    }
    public static BigInteger f(long x,long A, long B){
        BigInteger a = new BigInteger(String.valueOf((long)Math.floor((double)x*A/(double) B)));
        BigInteger b = new BigInteger(String.valueOf((long)Math.floor((double)x/(double) B)));
        b = b.multiply(new BigInteger(String.valueOf(A)));
        return a.subtract(b);
    }

}