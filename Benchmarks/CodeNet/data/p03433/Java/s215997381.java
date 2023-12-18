import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();

    if ( N%500 <= A) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}