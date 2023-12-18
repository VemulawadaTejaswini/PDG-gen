import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] map = new int[N + 1];

    for (int i = 0; i < M; i++) {
      int L = scanner.nextInt();
      int R = scanner.nextInt();

      map[L - 1]++;
      map[R]--;
    }

    for (int i = 0; i < N; i++) {
      map[i + 1] += map[i];
    }

    int ans = 0;

    for (int i = 0; i < N; i++) {
      if(map[i] == M)ans++;
//      System.out.println(map[i]);
    }

    System.out.println(ans);
  }
}

