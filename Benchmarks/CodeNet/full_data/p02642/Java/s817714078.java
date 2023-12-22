import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  private static List<Integer> getPrimes(int max) {
    if (max < 2) return new ArrayList<>();
    Deque<Integer> seed = new ArrayDeque<>();
    Deque<Integer> nextseed = new ArrayDeque<>();
    seed.add(2);
    for (int i = 3; i <= max; i += 2) {
      seed.add(i);
    }
    List<Integer> primes = new ArrayList<>();
    while (!seed.isEmpty()) {
      nextseed.clear();
      int p = seed.poll();
      primes.add(p);
      while (!seed.isEmpty()) {
        int val = seed.poll();
        if (val % p == 0) continue;
        nextseed.add(val);
      }
      if (p * p >= max) {
        primes.addAll(nextseed);
        break;
      }
      seed.clear();
      seed.addAll(nextseed);
    }
    return primes;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    if (n == 1) {
      System.out.println(1);
      return;
    }
    Arrays.sort(a);
    int max = a[n - 1];
    int min = a[0];
    if (max == min) {
      System.out.println(0);
      return;
    }
    if (min == 1) {
      if (a[1] == min) System.out.println(0);
      else System.out.println(1);
      return;
    }
   Set<Integer> forbidden = new HashSet<>();
    int count = 0;
    for (int ai: a) {
      if (forbidden.contains(ai)) continue;
      count++;
      for (int i = 0; ai * i <= max; i++) forbidden.add(ai * i);
    }
    System.out.println(count);
  }
}