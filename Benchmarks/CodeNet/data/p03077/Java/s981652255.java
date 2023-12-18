import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    long D = scan.nextLong();
    long E = scan.nextLong();

    long min = A;
    if (min > B) {
      min = B;
    }
    if (min > C) {
      min = C;
    }
    if (min > D) {
      min = D;
    }
    if (min > E) {
      min = E;
    }
    long result = 0;
    if (min == 1) {
      result = N / min + 4;
    } else {
      result = N / min + 5;
    }
    System.out.println(result);
  }
}
