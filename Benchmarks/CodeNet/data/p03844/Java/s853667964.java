import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String op = sc.next();
    int b = sc.nextInt();
    sc.close();

    int result = op.equals("+") ? a + b : a - b;
    System.out.println(result);
  }
}
