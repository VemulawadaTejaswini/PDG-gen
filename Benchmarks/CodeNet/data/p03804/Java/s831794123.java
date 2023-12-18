import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    String[][] A = new String[N][N];

    for (int i = 0; i < N; i++) {
      String a = sc.next();
      A[i] = a.split("");
    }

    String[] B = new String[M];

    for (int i = 0; i < M; i++) {
      B[i] = sc.next();
    }

    sc.close();

    String[][] A2 = new String[N][N];

    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N - M + 1; i++) {
        String a_ = "";
        for (int j = i; j < i + M; j++) {
          a_ += A[k][j];
        }
        A2[k][i] = a_;
      }
    }

    String result = "No";

    int cA = 0;
    int rA = 0;
    int cB = 0;

    while (cA < N) {
      while (rA < N) {
        if (A2[rA][cA].equals(B[cB])){
          result = "Yes";
          cB++;
          rA++;
          if (cB == M) {
            rA = N;
            cA = N;
          }
        } else {
          result = "No";
          rA++;
          cB = 0;
        }
      }
      rA = 0;
      cB = 0;
      cA++;
    }

    System.out.println(result);

  }

}