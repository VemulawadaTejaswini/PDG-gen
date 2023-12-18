import java.util.*;

public class Main {

  private static final int MAX_COUNT = 999;

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();

    long total = 0;
    for (int i = 1; i <= n; i++) {
      String value = String.valueOf(i);
      int sum = 0;
      for (int j = 0; j < value.length(); j++) {
        sum += Integer.parseInt(value.substring(j, j + 1));
      }
      if (sum >= a && sum <= b) {
        total += i;
      }
    }
    System.out.println(total);

    scan.close();
  }
}