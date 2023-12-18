import java.util.*;
import java.math.*;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    double a=in.nextDouble();
    double b=in.nextDouble();
    double n=in.nextDouble();
    if(n<b)
    {
      double x=Math.floor((a*n)/b);
      System.out.print((int)x);
    }
    if(n>=b && n!=1)
    {
      n=n-1;
      double x=Math.floor((a*n)/b);
      System.out.print((int)x);
    }
  
    else if(n==1)
    {
      double v=Math.floor((a*n)/b)-a*Math.floor(n/b);
       System.out.print((int)v);
    }
    
    
  }
}