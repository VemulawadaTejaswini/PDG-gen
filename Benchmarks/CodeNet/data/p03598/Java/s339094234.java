import java.lang.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] x = new int[n];
    for (int i = 0; i < x.length; i++) {
      x[i] = scan.nextInt();
    }

    int total = 0;
    for (int i = 0; i < n; i++) {
      int a = Math.abs(k - x[i]);
      int distance = x[i];
      if (distance > a) {
        distance = a;
      }
      total += distance * 2;
    }
    System.out.println(total);

    scan.close();
  }
}