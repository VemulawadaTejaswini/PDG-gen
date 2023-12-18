import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    
    Arrays.sort(a);
    
    int ans = 0;
    for (int i = 0; i < N; i++) {
      if (x >= A[i]) {
        x -= A[i];
        ans++;
      }
    }
    if (x > 0 && ans == N) {
      ans--;
    }
    System.out.println(ans);
  }
}