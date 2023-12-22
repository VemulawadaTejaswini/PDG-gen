import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
  public static void main(String []args)
  {
  Scanner sc = new Scanner(System.in);
    long n=sc.nextLong();
    long total=1;
    long num;
    for(int i=1;i<=n;i++)
    {
      num=sc.nextLong();
      if(num==0)
        total=0;
      else if(total!=0)
        total*=num;      
    //   else
    //   {
    //     total=-1;
        
    //   }
    }
    
   if((total)>(long)Math.pow(10,18))
     System.out.println(-1);
    else
    System.out.println(total);
    
  }
  
}
