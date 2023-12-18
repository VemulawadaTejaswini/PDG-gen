import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int L = scanner.nextInt();
    int R = scanner.nextInt();
    int l = L % 2019;
    int r = R % 2019;
    if (l >= r || R - L > 2019) {
      System.out.println(0);
      return;
    }

    int min = l * r % 2019;
    for (int i = l; i < r; i++) {
      for (int j = i + 1; j <= r; j++) {
        min = Math.min(min, i * j % 2019);
      }
    }
    System.out.println(min);
  }
}
