import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=in.nextInt();
    int s=0;
    s= x==1 ? s+300000: x==2 ? s+200000:s+100000;
    s= y==1 ? s+300000: y==2 ? s+200000:s+100000;
    if(s==300000+300000)
    {
      System.out.println(s+400000);
    }
    else
    {
      System.out.println(s);
    }
  }
}
 
   