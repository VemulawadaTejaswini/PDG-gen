import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    int[] result = main(stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt(),
        stdin.nextInt());
    System.out.println(result[0] + " " + result[1]);

    stdin.close();
  }

  public static int[] main(int A, int B, int C, int D, int E, int F) {
    // 100Aa + 100Bb + Cc + Dd <= F
    // (Cc + Dd) <= E * (Aa + Bb)
    double max = 0;
    int maxWater = 0;
    int maxSugar = 0;

    for (int a = 0; a * 100 <= F; a++) {
      for (int b = (a == 0) ? 1 : 0; (A * a + B * b) * 100 <= F; b++) {
        int water = (A * a + B * b) * 100;
        int sugarLimit = Math.min(E * (A * a + B * b), F - water);
        int sugar = maximizeSugar(C, D, sugarLimit);
        if (sugar == sugarLimit && sugar == E * (A * a + B * b)) {
          return new int[] { water + sugar, sugar };
        }

        if ((double) sugar / (water + sugar) > max) {
          max = (double) sugar / (water + sugar);
          maxWater = water;
          maxSugar = sugar;
        }
      }
    }

    return new int[] { maxWater + maxSugar, maxSugar };
  }

  private static int maximizeSugar(int C, int D, int limit) {
    int minRem = limit;
    for (int c = 0; c <= limit / C; c++) {
      minRem = Math.min((limit - C * c) % D, minRem);
    }
    return limit - minRem;
  }
}