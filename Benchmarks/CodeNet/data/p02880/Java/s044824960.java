import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 1; i <= 9; i++) {
      int cand = N / i;
      if (1 <= cand && cand <= 9 && cand * i == N) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
