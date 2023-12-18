import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Math.max(sc.nextInt(), sc.nextInt());
    sc.close();
    StringBuilder B = new StringBuilder();
    for (int i = 0; i < A; i++) {
      B.append(A);
    }
    System.out.println(B);
  }
}
