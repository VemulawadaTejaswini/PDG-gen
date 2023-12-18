import java.util.*;
import java.util.Arrays;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.next();
    
    int count = s.length() - s.replace("ABC", "").length();
    
    
    System.out.println( count / 3 );
    
  }
}