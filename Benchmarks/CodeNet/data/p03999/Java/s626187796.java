import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();

    sc.close();
    
    long result = dfs(S,0);

    System.out.println(result);

  }

  public static long dfs (String S, int depth) {

    if (depth == S.length() - 1) {

      // + 区切って配列に入れる
      String[] s = S.split("\\+");
      
      long sum = 0;

      for (int i = 0; i < s.length; i++) {
        sum += Long.parseLong(s[i]);
      }

      return sum;
    
    }

    long sum = 0;
    
    // +を入れない
    sum += dfs(S, depth + 1);

    // +を入れる
    S = S.substring(0, depth + 1) + "+" + S.substring(depth + 1);

    sum += dfs(S, depth + 2);

    return sum;

  }

}