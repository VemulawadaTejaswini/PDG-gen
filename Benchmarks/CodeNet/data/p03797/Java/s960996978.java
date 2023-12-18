import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
import static java.lang.System.*;
public class Main
{
public static void main(String args[])throws Exception
{
     Scanner sc=new Scanner(in);
     int n=sc.nextInt();
      int m=sc.nextInt();
      int sum=Math.min(n,m/2);
      n-=sum;
      m-=2*sum;
      if(m>0)
      sum+=m/4;
      out.println(sum);
     }
}