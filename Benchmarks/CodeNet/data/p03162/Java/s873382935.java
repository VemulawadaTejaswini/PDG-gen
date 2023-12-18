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
  static long B;
  static long C;
  // static int[][] map;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] map = new int[N][3];

    map[0][0] = scanner.nextInt();
    map[0][1] = scanner.nextInt();
    map[0][2] = scanner.nextInt();

    for (int i = 1; i < N; i++) {
      int temp = scanner.nextInt();
      map[i][0] = Math.max(map[i - 1][1] + temp, map[i - 1][2] + temp);

      temp = scanner.nextInt();
      map[i][1] = Math.max(map[i - 1][0] + temp, map[i - 1][2] + temp);

      temp = scanner.nextInt();
      map[i][2] = Math.max(map[i - 1][0] + temp, map[i - 1][1] + temp);
    }

    int max;
    max = Math.max(map[N - 1][0], map[N - 1][1]);
    max = Math.max(map[N - 1][2], max);
    System.out.println(max);

  }
}
