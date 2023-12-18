import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] x = new double[n];
    String[] u = new String[n];
    double sum = 0.0;

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextDouble();
      u[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      if (u[i].equals("BTC")) {
        sum += x[i] * 380000.0;
      } else {
        sum += x[i];
      }
    }

    System.out.println(sum);
  }

}
