import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    sc.close();

    long count = 1;

    if (N == K) {
      for (int i = K; 0 < i; i--) {
        count *= i;
      }
    } else if (N < K) {
      for (int i = K; (K - N) < i; i--) {
        count *= i;
      }
    } else {
      for (int i = 0; i < N; i++) {
        if (i == 0) {
          count *= K;
        } else {
          count *= (K - 1);
        }
      }
    }

    System.out.println(count);

  }

}