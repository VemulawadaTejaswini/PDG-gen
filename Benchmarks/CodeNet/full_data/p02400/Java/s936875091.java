import java.util.Scanner;

public class Main {
  private static int r;
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    r = stdIn.nextInt();
    double Pi = Math.PI;
    System.out.printf("%.6f %.6f\n", ((double)r*r*Pi), (( double)2*Pi*r));
  }
}