import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int[] d = new int[n];
    for(int i = 0; i < n; i++) {
      d[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    long ans = 0;
    for(int i = 0; i < (int)Math.pow(2, n - 1); i++) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int j = 0; j < (n - 1); j++) {
        if((i & (1 << j)) != 0) list.add(j);
      }
      for(int j = 0; j < list.size(); j++) {
        if(j == 0) {
          int c = list.get(j);
          for(int k = c; k >= 0; k--) {
            ans += ((long)d[k] * (long)Math.pow(10, c - k));
          }
        } else {
          int c1 = list.get(j - 1);
          int c2 = list.get(j);
          for(int k = c2; k > c1; k--) {
            ans += ((long)d[k] * (long)Math.pow(10, c2 - k));
          }
        }

        if(j == (list.size() - 1)) {
          int c = list.get(j);
          for(int k = n - 1; k > c; k--) {
            ans += ((long)d[k] * (long)Math.pow(10, n - 1 - k));
          }
        }
      }
    }
    System.out.println(ans);
  }
}