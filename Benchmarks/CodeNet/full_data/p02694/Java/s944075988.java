import java.util.*;
import java.lang.Math; 
public class sum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   int n,a,b,ans=0;
    n=sc.nextInt();
    a=Math.log(n/100);
    b=Math.log(101/100);
    ans=a/b;
    System.out.println(round(ans));
  }
}
    