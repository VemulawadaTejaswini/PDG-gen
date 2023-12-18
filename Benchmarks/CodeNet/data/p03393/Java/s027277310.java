import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if (S.length() == 26) {
      String ans = "-1";
      boolean[] available = new boolean[26];
      for (int i = 25; i >= 0; i--) {
        char c = S.charAt(i);
        available[c-'a'] = true;
        char next = 'X';
        for (int j = c-'a'+1; j < 26; j++) {
          if (available[j]) {
            next = (char)('a'+j);
            break;
          }
        }
        if (next != 'X') {
          ans = S.substring(0, i)+next;
          break;
        }
      }
      System.out.println(ans);
    } else {
      boolean[] used = new boolean[26];
      for (int i = 0; i < S.length(); i++) {
        used[S.charAt(i)-'a'] = true;
      }
      char unused = 'X';
      for (int i = 0; i < 26; i++) {
        if (!used[i]) {
          unused = (char)('a'+i);
          break;
        }
      }
      System.out.println(S+unused);
    }
  }
}