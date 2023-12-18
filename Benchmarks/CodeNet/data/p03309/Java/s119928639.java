import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] A = new int[N+1];
    int[] B = new int[N];
    for (int i = 1; i <= N; i++) {
      A[i] = sc.nextInt();
      B[i-1] = A[i] - i;
    }
    Arrays.sort(B);
    if (N % 2 == 0) {
      System.out.println(Math.min(calc(A, B[N/2]), calc(A, B[N/2-1])));
    } else {             
      System.out.println(calc(A, B[N/2]));
    }
  }
  
  private static long calc(int[] A, int b) {
    long ret = 0;
    for (int i = 1; i < A.length; i++) {
      ret += Math.abs(A[i] - (b + i));
    }
    return ret;
  }
}