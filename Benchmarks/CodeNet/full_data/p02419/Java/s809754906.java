import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int cnt = 0;

    String pat = scan.next();

    while (true) {

      String str = scan.next();

      if (str.equals("END_OF_TEXT")) {
        break;
      }

      if (str.equalsIgnoreCase(pat)) {
        cnt++;
      }

    }

    System.out.println(cnt);

  }

}
