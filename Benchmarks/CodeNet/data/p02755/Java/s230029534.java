import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    int xamin = (int)(a / 0.08);
    int xamax = (int)((a + 1) / 0.08);

    int xbmin = (int)(b / 0.1);
    int xbmax = (int)((b + 1) / 0.1);
    
    int o = -1;
    if(xamin < xbmin && xamax >= xbmin) {
      o = xbmin;
    } else if(xbmin < xamin && xbmax >= xamin) {
      o = xamin;
    } else if (xamin == xbmin) {
      o = xamin;
    }
    
    System.out.println(o);
  }
}