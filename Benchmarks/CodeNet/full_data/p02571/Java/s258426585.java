import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int maxSame = 0;
    for (int i = 0; i < s.length()-t.length()+1; i++) {
      String sPart = s.substring(i, i+t.length());
      int count = 0;
      for (int j = 0; j < t.length(); j++) {
        if (sPart.charAt(j) == t.charAt(j)) count++;
      }
      maxSame = Math.max(maxSame, count);
    }
    System.out.println(t.length() - maxSame);
  }
}
