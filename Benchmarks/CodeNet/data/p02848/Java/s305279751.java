import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.next();
    
    String s1 = s.substring(n, s.length());
    String s2 = s.substring(0, n);
    
    System.out.println(s1 + s2);
  }
}