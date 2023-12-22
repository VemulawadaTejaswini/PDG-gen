import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     if(sc.hasNextInt()) 
      {
          long n=sc.nextLong();
          int x=sc.nextInt();
          int m=sc.nextInt();
          deployE obj=new deployE();
          obj.solve(n,x,m);
      }
        
  }
    
}
class deployE
{
    public void solve(long n,int x,int m)
    {
        BigInteger sum=new BigInteger("1");
        sum=sum.add(BigInteger.valueOf(x));
        BigInteger prev=new BigInteger("1");
        prev=prev.add(BigInteger.valueOf(x));
//        long prev=x;
        for(long i =0L ;i<n-1L;i++)
        {
            prev=(prev.multiply(prev)).mod(BigInteger.valueOf(m));
            sum=sum.add(prev);
//            System.out.println(prev);
        }
        System.out.println(sum);
    }
    
}
