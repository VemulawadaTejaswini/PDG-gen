import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextInt();
    double x = Math.PI;
    System.out.println(r * r * x + " " + 2 * x * r);
  }
}