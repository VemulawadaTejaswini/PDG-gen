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
    if(xamin < xbmin && xamax >= xbmin && (int)xamax >= (int)xbmin) {
      o = (int)xbmin;
    } else if(xbmin < xamin && xbmax >= xamin && (int)xbmax >= (int)xamin) {
      o = (int)xamin;
    } else if (xamin == xbmin) {
      o = (int)xamin;
    }

    System.out.println(o);
  }
}