import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double px = sc.nextDouble();
    double py = sc.nextDouble();
    double qx = sc.nextDouble();
    double qy = sc.nextDouble();

    System.out.println(Math.sqrt(Math.pow(px-qx, 2) + Math.pow(py-qy, 2)));
  }
}
