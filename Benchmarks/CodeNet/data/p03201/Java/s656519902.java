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

    int order[] = new int[tMax];
    order[0] = 0;
    int ind = 0;
    for (int t = 0; t < tMax; t++) {
      while (ind < N && pow2[t] >= A[ind]) {
        ind++;
      }
      order[t] = Math.max(ind - 1, 0);
    }

//    System.out.println(Arrays.toString(A));
//    System.out.println(Arrays.toString(pow2));
//    System.out.println(Arrays.toString(order));

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

      int sub = sum - A[i];
      int search;
      for (search = 0; search < tMax; search++) {
        if (sub < pow2[search]) {
          break;
        }
      }
      search = Math.max(search, 0);
      int max = order[search];
      search = Math.max(search - 1, 0);
      int min = order[search];
      //System.out.println(A[i] + " , " + sub + " , " + max + " , " + min);
      for (int j = max; j >= min; j--) {
        if (A[j] < 0 || i == j) {
          continue;
        }
        if (A[i] + A[j] == sum) {
          ans++;
          //System.out.println(A[i] + ", " + A[j]);
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