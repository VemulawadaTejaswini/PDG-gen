import java.util.*;
class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N ; i++) A[i] = sc.nextInt();
    for (int i = N-1; i >= 0; i--) {
      int n = N/(i+1);
      int a = 0;
      for (int j = 1; j <= n; j++) {
        a += A[i/j];
      }
      B[i] = a%2;
    }
    int M = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      if (B[i] == 1) {
        sb.append(i+1).append(" ");
        M++;
      }
    }
    sb.delete(sb.length(),sb.length());
    System.out.println(M);
    System.out.println(sb.toString());
  }
}