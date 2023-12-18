import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    for (int i = 0; i < s.length - 1; i++) {
      if (s[i] == s[i + 1]) {
        System.out.printf("%d %d\n", i + 1, i + 2);
        return;
      }
    }
    for (int i = 0; i < s.length - 2; i++) {
      if (s[i] == s[i + 2]) {
        System.out.printf("%d %d\n", i + 1, i + 3);
        return;
      }
    }
    System.out.println("-1 -1");
  }
}
