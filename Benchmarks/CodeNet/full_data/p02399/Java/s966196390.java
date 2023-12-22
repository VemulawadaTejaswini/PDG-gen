import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int firstResult = a / b;
    int secondResult = a % b;
    double thirdResult = a / b;

    System.out.println(String.format("%d %d %f", firstResult, secondResult, thirdResult));
  }
}