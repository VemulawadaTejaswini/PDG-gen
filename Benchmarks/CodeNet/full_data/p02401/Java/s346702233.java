import java.util.Scanner;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {

      int a = scanner.nextInt();
      String op = scanner.next();
      int b = scanner.nextInt();
      int res = 0;

      if (op.equals("?")) break;

      switch (op) {
        case "+": res = a + b; break;
        case "-": res = a - b; break;
        case "*": res = a * b; break;
        case "/": res = a / b; break;
      }

      System.out.println(res);
    }
  }
}