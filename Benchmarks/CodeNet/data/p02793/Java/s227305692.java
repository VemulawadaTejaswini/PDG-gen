import java.util.*;
import java.math.*;
class Main
{
 public static BigInteger gcd(BigInteger x,BigInteger y)
{
 if(y.intValue()==0) 
 return x; 
 return gcd(y,x.remainder(y));
}
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int i,n;
  n=sc.nextInt();
  int[] a=new int[n];
  for(i=0;i<n;i++)
  a[i]=sc.nextInt();
  BigInteger b=new BigInteger("0");
  BigInteger k=new BigInteger("0");
  BigInteger s=new BigInteger("0");
  b=BigInteger.valueOf(a[0]);
  for(i=1;i<n;i++)
  {
   k=BigInteger.valueOf(a[i]);
   b=(b.multiply(k)).divide(gcd(k,b));
  }
  for(i=0;i<n;i++)
  {
   k=BigInteger.valueOf(a[i]);
   s=s.add(b.divide(k));
  }
  s=s.remainder(new BigInteger("1000000007"));
  System.out.print(s);
 }
}