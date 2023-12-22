import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
   
    long n=sc.nextLong();
    long m=sc.nextLong();
    long a=m;
    if(m%2==0)
    {
      a=m+1;
    }
    long b=a;
      for(long i=1;i<m/2+1;i++)
        {
          System.out.println(i+" "+a);
        a--;
        
        }
    
    a=n;
      for(long i=m/2+1;i<=m;i++)
      {
        System.out.println((b+1)+" "+a);
        a--;
        b++;
      }
     
  
      
     
  }
}
    