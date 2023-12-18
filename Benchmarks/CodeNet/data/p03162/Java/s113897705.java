import java.util.Scanner;
public class Main {
  static int N;
  static int[][] A;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    A = new int[N][3];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    System.out.println(f(0,-1));
  }
  static int f(int index, int prev) {
    if (index == N) return 0;
  	int max = 0;
    for (int i = 0; i < 3; i++) {
      if (i != prev) {
      	max = Math.max(max,A[index][i] + f(index + 1, i));
      }
    }
  }
}