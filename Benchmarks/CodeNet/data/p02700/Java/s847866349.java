import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    sc.close();

    while (0 < A && 0 < C) {
      C -= B;
      if (C <= 0) break;
      A -= D;
    }

    boolean ans = C <= 0;
    System.out.println(ans ? "Yes" : "No");
  }
}
