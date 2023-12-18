import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int K = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    scan.close();

    System.out.println(A%K == 0 || A/K != B/K ? "OK" : "NG");
  }
}