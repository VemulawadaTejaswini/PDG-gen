import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int K = Math.min(A, B) + Math.abs(A - B) / 2;

      if (Math.abs(A - K) == Math.abs(B - K)) {
        System.out.println(K);
      } else {
        System.out.println("IMPOSSIBLE");
      }
    }
  }
}