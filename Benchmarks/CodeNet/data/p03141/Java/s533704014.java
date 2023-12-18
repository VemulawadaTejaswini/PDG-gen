import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Dish[] dishes = new Dish[N];
    for (int i = 0; i < N; i++) dishes[i] = new Dish(scanner.nextInt(), scanner.nextInt());
    Arrays.sort(dishes, (d1, d2) -> -d1.a - d1.b + d2.a + d2.b);

    long res = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 != 0) res -= dishes[i].b;
      else res += dishes[i].a;
    }
    System.out.println(res);
  }

  private static class Dish {
    private final int a;
    private final int b;

    private Dish(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}
