import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int[] v = new int[n];
    int[] number_even = new int[100001];
    int[] number_odd = new int[100001];
    for (int i = 1; i <= n; i++) {
      int tmp = sc.nextInt();
      if (i % 2 == 0) {
        number_even[tmp]++;
      } else {
        number_odd[tmp]++;
      }
    }
    int even_max_idx = 0;
    // int even_sec_idx = -1;
    int odd_max_idx = 0;
    // int odd_sec_idx = -1;
    int even_max = 0;
    int odd_max = 0;
    for (int i = 1; i <= 100000; i++) {
      if (even_max <= number_even[i]) {
        even_max_idx = i;
        even_max = number_even[i];
      }
      if (odd_max <= number_odd[i]) {
        odd_max_idx = i;
        odd_max = number_odd[i];
      }
    }
    Arrays.sort(number_even);
    Arrays.sort(number_odd);
    if (even_max_idx == odd_max_idx && number_even[99999] == 0 && number_odd[99999] == 0) {
      System.out.println(n / 2);
      return;
    } else {
      int ans = 0;
      for (int i = 0; i < 100000; i++) {
        ans += number_even[i];
        ans += number_odd[i];
      }
      System.out.println(ans);
    }
  }
}