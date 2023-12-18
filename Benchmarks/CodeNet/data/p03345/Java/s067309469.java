import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long K = sc.nextLong();
    if (A == B && B == C) {
      System.out.println(-1);
      return;
    }
    while (K > 0) {
      long a = B+C;
      long b = C+A;
      long c = A+B;
      A = a;
      B = b;
      C = c;
      if (Math.abs(A-B) > 1_000_000_000_000_000_000L) {
        System.out.println("Unfair");
        return;
      }
      K--;
    }
    System.out.println(A-B);
  }
}