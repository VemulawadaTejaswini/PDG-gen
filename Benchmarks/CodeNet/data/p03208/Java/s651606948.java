import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] h = new int[n];
    for(int i=0; i<n; i++){
      h[i] = sc.nextInt();
    }
    Arrays.sort(h);
    int[] wa = new int[n-k+1];
    for(int i=0; i<=n-k; i++) {
      wa[i] = h[i+k-1] - h[i];
    }
    int ans = 2_000_000_000;
    for(int i=0; i<=n-k; i++) {
      ans = Math.min(ans, wa[i]);
    }
    System.out.println(ans);
  }
}