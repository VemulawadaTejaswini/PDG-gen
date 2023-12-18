import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    int S = 0;
    int Aodd = 0;

    int[] A = new int[N]; 
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      S += A[i];
      if (i % 2 == 1) {
        Aodd += A[i];
      }
    }
    sc.close();

    int[] X = new int[N];

    X[0] = S - 2 * Aodd;

    System.out.print(X[0] + " ");

    for (int i = 1; i < N; i++) {
      X[i] = 2 * A[i-1] - X[i-1];
      System.out.print(X[i]);
      if (i == N-1) {
        System.out.println("");
      } else {
        System.out.print(" ");
      }
    }

  }
}