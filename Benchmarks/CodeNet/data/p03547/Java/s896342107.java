import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next(), 16);
    int B = Integer.parseInt(sc.next(), 16);
    if (A > B) {
      System.out.println(A);
    } else if (B > A) {
      System.out.println(B);
    } else {
      System.out.println("=");
    }
  }
}
