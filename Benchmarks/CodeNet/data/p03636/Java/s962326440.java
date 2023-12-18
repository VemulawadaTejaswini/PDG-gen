import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    String s1 = s.substring(0,1);
    String s2 = s.substring(s.length() - 1);
    
    int n = (s.length()-2);
    
    System.out.println(s1+n+s2);
  }
}