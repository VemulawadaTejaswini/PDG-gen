import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] v = new long[n];
    for(int i = 0; i < n; i++) {
      v[i] = sc.nextLong();
    }
    long[][] left = new long[n + 1][n + 1];
    long[][] right = new long[n + 1][n + 1];
    HashMap<Integer, ArrayList<Long>> leftmap = new HashMap<Integer, ArrayList<Long>>();
    HashMap<Integer, ArrayList<Long>> rightmap = new HashMap<Integer, ArrayList<Long>>();
    ArrayList<Long> leftlist = new ArrayList<Long>();
    ArrayList<Long> rightlist = new ArrayList<Long>();
    for(int i = 0; i < n; i++) {
      leftlist.add(v[i]);
      Collections.sort(leftlist);
      leftmap.put(i + 1, leftlist);
    }
    for(int i = n - 1; i >= 0; i--) {
      rightlist.add(v[i]);
      Collections.sort(rightlist);
      rightmap.put(n - i, rightlist);
    }
    for(int i = 1; i <= n; i++) {
      ArrayList<Long> list = leftmap.get(i);
      long t = 0;
      for(int j = 1; j <= i; j++) {
        t += list.get(i - j);
        left[i][j] = t;
      }
    }
    for(int i = 1; i <= n; i++) {
      ArrayList<Long> list = rightmap.get(i);
      long t = 0;
      for(int j = 1; j <= i; j++) {
        t += list.get(i - j);
        right[i][j] = t;
      }
    }
    // iから高々j取るときの最大値
    long[][] rightmax = new long[n + 1][n + 1];
    for(int i = 1; i <= n; i++) {
      rightmax[i][0] = 0;
      long t = 0;
      for(int j = 1; j <= i; j++) {
        rightmax[i][j] = Math.max(rightmax[i][j - 1], right[i][j]);
      }
    }
    long ans = 0;
    for(int i = 0; i <= (int)Math.min(n, k); i++) {
      for(int j = 0; j <= (int)Math.min(n - i, k - i); j++) {
        for(int i2 = 0; i2 <= (int)Math.min(i, k - i - j); i2++) {
          long t = left[i][i2] + rightmax[j][k - i - j - i2];
          ans = Math.max(ans, t);
        }
      }
    }
    System.out.println(ans);
  }
}