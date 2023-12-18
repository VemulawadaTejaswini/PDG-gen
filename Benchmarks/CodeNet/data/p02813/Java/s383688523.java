import java.util.Scanner;

public class Main {

  static int[] FACTORIALS = {1, 1, 2, 6, 24, 120, 720, 5040};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = sc.nextInt();
    int sum1 = permutation(max, sc);
    int sum2 = permutation(max, sc);
    System.out.println(Math.abs(sum1 - sum2));
  }

  private static int permutation(int max, Scanner sc) {
    int ret = 0;
    boolean[] used = new boolean[max + 1];
    for (int i = max; i > 0; i--) {
      int value = sc.nextInt();
      int num = 0;
      for (int j = 1; j <= max; j++) {
        if (value == j) {
          used[j] = true;
          break;
        } else if (used[j]) {
          // do nothing
          continue;
        } else {
          num++;
        }
      }
      ret += FACTORIALS[i - 1] * num;
    }
    return ret;
  }
}
