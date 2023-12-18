import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    long k = sc.nextLong();
    long[] t = new long[n];
    for(int i = 0; i < n; i++) {
      t[i] = sc.nextLong();
    }
    Arrays.sort(t);
    int ans = 0;
    int bus = 0;
    while(bus < n) {
      ans++;
      int left = bus;
      int right = n;
      int bus2 = bus;
      while(left < right) {
        int med = (left + right) / 2;
        if((t[med] - t[bus]) <= k) {
          bus2 = med;
          left = med + 1;
        } else {
          right = med;
        }
      }
      bus2 = Math.min(bus2, bus + c - 1);
      bus = bus2 + 1;
    }
    System.out.println(ans);
  }
}