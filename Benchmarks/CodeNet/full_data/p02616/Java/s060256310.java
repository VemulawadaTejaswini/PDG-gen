import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    
    //HashMap<String,Integer> map=new HashMap<String,Integer>();
    long[] a=new long[n];
    for(int i=0;i<n;i++)
    	a[i]=sc.nextLong();
    Arrays.sort(a);
    int x=0;
    if(k%2!=0)
      x=k-1;
    else
      x=k;
    int b=0,b1=n-1;
    long p=1;
     BigInteger bd = BigInteger.valueOf(1);
  
    
    if(a[n-1]>0)
    {
    while(x>0)
    {
      long c=a[b]*a[b+1];
      long d=a[b1]*a[b1-1];
      if(c>=d)
      {
         bd=bd.multiply( BigInteger.valueOf(c));
        b=b+2;
        x=x-2;
      }
      else
      {
         bd=bd.multiply( BigInteger.valueOf(d));
        b1=b1-2;
        x=x-2;
      }
     
    }
    if(k%2!=0)
       bd=bd.multiply( BigInteger.valueOf(a[b1]));
      System.out.println(bd.mod( BigInteger.valueOf(1000000007)));
    }
    else
    {
      long re=1;
      for(int l=n-1;l>=n-k;l--)
      		 bd=bd.multiply(BigInteger.valueOf(a[l]));
     bd=bd.add(BigInteger.valueOf(1000000007));
      //System.out.println(bd.mod( BigInteger.valueOf(1000000007)));
      System.out.println(bd);
    }
        
  }
 
}