import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      sum += a[i];
    }
    Arrays.sort(a);
    ArrayList<Long> c = new ArrayList<Long>();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i = 0; i < m; i++) {
      int b = sc.nextInt();
      long cc = sc.nextLong();
      if(!(c.contains(cc))) c.add(cc);
      if(map.containsKey(cc)) {
        map.put(cc, map.get(cc) + b);
      } else {
        map.put(cc, b);
      }
    }
    Collections.sort(c);
    long[] d = new long[n];
    int p = 0;
    for(int i = c.size() - 1; i >= 0; i--) {
      if(p >= n) break;
      long s = c.get(i);
      int t = map.get(s);
      for(int j = 0; j < t; j++) {
        if(p >= n) break;
        d[p] = s;
        p++;
      }
    }
    for(int i = 0; i < n; i++) {
      if(d[i] > a[i]) {
        sum += (d[i] - a[i]);
      } else {
        break;
      }
    }
    System.out.println(sum);
  }
}