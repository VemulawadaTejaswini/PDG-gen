import java.util.Scanner;
import java.util.Arrays; 

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    for (int i =0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i =0; i<N; i++) {
      B[i] = sc.nextInt();
    }
    for (int i =0; i<N; i++) {
      C[i] = sc.nextInt();
    }
    Arrays.sort(A);Arrays.sort(B);Arrays.sort(C);
    long ans =0;
    for (int k =0; k<N; k++) {
      int countA =0, countC =0;
      for (int i =0; i<N; i++) {
        if (A[i] < B[k]) countA++;
        if (A[i] >= B[k]) break;
      }
      for (int j =N-1; j>=0; j--) {
        if (C[j] > B[k]) countC++;
        if (C[j] <= B[k]) break;
      }
      ans += countA * countC;
    }
    System.out.println(ans);
  }
}