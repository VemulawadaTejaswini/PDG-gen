import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
public class Main {

  public static int dp(int[] memo, int n) {
    Arrays.fill(memo, 0);
    if (n<=1) return 1;
    memo[0] = memo[1] = 1;
    for (int i=2; i<=n; i++)
      memo[i] = memo[i-1] + memo[i-2];
    return memo[n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int memo[] = new int[n+1];
    System.out.println(dp(memo, n));
  }
}