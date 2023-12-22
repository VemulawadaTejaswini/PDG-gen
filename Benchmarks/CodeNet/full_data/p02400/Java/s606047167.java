import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      final double PI = 3.141592653589;
      double r = sc.nextDouble();
      System.out.printf("%f %f\n", (r * r * PI), (2 * r * PI));
   }
}