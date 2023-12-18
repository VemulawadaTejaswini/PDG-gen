import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    char[] T = scanner.next().toCharArray();
    String min = null;
    for (int i = 0; i < S.length; i++) {
      if (match(S, T, i)) {
        char[] s = new char[S.length];
        for (int j = 0; j < i; j++) {
          if (S[j] == '?') s[j] = 'a';
          else s[j] = S[j];
        }
        for (int j = 0; j < T.length; j++) s[i + j] = T[j];
        for (int j = i + T.length; j < S.length; j++) {
          if (S[j] == '?') s[j] = 'a';
          else s[j] = S[j];
        }
        String ss = new String(s);
        if (min == null || min.compareTo(ss) > 0) min = ss;
      }
    }
    if (min == null) System.out.println("UNRESTORABLE");
    else {
      System.out.println(min);
    }
  }

  private static boolean match(char[] s, char[] t, int p) {
    if (p + t.length > s.length) return false;
    for (int i = 0; i < t.length; i++) {
      if (s[p + i] != '?' && s[p + i] != t[i]) return false;
    }
    return true;
  }
}
