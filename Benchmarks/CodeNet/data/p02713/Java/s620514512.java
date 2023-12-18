import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int K = Integer.parseInt(sc.next());
      long result = 0;

      for (int i = 1; i <= K; i++) {
        for (int j = 1; j <= K; j++) {
          for (int k = 1; k <= K; k++) {
            result += gcd(i, j, k);
          }
        }

      }

      System.out.println(result);
    }
  }

  public static final int gcd(int a, int b) {
    if (a < b) {
      int tmp = a;
      a = b;
      b = tmp;
    }

    int r = -1;
    while (r != 0) {
      r = a % b;
      a = b;
      b = r;
    }

    return a; 
  }

  public static final int gcd(final int... param) {
    final int len = param.length;
    int g = gcd(param[0], param[1]);
    for (int i = 1; i < len - 1; i++) {
      g = gcd(g, param[i + 1]);
    }
    return g;
  }
}
