import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    int[] H;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      H = new int[N];
      for(int i = 0; i < N; i++) {
        H[i] = sc.nextInt();
      }
    }
    boolean answer = canBuildStair(N, H, Integer.MAX_VALUE);
    System.out.println(answer ? "Yes": "No");
  }
  
  private static boolean canBuildStair(int n, int[] h, int max) {
    if ( n == 1 ) {
      return h[0] <= max || h[0]-1 <= max;
    }
    int shift = 0;
    if ( h[n-1] > max ) {
      shift = -1;
    }
    if ( shift < 0 && h[n-1] - 1 > max ) {
      return false;
    }
    int[] h_next = new int[n-1];
    for(int i = 0; i < n-1; i++) {
      h_next[i] = h[i];
    }
    return canBuildStair(n-1, h_next, h[n-1]+shift);
  }
}