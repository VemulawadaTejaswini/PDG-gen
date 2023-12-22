import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double pi = Math.PI;
    int r = scanner.nextInt();

    double area = r * r * pi;
    double circum = 2 * pi * r;

    System.out.printf("%.6f %.6f%n",area,circum);

    return 0;

  }
}