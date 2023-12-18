import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;    	//1<=N<=10^5
    int[] A;	//0<=Ai<=10^9
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = new int[N];
      for(int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
      }
    }
    int answer = solve(A);
    System.out.println(answer);
  }

  private static int solve(int[] a) {
    int n = a.length;
    if ( n == 0 ) {
      return 0;
    }
    if ( n == 1 ) {
      return 1;
    }
    int[] a0 = new int[n-1];
    System.arraycopy(a, 1, a0, 0, n-1);
    int v0 = solve(a0);
    boolean bDependent = false;
    for(int elem : a0) {
      if ( a[0] < elem ) {
        bDependent = true;
        break;
      }
    }
    return bDependent ? v0 : (v0+1);
  }
}