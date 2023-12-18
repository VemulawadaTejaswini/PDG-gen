import java.util.Scanner;

/**
 * Favorite Sound
 *
 */
public class Main {
  private static final String DELIMITER = " ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] lines = scanner.nextLine().split(DELIMITER);
    // 1回a円、b円持っている、c回聞くと満足
    int a = Integer.valueOf(lines[0]);
    int b = Integer.valueOf(lines[1]);
    int c = Integer.valueOf(lines[2]);

    int balance = b;
    int count = 0;
    for (int i = 0;i < c; i ++) {
      if (balance > 0 && balance >= a) {
        count += 1;
        balance -= a;
      } else {
        break;
      }
    }

    System.out.println(count);
  }
}