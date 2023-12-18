import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int  n=in.nextInt();
    String s=in.next();
    String str=in.next();
    for(int i=0;i<n;i++)
    {
      System.out.print(s.charAt(i)+str.charAt(i));
    }
  }
}