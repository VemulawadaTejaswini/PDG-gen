import java.util.*;
class Main{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
    int k=in.nextInt();
    int flag=0;
    int a=in.nextInt();
    int b=in.nextInt();
    for(int i=a;i<=b;i++)
    {
      if(i%k==0)
      {
          flag=1;
          break;
      }
    }
    if(flag==1)
      System.out.print("OK");
    else
      System.out.print("NG");
    
    
    
    
    
  }
}