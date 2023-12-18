import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A, B, C, D, E;
    A = sc.nextLong();
    B = sc.nextLong();
    C = sc.nextLong();
    D = sc.nextLong();
    E = sc.nextLong();
    long ar[] = { A, B, C, D, E };
    long minMove = solveMin(ar);
    long ans = ((N + minMove - 1) / minMove) + 4;
    System.out.println(ans);
  }

  public static long solveMin(long[] ar) {
    Arrays.sort(ar);
    return ar[0];
  }
}