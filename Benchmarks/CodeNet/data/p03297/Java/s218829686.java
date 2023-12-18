import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int i = 0; i < T; i++) {
      long A = scanner.nextLong();
      long B = scanner.nextLong();
      long C = scanner.nextLong();
      long D = scanner.nextLong();
      if (solve(A, B, C, D)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  static boolean solve(long A, long B, long C, long D) {
    if (A < B) return false;
    if (C >= B) return true;
    if (D < B) return false;

    long r = A % B;
    long d = D % B;
    long i = r;
    while (true) {
      i += d;
      i %= B;
      if (i > C) return false;
      if (i == r) return true;
    }
  }
}
