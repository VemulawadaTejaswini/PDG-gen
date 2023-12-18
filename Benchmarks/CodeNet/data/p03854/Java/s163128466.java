import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String inverse = "";
    for(int i = S.length() - 1; i >= 0; i--) {
      inverse += String.valueOf(S.charAt(i));
    }
    String s1 = "maerd";
    String s2 = "remaerd";
    String s3 = "esare";
    String s4 = "resare";
    int pos = 0;
    String ans = "YES";
    while(pos < S.length()) {
      if((pos + 5 <= S.length()) && (s1.equals(S.substring(pos, pos + 5)))) {
        pos += 5;
      } else if((pos + 7 <= S.length()) && (s2.equals(S.substring(pos, pos + 7)))) {
        pos += 7;
      } else if((pos + 5 <= S.length()) && (s3.equals(S.substring(pos, pos + 5)))) {
        pos += 5;
      } else if((pos + 6 <= S.length()) && (s4.equals(S.substring(pos, pos + 6)))) {
        pos += 6;
      } else {
        ans = "NO";
        break;
      }
    }
    System.out.println(ans);
  }
}