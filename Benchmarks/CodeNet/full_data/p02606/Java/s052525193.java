import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int l=in.nextInt();
    int d=in.nextInt();
    int a=d;
    d=r%d;
    r=r+d;
    if(a>l)
    {
      System.out.println("0");
    }
    else if(r>l)
    {
      System.out.println("1");
    }
    else
    {
      int c=0;
      c++;
      c=c+((l-r)/a);
      System.out.println(c);
    }
  }
}