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
    long ans = 0;
    for(int a = 0; a <= Math.min(n, k); a++) {
      for(int b = 0; a + b <= Math.min(n, k); b++) {
        ArrayList<Long> list = new ArrayList<Long>();
        for(int c = 0; c < a; c++) {
          list.add(v[c]);
        }
        for(int c = n - 1; c >= n - b; c--) {
          list.add(v[c]);
        }
        Collections.sort(list);
        long sum = 0;
        for(int i = 0; i < a + b; i++) {
          sum += list.get(i);
        }
        for(int i = 0; i < Math.min(k - a - b, a + b); i++) {
          if(list.get(i) < 0) sum -= list.get(i); 
        }
        ans = Math.max(ans, sum);
      }
    }
    System.out.println(ans);
  }
}