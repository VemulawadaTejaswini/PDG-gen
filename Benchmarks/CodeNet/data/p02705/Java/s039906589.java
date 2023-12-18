import java.util.Scanner;
import java.lang.Math;
public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      double r = scan.nextDouble();
      System.out.printf("%.20f",2*Math.PI*r);
    }
}