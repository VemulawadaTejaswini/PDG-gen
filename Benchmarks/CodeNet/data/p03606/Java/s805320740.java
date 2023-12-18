import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int total = 0;
    int bigger = 0;
    int smaller = 0;
    for (int i = 0; i < A; i++) {
      int B = sc.nextInt();
      int C = sc.nextInt();
      bigger = Math.max(B, C);
      smaller = Math.min(B, C);
      total += bigger - smaller + 1;
    }
    System.out.println(total);
  }
}
