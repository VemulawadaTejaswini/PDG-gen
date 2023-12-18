import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    long  n=s.nextLong();
    long ans=n-1;
    int i=(int)Math.sqrt(n);
    for(;i*i<=n;i++)
    {
       if(n%i==0)
       {
         ans=Math.min(ans,(i+n/i-2));
       }
    }
    System.out.println(ans);
  }
}