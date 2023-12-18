import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(A);

    int tMax = 31;
    int pow2[] = new int[tMax];
    pow2[0] = 1;
    for (int i = 1; i < tMax; i++) {
      pow2[i] = pow2[i - 1] * 2;
    }

    int ans = 0;
    int t = tMax - 1;
    for (int i = N - 1; i >= 0; i--) {
      if (A[i] < 0) {
        continue;
      }
      while (pow2[t - 1] > A[i]) {
        t--;
      }
      int sum = pow2[t];
      for (int j = i - 1; j >= 0; j--) {
        if (A[i] + A[j] == sum) {
          ans++;
          A[j] = -1000000000;
          break;
        } else if (A[i] + A[j] < sum) {
          break;
        }
      }
    }

    System.out.println(ans);
  }
}