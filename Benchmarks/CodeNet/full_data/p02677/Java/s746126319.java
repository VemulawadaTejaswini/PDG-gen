import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();

    int keika = 60 * h + m;
    double seta = Math.toRadians(Math.abs(keika * 0.5 - m * 6));
    System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(seta)));
  }
}
