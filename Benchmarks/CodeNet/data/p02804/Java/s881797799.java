import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
         A[i] = sc.nextInt() % 1000000007;
      }
      Arrays.sort(A);
      int min_sum = 0;
      for (int i = 0; i < A.length; i++) {
         min_sum += multiply(A[i], nCr(A.length - i - 1, K - 1));
         min_sum %= 1000000007;
      }
      int max_sum = 0;
      for (int i = A.length - 1; i >= 0; i--) {
         max_sum += multiply(A[i], nCr(i, K - 1));
         max_sum %= 1000000007;
      }
      System.out.println((max_sum - min_sum) % 1000000007);
   }
   
   public static int nCr(int n, int r) {
      if (n == 0 || n < r) {
         return 0;
      }
      int result = 1;
      r = Math.min(r, n-r);
      for (int i = n; i > n - r; i--) {
         result *= i;
      }
      for (int i = r; i >= 1; i--) {
         result /= i;
      }
      return result;
   }
   
   public static int multiply(int x, int y) {
      if (x == 0) {
         return 0;
      }
      if (x < 0) {
         return multiply(-x, y);
      }
      if (y < 0) {
         return multiply(x, -y);
      }
      x %= 1000000007;
      int factor = 1000000007 / x + 1;
      if (factor > y) {
         return x * y;
      } else {
         return (multiply((x * factor) % 1000000007, y / factor)
               + x * (y % factor)) % 1000000007;
      }
   }
}