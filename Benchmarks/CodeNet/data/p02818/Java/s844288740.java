import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long A = sc.nextLong();
    Long B = sc.nextLong();
    Long K = sc.nextLong();
    if (A >= K) {
      A -= K;
      System.out.println(A + " " + B);
    } else if (A + B - K >= 0) {
      System.out.println(0 + " " + (A + B - K));
    } else {
      System.out.println(0 + " " + 0);
    }
  }
}
