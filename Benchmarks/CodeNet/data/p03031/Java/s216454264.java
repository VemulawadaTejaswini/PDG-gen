import java.util.*;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] a = new int[N];
    for (int i = 0; i < M; i++) {
      int k = Integer.parseInt(sc.next());
      for (int j = 0; j < k; j++) {
        int s = Integer.parseInt(sc.next());
        s--;
        a[s] |= 1 << i;
      }
    }

    int P = 0;
    for (int i = 0; i < M; i++) {
      int x = Integer.parseInt(sc.next());
      P |= x << i;
    }

    int ans = 0;

    for (int i = 0; i < (1 << N); i++) {
      int t = 0;
      for (int j = 0; j < N; j++) {
        if ((i >> j & 1) == 1) {
          t ^= a[j];
        }
      }
      if (t == P) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
