import java.util.Scanner;
public class Main {

  public static double mean(double[] ary) {
    double sum = 0;
    for (double num : ary) {
      sum += num;
    }
    return sum / ary.length;
  }

  public static double sse(double[] ary, double mean) {
    double sse = 0;
    for (double num : ary) {
      sse += Math.pow((num - mean), 2);
    }
    return sse;
  }

  public static double sdev(double[] ary) {
    double m = mean(ary);
    double sse = sse(ary, m);
    return Math.pow((sse / ary.length), .5);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while (n != 0) {
      double[] ary = new double[n];
      for (int i = 0; i < n; i++) {
        ary[i] = s.nextDouble();
      }
      System.out.println(sdev(ary));
      n = s.nextInt();
    }
    s.close();
  }
}

