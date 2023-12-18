import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] H = new int[N+1];
    boolean[] notGoodH = new boolean[N+1];
    for (int i = 1; i <= N; i++) H[i] = sc.nextInt();
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (H[a] >= H[b]) notGoodH[b] = true;
      if (H[a] <= H[b]) notGoodH[a] = true;
      //System.out.println(Arrays.toString(notGoodH));
    }
    int ans = -1;
    for (boolean n : notGoodH) if (!n) ans++;
    System.out.println(ans);
  }
}