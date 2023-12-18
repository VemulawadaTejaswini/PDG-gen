import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String Sd = sc.next();
    String T = sc.next();
    
    String ans = "UNRESTORABLE";
    for (int i = Sd.length() - T.length(); i >= 0; i--) {
      if (match(Sd, i, T)) {
        ans = fill(Sd, i, T);
        break;
      }
    }
    
    System.out.println(ans);
  }
  
  private static boolean match(String Sd, int i, String T) {
    for (int j = 0; j < T.length(); j++) {
      char c = Sd.charAt(i+j);
      if (c != T.charAt(j) && c != '?') {
        return false;
      }
    }
    return true;
  }
  
  private static String fill(String Sd, int i, String T) {
    StringBuilder builder = new StringBuilder();
    for (int j = 0; j < Sd.length(); j++) {
      if (i <= j && j < i + T.length()) {
        builder.append(T.charAt(j-i));
      } else {
        char c = Sd.charAt(j);
        if (c == '?') {
          builder.append("a");
        } else {
          builder.append(c);
        }
      }
    }
    return builder.toString();
  }
}