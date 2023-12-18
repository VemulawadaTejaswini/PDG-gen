import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    int ans = 0;
    int tmpx = x;
    int tmpy = y;
    if((x % 3 == 0 && y % 3 == 0) || (x % 3 == 1 && y % 3 == 2) || (x % 3 == 2 && y % 3 == 1)) {
      int count = 0;
      while(!(tmpx == 0 && tmpy == 0)) {
        if(tmpx >= tmpy) {
          count++;
          tmpx -= 2;
          tmpy -= 1;
        } else {
          tmpx -= 1;
          tmpy -= 2;
        }
      }
      ans = nCk((x + y) / 3, count);
    }
    System.out.println(ans);
  }

  public static int nCk(int n,int k) {
    int M = 1000000007;
    long ret = 1;
    int min = Math.min(k, n-k);
    for(int i=1;i<=min;i++) {
      ret = (long)(ret * (Math.pow(i,M-2) % M)) % M;
    }
    for(int i=n-min+1;i<=n;i++) {
      ret = (ret * i) % M;
    }
    return (int)ret;
  }
}
