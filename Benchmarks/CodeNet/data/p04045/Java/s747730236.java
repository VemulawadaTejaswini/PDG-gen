import java.util.*;

public class Main {
  static ArrayList<String> use;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int k = sc.nextInt();
    int[] num = new int[10];
    for(int i = 0; i < k; i++) {
      num[sc.nextInt()]++;
    }
    use = new ArrayList<String>();
    for(int i = 0; i < 10; i++) {
      if(num[i] == 0) use.add(String.valueOf(i));
    }
    int ans = 999999;
    int len = n.length();
    String a1 = "";
    for(int i = 0; i <= len; i++) {
      if(i == 0) {
        if((use.get(0)).equals("0")) {
          a1 += use.get(1);
        } else {
          a1 += use.get(0);
        }
      } else {
        a1 += use.get(0);
      }
    }
    int b1 = Integer.parseInt(a1);
    ans = Math.min(ans, b1);
    ans = Math.min(ans, dfs(n));
    System.out.println(ans);
  }

  public static int dfs(String str) {
    int ret = Integer.MAX_VALUE;
    int dd = Integer.parseInt(String.valueOf(str.charAt(0)));
    for(int i = 0; i < use.size(); i++) {
      int c = Integer.parseInt(use.get(i));
      String cc = "99999999";
      if(c == dd) {
        if(str.length() == 1) {
          cc = use.get(i);
        } else {
          cc = use.get(i) + str.substring(1);
        }
      } else if(c > dd) {
        cc = use.get(i);
        for(int j = 1; j < str.length(); j++) {
          cc += use.get(0);
        } 
      }
      ret = Math.min(ret, Integer.parseInt(cc));
    }
    return ret;
  }
}