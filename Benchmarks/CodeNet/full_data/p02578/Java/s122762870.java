import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   
  int n=sc.nextInt();
  int min=Integer.MAX_VALUE;
  int max=Integer.MIN_VALUE;
  for(int i=0;i<n;i++)
  {
      int x=sc.nextInt();
      max=Math.max(max,x);
      min=Math.min(min,x);
      
  }
      System.out.println(max-min);
    
  }
}