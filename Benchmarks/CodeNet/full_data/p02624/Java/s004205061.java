import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
   long n=sc.nextLong();
   long sum=0;
   for(long i=1;i<=n;i++)
   {
       sum=sum+(i*div(i));
   }
   System.out.println(sum);
  }
  
  static long div(long a)
  {
      long count=0;
      for(long i=1;i<=Math.sqrt(a);i++)
      {
          if(a%i==0)
            {
                 if(a/i==i)
                    count=count+1;
                else
                  count=count+2;
            }
      }
       
      return count;
  }
}