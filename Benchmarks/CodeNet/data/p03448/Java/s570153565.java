import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    int count500 = scan.nextInt();
    int count100 = scan.nextInt();
    int count50 = scan.nextInt();
    int total = scan.nextInt();
    int result = 0;

    for (int i = 0; i < count500; i++) {
      for (int j = 0; j < count100; j++) {
        for (int k = 0; k < count50; k++) {
          int amount = 500 * count500 + 100 * count100 + 50 * count50;
          if (amount == total) {
            result++;
          }
          if (amount >= total) {
            break;
          }
        }
      }
    }
    System.out.println(result);
  }
}