import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long[][] arr = new long[n][3];
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextLong();
        arr[i][1] = sc.nextLong();
        arr[i][2] = sc.nextLong();
      }

      long[] sum = new long[n];
      long max = 0;
      for(int a = -1; a <= 1; a += 2) {
        for(int b = -1; b <= 1; b += 2) {
          for(int c = -1; c <= 1; c += 2) {
            for(int i = 0; i < n; i++) {
              sum[i] = a * arr[i][0] + b * arr[i][1] + c * arr[i][2];
            }
            Arrays.sort(sum);
            long curSum = 0;
            for(int i = 0; i < m; i++) {
              curSum += sum[n - 1 - i];
            }
            max = Math.max(max, curSum);
          }
        }
      }

      System.out.println(max);
  }
}
