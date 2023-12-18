import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];

    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      B[i] = sc.nextInt();
    }

    int big_b = 0;
    int big_a = 0;

    for (int i = 0; i < n; i++) {
      if (A[i] > B[i]) {
        big_a += A[i] - B[i];
      } else {
        big_b += B[i] - A[i];
      }
    }

    if (big_a * 2 > big_b) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
