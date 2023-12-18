import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A, B, C, D, E;
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    D = sc.nextInt();
    E = sc.nextInt();
    int ar[] = { A, B, C, D, E };
    int minMove = solveMin(ar);
    int ans = ((N + minMove - 1) / minMove) + 4;
    System.out.println(ans);
  }

  public static int solveMin(int[] ar) {
    Arrays.sort(ar);
    return ar[0];
  }
}