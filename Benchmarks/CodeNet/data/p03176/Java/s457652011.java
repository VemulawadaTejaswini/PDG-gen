// https://www.hamayanhamayan.com/entry/2019/01/11/004701

// https://ikatakos.com/pot/programming_algorithm/contest_history/atcoder/2019/0106_educational_dp_2

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextLong();
    }
    Seg seg = new Seg(N, h, a);
    List<int[]> sortedByH =
        IntStream.range(0, N)
            .mapToObj(i -> new int[] {i, h[i]})
            .sorted(Comparator.comparingInt(i -> i[1]))
            .collect(Collectors.toList());
    for (int[] ih : sortedByH) {
      int i = ih[0];
      seg.update(i, seg.max(0, i, 0, 0, N) + a[i]);
    }
    System.out.println(seg.data[0]);
  }

  // Max seg tree.
  static class Seg {
    int offset;
    long[] data;

    Seg(int size, int[] heights, long[] values) {
      int n = 1;
      while (n < size) n <<= 1;
      data = new long[(n << 1) - 1];
      offset = n - 1;
    }

    void update(int idx, long val) {
      int i = offset + idx;
      while (i >= 0 && data[i] < val) {
        data[i] = val;
        i = (i - 1) / 2;
      }
    }

    // Find max in range [l,r), seg in [segl, segr)
    long max(int l, int r, int seg, int segl, int segr) {
      if (segr <= l || r <= segl) return 0;

      if (l <= segl && segr <= r) return data[seg];
      else {
        int m = (segl + segr) / 2;
        return Math.max(max(l, r, seg * 2 + 1, segl, m), max(l, r, seg * 2 + 2, m, segr));
      }
    }
    // Find max in range[0,i)
    long max1(int idx) {
      int i = offset + idx;
      long max = data[i];
      while (i > 0) {
        // 自身が右枝の場合のみ、左枝と比較
        if (i % 2 == 0) {
          max = Math.max(data[i - 1], max);
        }
        i = (i - 1) / 2;
      }
      return max;
    }
  }
}
