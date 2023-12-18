import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long[] A = new long[N+1];
    for (int i = 0; i <= N; i++) {
      A[i] = Integer.parseInt(sc.next());
    }

    long[] B = new long[N];
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(sc.next());
    }

    long kill = 0;
    long origin = 0;
    for (int i = B.length-1; i >= 0; i--) {
      origin = A[i+1];
      A[i+1] = Math.max(0, A[i+1]-B[i]);
      kill += Math.max(0, origin-A[i+1]);

      B[i] -= Math.max(0, origin);

      origin = A[i];
      A[i] = Math.max(0, A[i]-B[i]);
      kill += Math.max(0, origin-A[i]);
    }

    System.out.println(kill);
  }
}