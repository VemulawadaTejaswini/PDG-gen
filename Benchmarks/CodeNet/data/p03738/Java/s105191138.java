import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String a = scanner.next();
      String b = scanner.next();
      int n = a.length();
      int m = b.length();
      char s = a.charAt(0);
      char t = b.charAt(0);

      if (a.equals(b)) {
        System.out.println("EQUAL");
        return;
      }
      
      if (!show(n,m)) show(s,t);
    } finally {
      scanner.close();
    }
  }
  
  private static boolean show(int a, int b) {
    if (a > b) {
      System.out.println("GREATER");
      return true;
    } else if (a < b) {
      System.out.println("LESS");
      return true;
    } else {
      return false;
    }
  }
}