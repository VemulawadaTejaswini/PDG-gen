import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String inverse = "";
    int l=S.length();
    for(int i = l - 1; i >= 0; i--) {
      inverse += String.valueOf(S.charAt(i));
    }
    String s1 = "maerd";
    String s2 = "remaerd";
    String s3 = "esare";
    String s4 = "resare";
    String ans = "YES";
    for(int i = 0; i < l;) {
      if((i + 5 <= l) && (s1.equals(inverse.substring(i, i + 5)))) {
        i += 5;
      } else if((i + 7 <= l) && (s2.equals(inverse.substring(i, i + 7)))) {
        i += 7;
      } else if((i + 5 <= l) && (s3.equals(inverse.substring(i, i + 5)))) {
        i += 5;
      } else if((i + 6 <= l) && (s4.equals(inverse.substring(i, i + 6)))) {
        i += 6;
      } else {
        ans = "NO";
        break;
      }
    }
    System.out.println(ans);
  }
}