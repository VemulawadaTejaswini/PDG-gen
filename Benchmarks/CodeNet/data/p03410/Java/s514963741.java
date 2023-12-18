import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();

    int res = 0;

    for (int k = 0; k < 28; k++) {
      int m = 1 << (k + 1);
      boolean[] ar = new boolean[m];
      boolean[] br = new boolean[m];
      for (int i = 0; i < N; i++) ar[a[i] % m] = !ar[a[i] % m];
      for (int i = 0; i < N; i++) br[b[i] % m] = !br[b[i] % m];

      int sumbr = 0;
      for (int i = m / 2; i < m; i++) if(br[i]) sumbr += 1;

      int c = 0;
      int q = m / 2;
      int r = m - 1;
      for (int p = 0; p < m; p++) {
        if (ar[p] && sumbr % 2 == 1) c += 1;
        c %= 2;
        if (br[r]) sumbr -= 1;
        q--;
        r--;
        if (q < 0) q += m;
        if (br[q]) sumbr += 1;
      }
      if (c == 1) res += (1 << k);
    }

    System.out.println(res);
  }
}
