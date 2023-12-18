import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    double xamin = a / 0.08;
    double xamax = (a + 1) / 0.08;

    double xbmin = b / 0.1;
    double xbmax = (b + 1) / 0.1;

    int o = -1;
    int i = 0;
    int dx = 0;
    if (xamin < xbmin && xamax >= xbmin && (int)xamax >= (int)xbmin) {
      i = (int)xbmin;
      dx = (xbmin - i == 0) ? 0 : 1;
    } else if (xbmin < xamin && xbmax >= xamin && (int)xbmax >= (int)xamin) {
      i = (int)xamin;
      dx = (xamin - i == 0) ? 0 : 1;
    } else if (xamin == xbmin) {
      i = (int)xamin;
      dx = (xamin - i == 0) ? 0 : 1;
    }

    if (i != 0 && i + dx <= xamax && i + dx <= xbmax) {
      o = i + dx;
    }

    System.out.println(o);
  }
}