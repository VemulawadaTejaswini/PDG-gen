import java.util.*;
import java.text.*;

public class Main {
    static long n;
    static int ans;
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      n = sc.nextLong();

      dfs(0);

      System.out.println(ans);
    }
    public static void dfs(long x) {
      if (x > n) {
        return;
      }
      String x_str = String.valueOf(x);
      if(x_str.contains("7") && x_str.contains("5") &&x_str.contains("3")) {
        ans++;
      }
      dfs(10 * x + 7);
      dfs(10 * x + 5);
      dfs(10 * x + 3);
    }
}