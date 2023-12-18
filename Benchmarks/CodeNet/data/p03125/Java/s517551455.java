import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      int answer = (num2 % num1 == 0) ? num1 + num2 : num2 - num1;
      System.out.println(answer);
    }
  }
}