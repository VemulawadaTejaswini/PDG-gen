import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    Apple[] apples = new Apple[A + B + C];
    for (int i = 0; i < A; i++) apples[i] = new Apple(scanner.nextInt(), 'r');
    for (int i = 0; i < B; i++) apples[A + i] = new Apple(scanner.nextInt(), 'g');
    for (int i = 0; i < C; i++) apples[A + B + i] = new Apple(scanner.nextInt(), 'v');
    Arrays.sort(apples, (apple, t1) -> t1.value - apple.value);
    int N = X + Y;
    long res = 0;
    for (int i = 0; i < A + B + C; i++) {
      if (N == 0) break;
      Apple a = apples[i];
      if (a.kind == 'r' && X > 0) {
        X--;
        N--;
        res += a.value;
      }
      if (a.kind == 'g' && Y > 0) {
        Y--;
        N--;
        res += a.value;
      }
      if (a.kind == 'v' && N > 0) {
        N--;
        res += a.value;
      }
    }
    System.out.println(res);
  }

  private static class Apple {
    private final int value;
    private final char kind;

    private Apple(int value, char kind) {
      this.value = value;
      this.kind = kind;
    }
  }
}
