import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();

    int plus = A + B;
    int minus = A - B;
    int kakeru = A * B;

    int result = plus;

    if (result < minus) {
      result = minus;
    }
    if (result < kakeru) {
      result = kakeru;
    }

    System.out.println(result);

  }

}
