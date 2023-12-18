import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    new Main().solev();
  }

  public void solev() {

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();

    int add = a + b;
    int sub = a - b;
    int mul = a * b;

    int result = 0;
    result = Math.max(add, sub);
    result = Math.max(result, mul);
    System.out.println(result);
  }
}
