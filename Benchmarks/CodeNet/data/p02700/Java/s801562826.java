
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();

    int numt = (int) Math.ceil(a/d);
    int numa = (int) Math.ceil(c/b);

    if(numt >= numa) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
