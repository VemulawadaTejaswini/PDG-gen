import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    String W = stdin.next();
    int n = 0;
    while (true) {
      String T = stdin.next();
      if (T.equals("END_OF_TEXT")) {
        break;
      } else if (T.equals(W)) {
        n++;
      }
    }

    System.out.println(n);
  }

}