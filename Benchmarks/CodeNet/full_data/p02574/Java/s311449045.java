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

  private static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  private static List<Integer> getPrimes(int max) {
    Deque<Integer> seed = new ArrayDeque<>();
    seed.add(2);
    for (int i = 3; i <= max; i += 2) {
      seed.add(i);
    }
    List<Integer> primes = new ArrayList<>();
    Deque<Integer> newSeed = new ArrayDeque<>();
    while (true) {
      int p = seed.poll();
      primes.add(p);
      newSeed.clear();
      for (int si: seed) {
        if (si % p != 0) newSeed.add(si);
      }
      seed.clear();
      seed.addAll(newSeed);
      if (p * p > max) {
        primes.addAll(seed);
        break;
      }
    }
    return primes;
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    int max = 0;
    for (int ai: a) max = Math.max(max, ai);
    List<Integer> primes = getPrimes(max);
    boolean ispPirwiseCoprime = true;
    for (int p: primes) {
      int primeCount = 0;
      for (int ai: a) {
        if (p > ai) break;
        if (ai % p == 0) primeCount++;
        if (primeCount > 1) {
          ispPirwiseCoprime = false;
          break;
        }
      }
    }
    if (ispPirwiseCoprime) {
      System.out.println("pairwise coprime");
      return;
    }
    int result = a[0];
    for (int i = 1; i < n; i++) {
      result = gcd(result, a[i]);
      if (result == 1) break;
    }
    if (result == 1) System.out.println("setwise coprime");
    else System.out.println("not coprime");
  }
}