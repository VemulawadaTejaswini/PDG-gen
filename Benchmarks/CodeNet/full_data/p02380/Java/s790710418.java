import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    double a = reader.nextDouble();
    double b = reader.nextDouble();
    double digC = Math.toRadians(reader.nextDouble());

    double S = a * b * Math.sin(digC) / 2;
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(digC));
    double L = a + b + c;
    double h = S * 2 / a;
    System.out.println(S + "\n" + L + "\n" + h);
  }
}