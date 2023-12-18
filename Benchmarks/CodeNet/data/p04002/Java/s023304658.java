import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextInt();
    long w = sc.nextInt();
    int n = sc.nextInt();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong() - 1;
      long b = sc.nextLong() - 1;
      long a1 = Math.max(0, a - 2);
      long b1 = Math.max(0, b - 2);
      for(long j = a1; j <= a; j++) {
        for(long k = b1; k <= b; k++) {
          if(((j + 2) < h) && ((k + 2) < w)) {
            long t = j * w + k;
            if(map.containsKey(t)) {
              map.put(t, map.get(t) + 1);
            } else {
              map.put(t, 1);
            }
          }
        }
      }
    }
    long[] num = new long[10];
    for(Long key : map.keySet()) {
      num[map.get(key)]++;
    }
    long sum = 0;
    for(int i = 1; i <= 9; i++) {
      sum += num[i];
    }
    num[0] = (h - 2) * (w - 2) - sum; 
    for(int i = 0; i < 10; i++) {
      System.out.println(num[i]);
    }
  }
}