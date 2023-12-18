import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long NN = N;
    int sN = (int) Math.sqrt(N);
    long di = 1;
    for (int i = 2; i <= sN; i++) {
      while (NN % i == 0 && di < sN) {
        di *= i;
        NN /= i;
      }
    }
    long dj = N / di;
    if (di * dj != N) {
      System.out.println(N - 1);
    } else {
      System.out.println((di - 1) + (dj - 1));
    }
  }
}
