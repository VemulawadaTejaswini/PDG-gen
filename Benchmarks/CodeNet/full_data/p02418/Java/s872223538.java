import java.util.Scanner;
public class Main {

  public static boolean search(String ring, String pattern, int i) {
    int j = 1;
    i = (i + 1) % ring.length();
    while (j < pattern.length()) {
      if (ring.charAt(i) != pattern.charAt(j))
        return false;
      i = (i + 1) % ring.length();
      j++;
    }
    return true;
  }

  public static String patternInRing(String ring, String pattern) {
    int i = 0;
    boolean found = false;
    while (i < ring.length()) {
      if (ring.charAt(i) == pattern.charAt(0)) {
        if(search(ring, pattern, i))
          return "Yes";
      }
      i++;
    }
    return "No";
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String ring = s.next();
    String pattern = s.next();
    System.out.println(patternInRing(ring, pattern));
    s.close();
  }
}

