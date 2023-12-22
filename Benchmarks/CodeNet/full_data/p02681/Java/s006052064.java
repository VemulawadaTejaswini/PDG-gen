import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final String s = scanner.nextLine();
    final String t = scanner.nextLine();

    if (s.length() + 1 == t.length() && t.startsWith(s)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}