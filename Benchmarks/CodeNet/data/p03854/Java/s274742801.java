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
    String ans = "YES";
    int pos = 0;
    while(pos < S.length()) {
      String str5;
      String str6;
      String str7;
      char c = inverse.charAt(pos);
      if(pos + 5 <= S.length()) {
        str5 = inverse.substring(pos, pos + 5);
      }
      if(pos + 6 <= S.length()) {
        str6 = inverse.substring(pos, pos + 6);
      }
      if(pos + 7 <= S.length()) {
        str7 = inverse.substring(pos, pos + 7);
      }
      if((pos + 5 <= S.length()) && (s1.equals(str5))) {
        pos += 5;
      } else if((pos + 7 <= S.length()) && (s2.equals(str7))) {
        pos += 7;
      } else if((pos + 5 <= S.length()) && (s3.equals(str5))) {
        pos += 5;
      } else if((pos + 6 <= S.length()) && (s4.equals(str6))) {
        pos += 6;
      } else {
        ans = "NO";
        break;
      }
    }
    System.out.println(ans);
  }
}
