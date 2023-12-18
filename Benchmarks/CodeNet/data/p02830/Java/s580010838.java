import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      String s = sc.next();
      String t = sc.next();
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < n; i++) {
        sb.append(s.charAt(i));
        sb.append(t.charAt(i));
      }
      System.out.println(sb.toString());
    } finally {
      sc.close();
    }
  }
}