import java.util.*;

public class main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    
    t = t.substring(0, t.length()-1);
    
    if(s.equals(t))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}