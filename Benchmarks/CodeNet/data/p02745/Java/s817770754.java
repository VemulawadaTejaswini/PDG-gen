import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();

    Set<String> generated = new HashSet<>();

    Set<String> abCandidate = concatWithOverlap(a, b); // ab
    for (String s : abCandidate) {
      generated.addAll(concatWithOverlap(s, c)); // abc
    }
    Set<String> baCandidate = concatWithOverlap(b, a); // ba
    for (String s : baCandidate) {
      generated.addAll(concatWithOverlap(s, c)); // bac
    }

    Set<String> bcCandidate = concatWithOverlap(b, c); // bc
    for (String s : bcCandidate) {
      generated.addAll(concatWithOverlap(s, a)); // bca
    }
    Set<String> cbCandidate = concatWithOverlap(c, b); // cb
    for (String s : cbCandidate) {
      generated.addAll(concatWithOverlap(s, a)); // cba
    }

    Set<String> caCandidate = concatWithOverlap(c, a); // ca
    for (String s : caCandidate) {
      generated.addAll(concatWithOverlap(s, b)); // cab
    }
    Set<String> acCandidate = concatWithOverlap(a, c); // ac
    for (String s : acCandidate) {
      generated.addAll(concatWithOverlap(s, b)); // acb
    }

    int min = Integer.MAX_VALUE;
    for (String s : generated) {
      min = Math.min(s.length(), min);
    }
    os.println(min);
  }

  private static Set<String> concatWithOverlap(String x, String y) {

    Set<String> candidate = new HashSet<>();
    for (int i = 0; i <= Math.min(x.length(), y.length()); i++) {
      String xy = isConsistent(x, y, i);
      if (xy != null) candidate.add(xy);
    }
    return candidate;
  }

  private static String isConsistent(String l, String r, int length) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int li = l.length() - length + i;
      int ri = i;
      if (l.charAt(li) == '?') {
        s.append(r.charAt(ri));
      } else if (r.charAt(ri) == '?') {
        s.append(l.charAt(li));
      } else {
        if (l.charAt(li) != r.charAt(ri)) return null;
        s.append(l.charAt(li));
      }
    }
    return l.substring(0, l.length() - length) + s.toString() + r.substring(length, r.length());
  }

  private static long gcd(long m, long n) {
    if (m < n) return gcd(n, m);
    if (n == 0) return m;
    return gcd(n, m % n);
  }

  private static long lcm(long m, long n) {
    return m / gcd(m, n) * n;
  }

  private static class Modular {

    private final long mod;

    private Modular(long mod) {
      this.mod = mod;
    }

    private long inverse(long n) {
      return pow(n, mod - 2) % mod;
    }

    private long pow(long x, long n) {
      /*
      long ans = 1;
      while (n > 0) {
        if ((n & 1) == 1) {
          ans = ans * x % mod;
        }
        x = x * x % mod;
        n >>= 1;
      }
      return ans;
      */
      if (n == 0) {
        return 1;
      }
      return n % 2 == 0 ?
          pow(x * x % mod, n / 2) % mod :
          x % mod * pow(x, n - 1) % mod;
    }
  }

  private static class ModularNFixedCombination {

    private final Modular modular;
    private final long[] comb;
    private final long N;

    public ModularNFixedCombination(long N, int size, long mod) {
      this.modular = new Modular(mod);
      this.comb = new long[size + 1];
      this.N = N;

      comb[0] = 1;

      for (int i = 1; i <= size; i++) {
        comb[i] = ((comb[i - 1] * (N - (i - 1))) % mod * modular.inverse(i)) % mod;
      }
    }

    long combination(int n, int k) {
      if (n != N) {
        throw new IllegalStateException();
      }
      return comb[k];
    }

    long repeatedCombination(int n, int k) {
      return combination(n + k - 1, k);
    }
  }

  private static class ModularCombination {

    private final long fact[];
    private final long mod;
    private final Modular modular;

    public ModularCombination(int size, long mod) {
      this.fact = new long[size + 1];
      this.mod = mod;
      this.modular = new Modular(mod);

      this.fact[0] = 1;
      for (int i = 1; i <= size; i++) {
        fact[i] = (fact[i - 1] * i) % mod;
      }
    }

    private long factorial(int n) {
      return fact[n];
    }

    long combination(int n, int k) {
      return
          (
              (
                  (
                      factorial(n) * modular.inverse(factorial(n - k))
                  ) % mod
              ) * modular.inverse(factorial(k))
          ) % mod;
    }

    long repeatedCombination(int n, int k) {
      return combination(n + k - 1, k);
    }
  }

  private static class Scanner {

    private final InputStream is;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    Scanner(InputStream is) {
      this.is = is;
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = is.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
        throw new NumberFormatException();
      }
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}
