import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int K = scanner.nextInt();

    if ( K % 2 == 0) {
      int n = K/2;
      System.out.println(n * n);
    } else {
      int n = (K+1)/2;
      System.out.println(n * (n-1));
    }
  }
}
