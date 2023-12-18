import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    String s = sc.next();
		String t = sc.next();

		if (s.length() < t.length()) {
			out.println("UNRESTORABLE");
			return;
		}

    int i = s.length() - 1;
    int j = t.length() - 1;
    boolean match = false;
    int matchIndex = 0;
    while (i >= 0 && j >= 0) {
      int k = i;
      int l = j;
      while (k >= 0 && l >= 0) {
        if (s.charAt(k) == t.charAt(l) || s.charAt(k) == '?') {
          k--;
          l--;
          if (l == -1) {
            match = true;
            matchIndex = k + 1;
            break;
          }
        } else {
          break;
        }
      }

      if (match) {
        break;
      } else {
        i--;
        j--;
      }
    }

    char[] c = new char[s.length()];
    if (match) {
      for (int k = 0; k < matchIndex; k++) {
        if (s.charAt(k) == '?') {
          c[k] = 'a';
        } else {
          c[k] = s.charAt(k);
        }
      }
      for (int k = matchIndex; k < matchIndex + t.length(); k++) {
        c[k] = t.charAt(k - matchIndex);
      }
      for (int k = matchIndex + t.length(); k < s.length(); k++) {
        if (s.charAt(k) == '?') {
          c[k] = 'a';
        } else {
  				c[k] = s.charAt(k);
				}
      }
			out.println(new String(c));
    } else {
      out.println("UNRESTORABLE");
    }
  }
}
