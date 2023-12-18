import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    int min = N;
    for (int A = 0; A <= N; A++) {
      int x = 0;

      int i = A;
      int j = 6;
      while (i >= j) {
        int k = (i / j) % 6;
        i -= j * k;
        x += k;
        j *= 6;
      }

      i = (N - A) + i;
      j = 9;
      while (i >= j) {
        int k = (i / j) % 9;
        i -= j * k;
        x += k;
        j *= 9;
      }
      x += i;
      if (min > x) {
        min = x;
      }
    }
    System.out.println(min);
  }
}
