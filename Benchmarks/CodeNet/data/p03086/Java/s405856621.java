import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String str = in.nextLine();
    int max = 0;
    char h;
    String ans = "";
    for (int i = 0; i < str.length(); i++) {
      h = str.charAt(i);
      if (h == 'A' | h == 'T' | h == 'C' | h == 'G' && i != str.length() -1) {
        sb.append(h);
      } else {
        if (h == 'A' | h == 'T' | h == 'C' | h == 'G' && i == str.length() -1) {
          sb.append(h);
          if (max < sb.length()) {
          	max = sb.length();
          	ans = sb.toString();
          }
        }
          
        if (max < sb.length()) {
          max = sb.length();
          ans = sb.toString();
        }
        sb.delete(0, sb.length());
      }
    }
    System.out.println(ans);
  }
}