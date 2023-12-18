import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static String sort(String s) {
    char[] cs = s.toCharArray();
    Arrays.sort(cs);
    return new String(cs);
  }
  public static boolean check(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;
    return sort(s1).equals(sort(s2));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] s = new String[sc.nextInt()];
    Arrays.setAll(s, i -> sc.next());
    int count = 0;
    for (int i = 0; i < s.length; i++)
      for (int j = 0; j < s.length; j++)
        if (i != j)
          if (check(s[i], s[j]))
            count++;
    System.out.println(count / 2);
  }
}