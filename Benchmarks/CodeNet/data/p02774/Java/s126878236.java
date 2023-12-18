import java.io.*;
import java.util.*;

class ProductCounter {
  final List<Long> as, bs;
  final boolean sameSign;
  
  ProductCounter(List<Long> as, List<Long> bs, boolean sameSign) {
    this.as = as;
    this.bs = bs;
    this.sameSign = sameSign;
  }
  
  public long count(long value) {
    long sum = 0;
    int bIndex = bs.size() - 1;
    for (int aIndex = 0; aIndex < as.size(); aIndex++) {
//      System.err.printf("aIndex: %d, as[aIndex]: %d\n", aIndex, as.get(aIndex));
//      System.err.printf("bIndex: %d, bs[bIndex]: %d\n", bIndex, bs.get(bIndex));
      while (bIndex >= 0 && as.get(aIndex) * bs.get(bIndex) > value) {
        bIndex--;
      }
      if (bIndex < 0) {
        break;
      }
//      System.err.printf("%d %d\n", aIndex, bIndex);
      sum += bIndex + 1;
      if (sameSign && aIndex <= bIndex) {
        sum--;
      }
    }
    if (sameSign) {
      return sum / 2;
    } else {
      return sum;
    }
  }
}

class RankFinder {
  final ProductCounter[] productCounters;
  
  RankFinder(ProductCounter[] productCounters) {
    this.productCounters = productCounters;
  }
  
  public long search(long rank) {
    System.err.println(rank);
    
    long min = 0;
    long max = 1_000_000_000_000_000_001L;
    while (max - min > 1) {
      long mid = (max + min) / 2;
      long count = 0;
      for (ProductCounter productCounter : productCounters) {
        count += productCounter.count(mid);
      }
//      System.err.printf("%d %d %d %d\n", max, min, mid, count);
      if (count < rank) {
        min = mid;
      } else {  // mid >= rank
        max = mid;
      }
    }
    return max;
  }
}

class Solver {
  final int n;
  final long k;
  final long[] as;
  
  Solver(int n, long k, long[] as) {
    this.n = n;
    this.k = k;
    this.as = as;
  }
  
  public long solve() {
    List<Long> positives = new ArrayList<>();
    List<Long> negatives = new ArrayList<>();
    long zeroCount = 0;
    for (long a : as) {
      if (a > 0) {
        positives.add(a);
      } else if (a < 0) {
        negatives.add(Math.abs(a));
      } else {
        zeroCount++;
      }
    }
    Collections.sort(positives);
    Collections.sort(negatives);
    long positiveSize = positives.size();
    long negativeSize = negatives.size();
    
    long negativePairCount = positiveSize * negativeSize;
    if (k <= negativePairCount) {
      RankFinder rankFinder = new RankFinder(new ProductCounter[]{ new ProductCounter(positives, negatives, false) });
      return -1 * rankFinder.search(negativePairCount - k + 1);
    }
    
    long zeroPairCount = (positiveSize + negativeSize) * zeroCount + zeroCount * (zeroCount - 1) / 2;
    if (k <= negativePairCount + zeroPairCount) {
      return 0;
    }
    
    {
      ProductCounter positiveProductCounter = new ProductCounter(positives, positives, true);
      ProductCounter negativeProductCounter = new ProductCounter(negatives, negatives, true);
      RankFinder rankFinder = new RankFinder(new ProductCounter[]{ positiveProductCounter, negativeProductCounter });
      return rankFinder.search(k - negativePairCount - zeroPairCount);
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long k = reader.nextLong();
    long[] as = reader.nextLong(n);
    out.println(new Solver(n, k, as).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}
