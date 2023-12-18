import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    char[] c = s.toCharArray();
    
    System.out.println(String.valueOf(c[0]) + (s.length() - 2) + String.valueOf(c[s.length()-1]));
  }
}
