import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();
      int cnt = 0;
      int groupCnt = 0;
      for(int i = 1; i < n; i++) {
        if(s.charAt(i) == s.charAt(i-1)) {
          cnt++;
        } else {
          groupCnt++;
        }
      }
      groupCnt++;
      cnt += Math.min(k, (groupCnt - 1) / 2) * 2;
      k -= (groupCnt - 1) / 2;
      if(groupCnt % 2 == 0 && k > 0) cnt++;

      System.out.println(cnt);
  }
}