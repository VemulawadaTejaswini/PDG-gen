import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] count = new int[n + 1];
    int max = 0;
    for(int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (i == 0 && num != 0) {
        System.out.println(0);
        return;
      }
      count[num]++;
      max = Math.max(max, num);
    }
    if (count[0] != 1) {
      System.out.println(0);
      return;
    }
    for(int i = max; i >= 0; i--) {
      if (count[i] == 0) {
        System.out.println(0);
        return;
      }
    }
    long ans = 1;
    for(int i = 1; i <= max; i++) {
      long prev = count[i - 1];
      long base = 1;
      long num = count[i];
      for(int j = 0; j < num; j++) {
        base *= prev;
        base %= 998244353;
      }
      ans *= base;
      ans %= 998244353;
    }
    System.out.println(ans);
  }
}
