import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long Y = scanner.nextLong();
    long Z = Y / X;
    int i = 0;
    while (Z > 0) {
      Z /= 2;
      i++;
    }
    System.out.println(i);
  }
}
