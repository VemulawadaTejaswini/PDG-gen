import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    float ans = 0;
    for (int i = 0; i < N; i++) {
      ans += 1 / (float) A[i];
    }
    System.out.println(1/ans);
  }
}