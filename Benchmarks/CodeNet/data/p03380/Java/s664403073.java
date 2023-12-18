import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    int ans1 = A[N];
    
    int candidate1 = Integer.MIN_VALUE;
    int candidate2 = Integer.MAX_VALUE;
    for (int i=0; i<N-1; i++) {
      if (A[i] < ans1/2) {
        candidate1 = A[i];
      } else {
        candidate2 = A[i];
        break;
      }
    }
    int ans2;
    if (Math.abs(candidate1*2 - ans1) > Math.abs(candidate2*2 - ans1)) {
      ans2 = candidate2;
    } else {
      ans2 = candidate1;
    }
    System.out.println(ans2 + " " + ans1);
  }
}
