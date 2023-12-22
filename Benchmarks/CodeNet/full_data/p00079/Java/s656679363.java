import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] one = sc.nextLine().split(",");
    String[] two = sc.nextLine().split(",");
    String[] thr = sc.nextLine().split(",");
    double x1 = Double.valueOf(one[0]);
    double y1 = Double.valueOf(one[1]);
    double x2 = Double.valueOf(two[0]);
    double y2 = Double.valueOf(two[1]);
    double x3 = Double.valueOf(thr[0]);
    double y3 = Double.valueOf(thr[1]);

    double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    double b = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
    double c = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));

    double z = (a + b + c) / 2;
    double S = Math.sqrt(z * (z - a) * (z - b) * (z - c));

    x2 = x3;
    y2 = y3;
    a  = c;

    while(sc.hasNext()) {
      String[] vertex = sc.nextLine().split(",");
      x3 = Double.valueOf(vertex[0]);
      y3 = Double.valueOf(vertex[1]);
      b = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
      c = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));

      z = (a + b + c) / 2;
      S += Math.sqrt(z * (z - a) * (z - b) * (z - c));

      x2 = x3;
      y2 = y3;
      a  = a;
    }

    System.out.println(S);
  }
}