import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final String s = scanner.nextLine();

    for (int i = 0; i < s.length() - 2; i++) {
      if (s.charAt(i) == s.charAt(i + 2)) {
        System.out.println((i + 1) + " " + (i + 3));
        return;
      }
    }

    System.out.println("-1 -1");
  }
}