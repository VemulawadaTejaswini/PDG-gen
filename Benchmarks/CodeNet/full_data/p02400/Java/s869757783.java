import java.util.Scanner;
class Main {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    double r = scanner.nextDouble();
    double ans1 = Math.PI * r * r;
    double ans2 = Math.PI * 2 * r;

    System.out.printf("%f %f", ans1, ans2);
  }
}
