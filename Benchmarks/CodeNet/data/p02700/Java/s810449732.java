import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
     int b=in.nextInt();
     int c=in.nextInt();
     int d=in.nextInt();
    int flag=0;
    while(flag==0)
    {
       if(c-b<=0)
       {
         System.out.print("Yes");
         flag=1;
       }
       else
         c=c-b;
      if(flag==0 && (a-d)<=0)
      {
        flag=1;
        System.out.print("No");
      }
      else
        a=a-d;
    }
    
      
      
      
    
    
    
    
  }
}