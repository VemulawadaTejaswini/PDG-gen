import java.util.Scanner;

/**
 * XOR World
 */
public class Main {
  private static final String DELIMITER = " ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] firstLine = scanner.nextLine().split(DELIMITER);
    long a = Long.valueOf(firstLine[0]);
    long b = Long.valueOf(firstLine[1]);

    long acc = a;
    for (long i = a + 1; i <= b; i ++) {
      acc = acc ^ i;
    }
    System.out.println(acc);
  }
}