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
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int val = calc(A, B[i]);
      if (val < min) {
        min = val;
      }
    }
    System.out.println(min);
  }
  
  private static int calc(int[] A, int b) {
    int ret = 0;
    for (int i = 1; i < A.length; i++) {
      ret += Math.abs(A[i] - (b + i));
    }
    return ret;
  }
}