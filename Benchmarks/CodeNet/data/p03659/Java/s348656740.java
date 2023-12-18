import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    long[] arr = new long[n];
    for (int i = 0; i < n; i++) {
      sum += arr[i] = sc.nextInt();
    }
    long half = sum / 2;
    long x = 0;
    long y = 0;

    for (int i = 0; i < arr.length; i++) {
      if (i >= 1 && i+1 == arr.length) {
        System.out.println(Math.abs(x - y));
        break;
      }
      x += arr[i];
      y = sum - x;
      if ((x + arr[i + 1]) > half) {
        long tmp_x = x + arr[i + 1];
        long tmp_y = sum - tmp_x;
        long ans = Math.abs(x - y);
        long tmp_ans = Math.abs(tmp_x - tmp_y);
        if (ans > tmp_ans) {
          System.out.println(tmp_ans);
          break;
        } else {
          System.out.println(ans);
          break;
        }
      }
    }
  }
}
