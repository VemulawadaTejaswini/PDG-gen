import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    double div = (double) (number1 + number2) / 2;
    System.out.println((int) Math.ceil(div));
  }
}