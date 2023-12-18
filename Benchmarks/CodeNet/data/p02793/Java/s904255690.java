package abc152.e;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a[] = new BigInteger[n];
        BigInteger Lcm = BigInteger.ONE;
        for(int i=0;i<n;i++){
            a[i]= BigInteger.valueOf(sc.nextLong());
            Lcm = Lcm.multiply(a[i]).divide(Lcm.gcd(a[i]));
    
        }
        BigInteger ans = BigInteger.ZERO;
        for(int i=0;i<n;i++){
            ans = ans.add(Lcm.divide(a[i]));
            
        }
        System.out.println(ans.mod(BigInteger.valueOf(1000000007)));
        
    }

    
}