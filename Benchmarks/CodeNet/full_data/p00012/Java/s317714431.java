import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  while (stdIn.hasNextDouble()) {
   double x1 = stdIn.nextDouble();
   double y1 = stdIn.nextDouble();
   double x2 = stdIn.nextDouble();
   double y2 = stdIn.nextDouble();
   double x3 = stdIn.nextDouble();
   double y3 = stdIn.nextDouble();
   double x4 = (x1 + x2 + x3) / 3.0;
   double y4 = (y1 + y2 + y3) / 3.0;
   double px = stdIn.nextDouble();
   double py = stdIn.nextDouble();
   if (((x1 - x2) * (y4 - y1) + (y1 - y2) * (x1 - x4))
     * ((x1 - x2) * (py - y1) + (y1 - y2) * (x1 - px)) > 0
     && ((x2 - x3) * (y4 - y2) + (y2 - y3) * (x2 - x4))
       * ((x2 - x3) * (py - y2) + (y2 - y3) * (x2 - px)) > 0
     && ((x3 - x1) * (y4 - y3) + (y3 - y1) * (x3 - x4))
       * ((x3 - x1) * (py - y3) + (y3 - y1) * (x3 - px)) > 0)
    System.out.println("YES");
   else {
    System.out.println("NO");
   }
  }
 }
}