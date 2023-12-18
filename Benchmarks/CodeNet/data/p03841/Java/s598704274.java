import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    final int[] X = new int[N];
    BIT bit = new BIT(N * N);
    int[] order = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      order[i] = (X[i] << 10) | i;
      bit.add(X[i], i + 1);
    }
    for (int i = 0; i < N; i++) {
      if (bit.cumulativeSum(X[i]) > X[i]) {
        System.out.println("No");
        return;
      }
    }
    Arrays.sort(order);
    HashMap<Integer, Integer> xs = new HashMap<>();
    for (int i = 0; i < N; i++) {
      order[i] &= 0x3FF;
      xs.put(X[i], i + 1);
    }
    ArrayList<Integer> output = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < order[i]; j++) {
        output.add(order[i] + 1);
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N - 1 - order[i]; j++) {
        output.add(order[i] + 1);
      }
    }
    int[] count = new int[N];
    StringBuilder sb = new StringBuilder();
    for (int i = 0, pos = 0; i < N * N; i++) {
      if (xs.containsKey(i + 1)) {
        int v = xs.get(i + 1);
        if (count[v - 1] != v - 1) {
          System.out.println("No");
          return;
        }
        sb.append(v + " ");
      } else {
        count[output.get(pos) - 1]++;
        sb.append(output.get(pos++) + " ");
      }
    }
    System.out.println("Yes");
    sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb);
  }

  static class BIT {
    long[] v;

    BIT(int size) {
      int len = 1;
      while (len < size) {
        len *= 2;
      }
      this.v = new long[len + 1];
    }

    long cumulativeSum(int index) {
      long ret = 0;
      while (index > 0) {
        ret += v[index];
        index &= index - 1;
      }
      return ret;
    }

    // inclusive, 1-indexed
    long sum(int l, int r) {
      long ret = cumulativeSum(r) - cumulativeSum(l - 1);
      return ret;
    }

    void add(int index, long val) {
      while (index < v.length) {
        v[index] += val;
        index += (index & -index);
      }
    }

    void set(int index, long val) {
      long old = sum(index, index);
      add(index, val - old);
    }
  }
}