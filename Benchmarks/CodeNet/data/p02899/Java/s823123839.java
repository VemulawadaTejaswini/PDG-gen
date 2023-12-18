import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h;
    h = new int[N];
    int[] ans;
    ans = new int[N];
    for(int i = 0; i < N; i++){
      h[i] = sc.nextInt();
    }
    for(int i = 0; i < N; i++){
      ans[i] = h[h[i]-1];
      System.out.print(ans[i] + " ");
    }
  }
}
