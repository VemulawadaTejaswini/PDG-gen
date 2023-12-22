import java.util.Scanner;
public class sol
{
  public static void main(String args[])
  {
    int c,i;
    String s=sc.next();
    c=0;
    String str [] = s.split('S',-1);
    for(i=0;i<str.length;i++)
    {
      if(str[i].length()>c)
      c=str[i].length();
    }
    System.out.println(c);
  }
}