import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      A[i] = X[i];
    }
    Arrays.sort(A);
    
    for (int i = 0; i < N; i++) {
      int ans = A[N/2] <= X[i] ? A[N/2-1] : A[N/2];
      System.out.println(ans);
    }
  }
}