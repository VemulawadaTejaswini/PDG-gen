import java.util.*;
import java.lang.*;
import java.math.BigInteger;
public class Main{
  public static void main(String arg[])
  {
   Scanner sc=new Scanner(System.in);
   Stack<Integer> s=new Stack<>();
  int n=sc.nextInt();
  
 int t=0;
  for(int i=0;i<n;i++)
  {
      int x=sc.nextInt();
      if(s.isEmpty())s.push(x);
      else
      {
          if(x<=s.peek())
          {
            t+=s.peek()-x;  
          }
          else
          {
              while(!s.isEmpty())s.pop();
              s.push(x);
          }
      }
       
  }
      System.out.println(t);
    
  }
}