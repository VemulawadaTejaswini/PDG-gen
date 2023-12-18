import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[M];
    int[] C = new int[M];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < M; i++) {
      B[i] = sc.nextInt();
      C[i] = sc.nextInt();
    }

    for (int i = 0; i < M; i++) {
      Arrays.sort(A);
      int count = B[i];
      int newValue = C[i];
      for (int j = 0; j < N; j++) {
        if (count > 0 && A[j] < newValue) {
          A[j] = newValue;
          count--;
        } else {
          break;
        }
      }
    }
    
    int ans = 0;
    for (int i = 0; i < N; i++) {
      ans += A[i];
    }
    
    //System.out.println(Arrays.toString(A));
    //System.out.println(Arrays.toString(B));
    //System.out.println(Arrays.toString(C));
    
    System.out.println(ans);
  }
}

