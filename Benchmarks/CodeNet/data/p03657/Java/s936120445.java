
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] arr = { A, B, A + B };
    boolean isPossible = false;

    for (int num : arr) {
      if (num >= 3 && num % 3 == 0) isPossible = true;
    }

    System.out.println(isPossible ? "Possible" : "Impossible");
  }
}
