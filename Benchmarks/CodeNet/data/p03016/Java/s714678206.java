
import java.math.BigInteger;

public class Main {


  private static void solve() {
    long l = nl();
    long a = nl();
    long b = nl();
    long m = ni();

    BigInteger bm = BigInteger.valueOf(m);

    long[] ten = new long[19];
    ten[0] = 1;
    for (int i = 0; i < 18; i++) {
      ten[i + 1] = ten[i] * 10;
    }


    BigInteger ret = BigInteger.ZERO;
    for (int d = 0;; d++) {
      long preFrom = (ten[d] - a + b - 1) / b;
      long preTo = (ten[d + 1] - a + b - 1) / b;
      // [from,to]

      long to = Math.min(l, preTo);
      long from = Math.max(0, preFrom);

      long len = to - from;
      BigInteger p = BigInteger.valueOf(a + b * from);
      BigInteger q = BigInteger.valueOf(b);
      BigInteger t = BigInteger.valueOf(ten[d + 1]);
      BigInteger z = BigInteger.ZERO;
      BigInteger e = BigInteger.ONE;

      BigInteger[][] mat = {
          {t, e, p},
          {z, e, q},
          {z, z, e},
      };
      
      BigInteger[] v = {ret, z, e};
      BigInteger[] x = pow(mat, v, len, bm);
      
      ret = x[0];

      if (preTo >= l)
        break;
    }

    System.out.println(ret);
  }

  public static BigInteger[] pow(BigInteger[][] A, BigInteger[] v, long e, BigInteger mod)
  {
      BigInteger[][] MUL = A;
      for(int i = 0;i < v.length;i++)v[i] = v[i].mod(mod);
      for(;e > 0;e>>>=1) {
          if((e&1)==1)v = mul(MUL, v, mod);
          MUL = p2(MUL, mod);
      }
      return v;
  }
  
  public static BigInteger[] mul(BigInteger[][] A, BigInteger[] v, BigInteger mod)
  {
      int m = A.length;
      int n = v.length;
      BigInteger[] w = new BigInteger[m];
      for(int i = 0;i < m;i++){
          BigInteger sum = BigInteger.ZERO;
          for(int k = 0;k < n;k++){
              sum = sum.add(A[i][k].multiply(v[k])).mod(mod);
          }
          w[i] = sum;
      }
      return w;
  }
  public static BigInteger[][] p2(BigInteger[][] A, BigInteger mod)
  {
      int n = A.length;
      BigInteger[][] C = new BigInteger[n][n];
      for(int i = 0;i < n;i++){
          for(int j = 0;j < n;j++){
              BigInteger sum = BigInteger.ZERO;
              for(int k = 0;k < n;k++){
                  sum = sum.add(A[i][k].multiply(A[k][j])).mod(mod);
              }
              C[i][j] = sum;
          }
      }
      return C;
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
