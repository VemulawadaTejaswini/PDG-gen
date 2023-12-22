import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    int n = reader.nextInt();
    double[] x = new double[n];
    double[] y = new double[n];
    double manhattan = 0;
    double euclidean = 0;
    double minkowski = 0;
    double chebyshev = 0;

    for (int i = 0; i < n; i++) {
      x[i] = reader.nextDouble();
    }
    for (int i = 0; i < n; i++) {
      y[i] = reader.nextDouble();
    }

    for (int i = 0; i < n; i++) {
      double temp = Math.abs(x[i] - y[i]);
      manhattan += temp;
      euclidean += Math.pow(temp, 2);
      minkowski += Math.pow(temp, 3);
      if (chebyshev < temp)  chebyshev = temp;
    }
    System.out.println(manhattan + "\n" + Math.sqrt(euclidean) + "\n" + Math.cbrt(minkowski) + "\n" + chebyshev);
  }
}