import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    if (N == 1) {
      System.out.println("Hello World");
    } else if (N == 2) {
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      System.out.println(A + B);
    }
  }
}