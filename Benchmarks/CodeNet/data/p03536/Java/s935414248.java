import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] h = new long[n];
    long[] p = new long[n];
    long[][] s = new long[n][2];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextLong(); 
      p[i] = sc.nextLong();
      s[i][0] = i;
      s[i][1] = h[i] + p[i]; 
    }
    Arrays.sort(s, new Comparator<long[]>() {
	public int compare(long[] s1, long[] s2) {
		return (int)(s1[1] - s2[1]);
	}
    });
    long[] dp = new long[n + 1];
    dp[1] = p[(int)s[0][0]];
    long[] t = new long[n + 1];
    t[1] = p[(int)s[0][0]];
    for(int i = 2; i < n + 1; i++) {
      dp[i] = (long)Math.pow(10, 16);
      t[i] = (long)Math.pow(10, 16);
    }
    for(int i = 1; i < n; i++) {
      int index = (int)s[i][0];
      for(int j = 1; j < n + 1; j++) {
        if(t[j - 1] > h[index]) {
        } else {
          dp[j] = Math.min(dp[j], t[j - 1] + p[index]);
        }
      }
      for(int j = 1; j < n + 1;j j++) {
        t[j] = dp[j];
      }
    }
    int ans = 1;
    for(int j = n; j >= 0; j--) {
      if(dp[j] < (long)Math.pow(10, 16)) {
        ans = j;
        break;
      } 
    }
    System.out.println(ans);
  }
}