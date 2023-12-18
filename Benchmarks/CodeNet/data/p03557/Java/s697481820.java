import java.util.Scanner;
 
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
    int ans =0;
    for (int k =0; k<N; k++) {
      int countA =0, countC =0;
      for (int i =0; i<N; i++) {
        if (A[i] < B[k]) countA++;
      }
      for (int j =0; j<N; j++) {
        if (C[j] > B[k]) countC++;
      }
      ans += countA * countC;
    }
    System.out.println(ans);
  }
}