import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char ch : s) {
      if (ch == 'B') {
        if (sb.length() > 0) sb.setLength(sb.length() - 1);
      } else {
        sb.append(ch);
      }
    }
    System.out.println(sb.toString());
  }
}
