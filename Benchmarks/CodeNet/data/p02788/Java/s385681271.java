import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int D = scanner.nextInt();
    int A = scanner.nextInt();
    Monster[] monsters = new Monster[N];
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int h = scanner.nextInt();
      monsters[i] = new Monster(x, (h - 1) / A + 1);
    }
    Arrays.sort(monsters, Comparator.comparingLong(m -> m.x));

    long cum = 0;
    int[] delta = new int[N];
    for (int i = 0; i < N; i++) {
      if (i > 0 && monsters[i - 1].x + 2 * D < monsters[i].x) cum -= delta[i - 1];
      if (monsters[i].h > cum) delta[i] = monsters[i].h - (int) cum;
      cum += delta[i];
    }
    long res = 0;
    for (int i = 0; i < N; i++) res += delta[i];
    System.out.println(res);
  }

  private static class Monster {
    private final long x;
    private final int h;

    private Monster(int x, int h) {
      this.x = x;
      this.h = h;
    }
  }
}
