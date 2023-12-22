import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double r = scanner.nextDouble();
    double pi = Math.PI;
    float area = (float)(pi * r * r);
    float length = (float)(2 * pi * r);
    System.out.printf("%f %f\n", area, length);
  }
} 
