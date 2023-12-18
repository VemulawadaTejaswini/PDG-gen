import java.util.*;
public class Main{
  static int dp[];
  static List<Integer> list[];
  static int solve(int i){
    int ret = 0;
    if (dp[i] != - 1) return dp[i];
    else{
      for (int j = 0; j < list[i].size(); j++) {
        ret = Math.max(ret, solve(list[i].get(j)) + 1);
//        System.out.println(ret + " ret inside");
      }
    }
    return dp[i] = ret;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    list = new LinkedList[n + 1];
    for (int i = 0; i <= n; i++)
      list[i] = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      list[sc.nextInt()].add(sc.nextInt());
    }
    int ret = 0;
    dp = new int[n + 1];
    Arrays.fill(dp, -1);
    for (int i = 1; i <= n; i++){
      ret = Math.max(ret, solve(i));
//      System.out.println(ret + " ret");
    }
    System.out.println(ret);
  }
}
