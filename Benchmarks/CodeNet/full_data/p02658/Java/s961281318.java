import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        long[] a=new long[n];
        BigInteger s=new BigInteger("1");
        for(i=0;i<n;i++)
        {
         a[i]=sc.nextLong();
         s=s.multiply(BigInteger.valueOf(a[i]));
        }
        if(s.compareTo(new BigInteger("1000000000000000000"))>0)
        System.out.println("-1");
        else
        System.out.println(s);
        //System.out.println("XXXXXXXX");
    }
}