import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();
      int maxAB = Math.max(A, B);
      int minAB = Math.min(A, B);

      if ( minAB < C && C < maxAB) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}