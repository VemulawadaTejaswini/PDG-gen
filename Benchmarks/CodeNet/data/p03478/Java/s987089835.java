import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int all = 0;

    for (int x = 1; x <= n; x++) {
      int sum = 0;

      for (String number : String.valueOf(x).split("")) {
        sum += Integer.parseInt(number);
      }


      if (a <= sum && sum <= b) {
        all += x;

      }

    }

    System.out.println(all);

    scanner.close();
  }
}
