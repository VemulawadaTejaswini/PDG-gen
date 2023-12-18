import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L[] = new int[N];
    int R[] = new int[N];
    for (int i=0; i<N; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }
    Arrays.sort(L);
    Arrays.sort(R);
    long ans = 0;
    for (int i=0; i<N; i++) {
      ans += 2 * Math.max(0, L[N-i-1] - R[i]);
    }
    System.out.println(ans);
  }
}
