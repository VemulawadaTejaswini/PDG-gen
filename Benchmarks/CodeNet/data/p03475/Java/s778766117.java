import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] C = new int[N];
    int[] S = new int[N];
    int[] F = new int[N];

    for (int i = 0; i < N-1; i++) {
      C[i] = sc.nextInt();
      S[i] = sc.nextInt();
      F[i] = sc.nextInt();
    }

    sc.close();

    int[] x = new int[N]; 

    x[N-1] = 0;

    for (int i = N-2; 0 <= i; i--) {
      if (C[i] + S[i] > S[i+1]) {
        x[i] = C[i] + S[i] + x[i+1] - S[i+1];
      } else {
        x[i] = x[i+1];
        S[i] = S[i+1] - C[i];
      }
    }

    for (int i = 0; i < N; i++) {
      System.out.println(x[i]);
    }
  
  }

}