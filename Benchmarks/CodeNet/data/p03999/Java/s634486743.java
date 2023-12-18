import java.util.*;

public class Main {
  public static String s = "";
  public static int n = 0;

  public static long dfs(int count, String ss) {
    if (count == n) {
      String[] ss_split = ss.split("\\+");
      long sum = 0;
      for (int i = 0; i < ss_split.length; i++) {
        sum += Long.parseLong(ss_split[i]);
      }
      return sum;
    }
    return dfs(count + 1, ss.replaceFirst(" ", "+")) + dfs(count + 1, ss.replaceFirst(" ", ""));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    s = sc.next();
    n = s.length() - 1;
    String s_space = "";
    for (int i = 0; i < s.length() * 2 - 1; i++) {
      if (i % 2 == 1) {
        s_space += " ";
      } else {
        s_space += s.charAt(i / 2);
      }
    }
    System.out.println(dfs(0, s_space));
  }
}
