import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   
  int n=sc.nextInt();
  
  int min=0;
  int max=Integer.MIN_VALUE;
  for(int i=0;i<n;i++)
  {
      int x=sc.nextInt();
     if(i==0)min=x;
     else
     {
         if(x>=min)
             max=Math.max(x-min,max);
     }
     min=x;
       
  }
      System.out.println(max);
    
  }
}