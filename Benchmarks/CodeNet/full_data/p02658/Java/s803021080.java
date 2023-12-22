import java.io.*;
import java.util.*;
public class Main
{
   
    public static void main(String args[])throws IOException
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        
        long p=1;
      for(int i=0;i<n;i++)
      {
          long a=sc.nextLong();
          if(a==0)
          {          
           p=0;
           break;
          }
          else 
          {
              p=p*a;
              if(p<=(long)Math.pow(10,18))
              {
                  p=-1;
                  break;
              }
          }          
    }
        System.out.println(p);
}
}
 