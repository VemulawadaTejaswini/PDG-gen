import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int sum = 0;
    int tmp = n;
    do {
      sum += tmp % 10;
      tmp = tmp / 10;
    } while (tmp >= 10);

    if (n % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");      
    }

    scan.close();
  }
}