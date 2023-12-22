import java.util.Scanner;
public class Main {

  /*
  public static boolean find(String w, String t, int i) {
    int j = 0;
    while (j < w.length()) {
      if (i >= t.length())
        return false;
      if (w.charAt(j) != t.charAt(i))
        return false;
      i++;
      j++;
    }
    return true;
  }

  public static int count(String w, String t) {
    t = t.toLowerCase();
    int i = 0;
    int count = 0;
    boolean found = false;
    while (i < t.length()) {
      if (t.charAt(i) == w.charAt(0)) {
        found = find(w, t, i);
        if (find(w, t, i))
          count++;
      }
      i++;
    }
    return count;
  }
  */

  public static int count(String w, String t) {
    t = t.toLowerCase();
    t = t.replaceAll("[^a-z]", " ");
    String[] tAry = t.split(" ");
    int count = 0;
    for (String word : tAry) {
      if (word.equals(w))
        count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String w = s.next();
    String line = s.nextLine();
    int count = 0;
    while (!line.equals("END_OF_TEXT")) {
      count += count(w, line);
      line = s.nextLine();
    }
    System.out.println(count);
    s.close();
  }

}

