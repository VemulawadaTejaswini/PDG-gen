import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.next();
    s = s.replace('1', '0');
    s = s.replace('9', '1');
    s = s.replace('0', '9');
    System.out.println(s);
  }
}
