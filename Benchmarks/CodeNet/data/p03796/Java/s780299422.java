import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        BigInteger a = new BigInteger("1");
        for(long i = 1;i<=n;i++){
            a = a.multiply(new BigInteger(String.valueOf(i)));
        }
            if(a.compareTo(new BigInteger("1000000007")) > 0){
                a = a.remainder(new BigInteger("1000000007"));
            }
        System.out.println(a);
    }
}