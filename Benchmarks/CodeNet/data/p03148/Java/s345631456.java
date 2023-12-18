import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void reverse(long[] a) {
    for (int i = 0; i < a.length / 2; i++) {
      long tmp = a[i];
      a[i] = a[a.length - i - 1];
      a[a.length - i - 1] = tmp;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    long[][] susi = new long[n][n];
    int[] count = new int[n];
    for (int i = 0; i < n; i++) {
      int t = scanner.nextInt() - 1;
      long d = scanner.nextLong();
      susi[t][count[t]++] = d;
    }
    for (int i = 0; i < n; i++) {
      Arrays.sort(susi[i]);
      reverse(susi[i]);
    }
    int kind = n;
    for (int i = 0; i < n; i++) {
      if (count[i] == 0) {
        kind--;
      }
    }
    long[] _1 = new long[kind];
    long[] _0 = new long[n - kind];
    int idx = -1;
    int idx_0 = 0;
    for (int i = 0; i < kind; i++) {
      while (count[++idx] == 0) {
      }
      _1[i] = susi[idx][0];
      for (int j = 1; j < n && susi[idx][j] > 0; j++) {
        _0[idx_0++] = susi[idx][j];
      }
    }
    Arrays.sort(_1);
    Arrays.sort(_0);
    reverse(_1);
    reverse(_0);
    for (int i = 0; i < kind - 1; i++) {
      _1[i + 1] += _1[i];
    }
    for (int i = 0; i < n - kind - 1; i++) {
      _0[i + 1] += _0[i];
    }

    long base = k > _0.length ? k - _0.length : 0;
    k = k > _0.length ? _0.length : k;
    long[] ans = new long[_1.length - (int) base + 1];
    for (int i = 0; i < ans.length; i++) {
      if (k - i - 1 < 0) {
        ans[i] = _1[(int) base - 1] + base * base;
      } else if (base - 1 < 0) {
        ans[i] = _0[k - i - 1];
      } else {
        ans[i] = _0[k - i - 1] + _1[(int) base - 1] + base * base;
      }
      base++;
    }
    long max = ans[0];
    for (int i = 1; i < ans.length; i++) {
      if (max < ans[i]) {
        max = ans[i];
      }
    }
    System.out.println(max);

  }

}
