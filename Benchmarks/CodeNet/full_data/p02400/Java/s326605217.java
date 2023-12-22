import java.util.Scanner;

class Main
{
  public static void main(String[] args) {
    double r = new Scanner(System.in).nextDouble();
    System.out.println(String.format("%.6f %.6f", (r*r*Math.PI), (2*r*Math.PI) ) );
  }
}