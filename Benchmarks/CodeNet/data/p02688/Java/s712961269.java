import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] cnt = new int[N];
    for (int i = 0; i < K; i++) {
      int d = sc.nextInt();
      int[] ary = new int[d];
      for (int j = 0; j < d; j++) {
        ary[j] = sc.nextInt();
      }
      for (int v : ary) {
        cnt[v-1]++;
      }
    }
    int ans = 0;
    for (int x = 0; x < N; x++) {
      if (cnt[x] == 0) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}