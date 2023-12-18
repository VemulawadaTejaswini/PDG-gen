import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[][] freq = new long[9][9];
    for (int i = 1; i <= N; i++) {
      int h = highest(i) - 1;
      int l = lowest(i) - 1;
      if (l < 0) continue;
      freq[h][l]++;
    }
    long res = 0;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        res += freq[i][j] * freq[j][i];
      }
    }
    System.out.println(res);
  }

  private static int highest(int n) {
    int d = 0;
    while (n > 0) {
      d = n % 10;
      n /= 10;
    }
    return d;
  }

  private static int lowest(int n) {
    return n % 10;
  }
}
