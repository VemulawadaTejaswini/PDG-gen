import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
    List<String> list = Arrays.asList(s);
    int count = 0;
    for (int i = 0; i < list.size(); i++)
      for (int j = i + 1; j < list.size(); j++)
        if (i != j)
          if (check(list.get(i), list.get(j)))
            count++;
    System.out.println(count);
  }
}