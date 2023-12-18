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
    boolean[] water = new boolean[F + 1];
    boolean[] sugar = new boolean[F + 1];
    water[0] = true;
    sugar[0] = true;
    for (int i = 1; i <= F; i++) {
      if (i >= 100 * A) water[i] |= water[i - 100 * A];
      if (i >= 100 * B) water[i] |= water[i - 100 * B];
    }
    for (int i = 1; i <= F; i++) {
      if (i >= C) sugar[i] |= sugar[i - C];
      if (i >= D) sugar[i] |= sugar[i - D];
    }

    int maxT = A * 100, maxS = 0;
    for (int i = 1; i <= F; i++) {
      for (int j = 1; j <= F; j++) {
        if (water[i] && sugar[j] && i + j <= F && j <= i / 100 * E) {
          if (maxS * (i + j) < maxT * j) {
            maxT = i + j;
            maxS = j;
          }
        }
      }
    }
    System.out.printf("%d %d\n", maxT, maxS);
  }
}
