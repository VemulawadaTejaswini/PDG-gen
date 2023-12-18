import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] L = new int[M];
    int[] R = new int[M];
    int[] D = new int[M];
    for (int i = 0; i < M; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
      D[i] = sc.nextInt();
    }
    for (int i = 0; i < M; i++) {
      if (L[i] == R[i] && D[i] != 0) {
        System.out.println("No");
        sc.close();
        return;
      }
      for (int j = i + 1; j < M; j++) {
        if (L[i] == L[j]) {
          L[j] = R[i];
          D[j] -= D[i];
        }
        if (L[i] == R[j]) {
          R[j] = R[i];
          D[j] += D[i];
        }
      }
    }
    System.out.println("Yes");
    sc.close();
    return;
  }

}