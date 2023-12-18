import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    int E = scanner.nextInt();
    int F = scanner.nextInt();

    int maxWeight = F;
    int maxSugar = 0;
    for (int n1 = 0; n1 <= F / (100 * A); n1++) {
      for (int n2 = 0; n2 <= F / (100 * B); n2++) {
        for (int n3 = 0; n3 <= (A * n1 + B * n2) * E / C; n3++) {
          for (int n4 = 0; n4 <= (A * n1 + B * n2) * E / D; n4++) {
            int water = 100 * A * n1 + 100 * B * n2;
            int sugar = C * n3 + D * n4;
            if (water + sugar > F) continue;
            if (water / 100 * E < sugar) continue;

            if (sugar * maxWeight > maxSugar * (water + sugar)) {
              maxWeight = water + sugar;
              maxSugar = sugar;
            }
          }
        }
      }
    }
    System.out.printf("%d %d\n", maxWeight, maxSugar);
  }
}
