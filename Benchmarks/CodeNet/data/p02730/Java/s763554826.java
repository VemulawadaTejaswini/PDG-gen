import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String S=in.nextLine();String p="",b="";
    int N=S.length();
    StringBuffer br=new StringBuffer(S);
    if(S.reverse().compareTo(S)=0)
    {
      p=S.substring(0,(N-1)/2);
      StringBuffer k=new StringBuffer(p);
      if(p.reverse().compareTo(p)==0)
      {
        b=S.substring((N-1)/2)-1));
        StringBuffer f=new StringBuffer(b);
        if(b.reverse().compareTo(b)==0)
          System.out.println("YES");
        else
          System.out.println("NO");
      }
      else
        System.out.println("NO");
    }
    else
      System.out.println("NO");
  }
}
}