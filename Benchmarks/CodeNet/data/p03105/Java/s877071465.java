import java.util.Scanner;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    System.out.println(Math.min(B / A, C));
  }
}
