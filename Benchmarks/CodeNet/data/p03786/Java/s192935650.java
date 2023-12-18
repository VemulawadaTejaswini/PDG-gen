import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    long[] S = new long[N];
    S[0] = A[0];
    for (int i = 1; i < N;i++) {
      S[i] = S[i-1]+A[i];
    }
    int ngIdx = -1;
    for (int i = 0; i < N-1; i++) {
      if (S[i]*2 < A[i+1]) {
        ngIdx = i;
      }
    }

    System.out.println(N-ngIdx-1);
  }
}