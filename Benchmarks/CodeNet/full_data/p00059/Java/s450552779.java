import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    String out = "";
    while (scanner.hasNext()) {
      double xa1 = scanner.nextDouble();
      double ya1 = scanner.nextDouble();
      double xa2 = scanner.nextDouble();
      double ya2 = scanner.nextDouble();
      double xb1 = scanner.nextDouble();
      double yb1 = scanner.nextDouble();
      double xb2 = scanner.nextDouble();
      double yb2 = scanner.nextDouble();

/***
System.out.printf("%f <= %f : ", xa1, xb1);
System.out.println(xa1 <= xb1);

System.out.printf("%f <= %f : ", xb1, xa2);
System.out.println(xb1 <= xa2);

System.out.printf("%f <= %f : ", ya1, yb2);
System.out.println(ya1 <= yb2);

System.out.printf("%f <= %f : ", yb2, ya2);
System.out.println(yb2 <= ya2);

System.out.printf("%f <= %f : ", xb1, xa1);
System.out.println(xb1 <= xa1);

System.out.printf("%f <= %f : ", xa1, xb2);
System.out.println(xa1 <= xb2);

System.out.printf("%f <= %f : ", yb1, ya2);
System.out.println(yb1 <= ya2);

System.out.printf("%f <= %f : ", ya2, yb2);
System.out.println(ya2 <= yb2);
***/
if (
(
  ((xa1 <= xb1 && xb1 <= xa2) || (xa1 <= xb2 && xb2 <= xa2)) &&
  ((ya1 <= yb1 && yb1 <= ya2) || (ya1 <= yb2 && yb2 <= ya2))
) || (
  ((xb1 <= xa1 && xa1 <= xb2) || (xb1 <= xa2 && xa2 <= xb2)) &&
  ((yb1 <= ya1 && ya1 <= yb2) || (yb1 <= ya2 && ya2 <= yb2))
)
) {
      //if ((xa1 <= xb1 && xb1 <= xa2 && ya1 <= yb2 && yb2 <= ya2) ||
          //(xb1 <= xa1 && xa1 <= xb2 && yb1 <= ya2 && ya2 <= yb2)) {
        out += "YES\n";
      } else {
        out += "NO\n";
      }
    }
    System.out.print(out);
  }
}
/**
-1.0 -1.0 1.0 1.0 -2.0 -2.0 0.0 0.0
-2.0 -2.0 0.0 0.0 -1.0 -1.0 1.0 1.0
0.0 0.0 5.0 5.0 1.0 1.0 4.0 4.0
1.0 1.0 4.0 4.0 0.0 0.0 5.0 5.0
1.0 1.0 5.0 5.0 0.0 0.0 4.0 5.0
-3.0 -5.0 2.0 -1.0 0.0 0.0 4.0 4.0
0.0 0.0 4.0 4.0 -3.0 -5.0 2.0 -1.0
***/