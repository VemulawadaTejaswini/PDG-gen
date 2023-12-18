import java.util.Scanner;

public class Main {

  static int[][] bulbs;
  static int[] p;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    bulbs = new int[m][0];
    p = new int[m];

    for (int i = 0; i < m; ++i) {
      int k = sc.nextInt();
      bulbs[i] = new int[k];

      for (int j = 0; j < k; ++j) {
        int s = sc.nextInt();
        bulbs[i][j] = s;
      }
    }

    for (int i = 0; i < m; ++i) {
      p[i] = sc.nextInt();
    }

    System.out.println(combinations(new int[n], n));
  }

  public static int combinations(int[] combination, int switchN) {
    if (switchN > 0) {
      int[] combination1 = combination.clone();
      combination[switchN - 1] = 0;
      combination1[switchN - 1] = 1;
      return combinations(combination, switchN - 1) + combinations(combination1, switchN - 1);
    }
    return checkSwitches(combination) ? 1 : 0;
  }

  public static boolean checkSwitches(int[] combination) {
    boolean res = true;
    for (int j = 0; j < bulbs.length; ++j) {
      int sum = 0;
      for (int i : bulbs[j])
        sum += combination[i - 1];
      res &= sum % 2 == p[j];
    }
    return res;
  }
}