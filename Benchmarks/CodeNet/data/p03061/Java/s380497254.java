import java.util.*;
import java.util.stream.IntStream;
import java.math.BigInteger;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int gcd1 = 0;
        int gcd_max = 0;
        for(int i =0; i<n; i++){
            int cp = a[i]; 
            a[i] = 0;
            gcd1 = IntStream.of(a)
            .mapToObj(BigInteger::valueOf) 
            .reduce(BigInteger::gcd) 
            .orElse(BigInteger.ZERO) 
            .intValue();
            gcd_max = Math.max(gcd_max,gcd1);
            a[i] = cp;
        }
        System.out.println(gcd_max);
    }
}