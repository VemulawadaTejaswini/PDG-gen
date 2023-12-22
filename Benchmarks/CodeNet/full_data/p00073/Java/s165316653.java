import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      double  x = sc.nextFloat();
      double h = sc.nextFloat();

      if(x == 0 && h == 0) {
        break;
      }

      double S = x * x;
      double y = Math.sqrt((x/2.0)*(x/2.0)+h*h);
      S += 4.0 * (x * y / 2.0);

      String s = String.format("%.5f", S);
      System.out.println(s);
    }
  }
}