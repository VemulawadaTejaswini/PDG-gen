import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      y[i] = sc.nextInt();
    }
    System.out.println(distance1(x, y));
    System.out.println(distance2(x, y));
    System.out.println(distance3(x, y));
    System.out.println(distanceInf(x, y));
  }
  static double distance1(int[] x, int[] y) {
    double d = 0.0;
    for (int i = 0; i < x.length; i++) {
      d += (double)Math.abs(x[i] - y[i]);
    }
    return d;
  }
  static double distance2(int x[], int y[]) {
    double d = 0.0;
    for (int i = 0; i < x.length; i++) {
      d += (double)(Math.abs(x[i] - y[i]) * Math.abs(x[i] - y[i]));
    }
    d = Math.sqrt(d);
    return d;
  }
  static double distance3(int x[], int y[]) {
    double d = 0.0;
    for (int i = 0; i < x.length; i++) {
      d += (double)(Math.abs(x[i] - y[i]) * Math.abs(x[i] - y[i]) * Math.abs(x[i] - y[i]));
    }
    d = Math.cbrt(d);
    return d;
  }
  static double distanceInf(int x[], int y[]) {
    double d = (double)Math.abs(x[0] - y[0]);
    if (x.length > 1) {
      for (int i = 1; i < x.length; i++) {
        if (d < (double)Math.abs(x[i] - y[i])) d = (double)Math.abs(x[i] - y[i]);
      }
    }
    return d;
  }
}

