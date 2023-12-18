import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long A = sc.nextInt();
    long B = sc.nextInt();
    long div = N / (A + B);
    long mod = N % (A + B);

    if (A == 0) {
      System.out.println(A);
      return;
    }

    div *= A;
    if (mod < A) {
      div += mod;
    } else {
      div += A;
    }
    System.out.printf("%d", div);
  }
}