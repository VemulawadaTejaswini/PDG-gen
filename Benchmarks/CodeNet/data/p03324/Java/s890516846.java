import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();

    int base = 1;
    for (int i = 0; i < D; i++) {
      base *= 100;
    }

    if (N % 100 == 0) {
      System.out.println(base * (N + 1));
    } else {
      System.out.println(base * N);
    }
  }
}