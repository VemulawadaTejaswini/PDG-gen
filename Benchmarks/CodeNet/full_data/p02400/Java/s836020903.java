import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double r = in.nextDouble();
    System.out.printf("%.6f %.6f\n", r * r * Math.PI, 2 * r * Math.PI);
  }
}