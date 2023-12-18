import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static BigInteger gcd(BigInteger a, BigInteger b){
        if(a.mod(b).equals(BigInteger.ZERO))
            return b;
        if(b.mod(a).equals(BigInteger.ZERO))
            return a;
        if(a.compareTo(b)<0)
            return gcd(a,b.mod(a));
        return gcd(b,a.mod(b));
    }
    
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       BigInteger lcm = BigInteger.ONE;
       for(int i=0;i<N;i++){
           BigInteger next = new BigInteger(br.readLine());
           lcm = lcm.multiply(next).divide(gcd(lcm,next));
       }
        System.out.println(lcm);
    }
}
 
