import java.io.*;
import java.util.*;

class Solver {
  final char[] ss, ts;
  
  int m;
  char[] sms;
  int[] suffixArray;
  
  boolean[] hasPrefix;
  int[] lengthCache;
  
  Solver(char[] ss, char[] ts) {
    this.ss = ss;
    this.ts = ts;
  }
  
  private int calculateLowerBound(int depth, int minIndex, int maxIndex, char c) {
    while (maxIndex - minIndex > 1) {
      int midIndex = (maxIndex + minIndex) / 2;
      int ssIndex = (suffixArray[midIndex] + depth) % ss.length;
      char cMid = ss[ssIndex];
      if (cMid < c) {
        minIndex = midIndex;
      } else {
        maxIndex = midIndex;
      }
    }
    return minIndex;
  }
  
  private int calculateUpperBound(int depth, int minIndex, int maxIndex, char c) {
    while (maxIndex - minIndex > 1) {
      int midIndex = (maxIndex + minIndex) / 2;
      int ssIndex = (suffixArray[midIndex] + depth) % ss.length;
      char cMid = ss[ssIndex];
      if (cMid > c) {
        maxIndex = midIndex;
      } else {
        minIndex = midIndex;
      }
    }
    return maxIndex;
  }
  
  private int dfs(int startIndex, int index, boolean firstCall) {
    if (!firstCall && startIndex == index) {
      return -1;
    }
    if (lengthCache[index] > 0) {
      return lengthCache[index];
    }
    if (!hasPrefix[index]) {
      return 0;
    }
    int result = dfs(startIndex, (index + ts.length) % ss.length, false);
    if (result < 0) {
      return result;
    }
    lengthCache[index] = result + 1;
    return lengthCache[index];
  }
  
  public int solve() {
    suffixArray = SuffixArrayBuilder.create(ss);
    
    int lowerBound = -1;
    int upperBound = ss.length;
    for (int depth = 0; depth < ts.length && upperBound - lowerBound >= 2; depth++) {
      int nextLowerBound = calculateLowerBound(depth, lowerBound, upperBound, ts[depth]);
      int nextUpperBound = calculateUpperBound(depth, lowerBound, upperBound, ts[depth]);
      lowerBound = nextLowerBound;
      upperBound = nextUpperBound;
    }
    
    hasPrefix = new boolean[ss.length];
    for (int i = lowerBound + 1; i < upperBound; i++) {
      hasPrefix[suffixArray[i] % ss.length] = true;
    }
    
    lengthCache = new int[ss.length];
    for (int i = 0; i < ss.length; i++) {
      if (!hasPrefix[i] || lengthCache[i] > 0) {
        continue;
      }
      if (dfs(i, i, true) < 0) {
        return -1;
      }
    }
    
    int answer = 0;
    for (int length : lengthCache) {
      answer = Math.max(answer, length);
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] ss = reader.nextCharArray();
    char[] ts = reader.nextCharArray();
    out.println(new Solver(ss, ts).solve());
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

class SuffixArrayBuilder {
  public static int[] create(char[] cs) {
    int n = cs.length;
    
    Integer[] suffixArrayInteger = new Integer[n];
    int[] rank = new int[n];
    for (int i = 0; i < n; i++) {
      suffixArrayInteger[i] = new Integer(i);
      rank[i] = (int) cs[i];
      
    }
    
    for (int k = 1; k <= n; k *= 2) {
      final int kFinal = k;
      final int[] rankFinal = rank;
      final Comparator<Integer> comparator = new Comparator<Integer>() {
        public int compare(Integer i1, Integer i2) {
          if (rankFinal[i1] != rankFinal[i2]) {
            return rankFinal[i1] - rankFinal[i2];
          }
          int rank1 = rankFinal[(i1 + kFinal) % n];
          int rank2 = rankFinal[(i2 + kFinal) % n];
          return rank1 - rank2;
        }
      };
      
      Arrays.sort(suffixArrayInteger, comparator);
      int[] nextRank = new int[n];
      for (int i = 1; i < n; i++) {
        nextRank[i] = rank[i];
      }
      nextRank[suffixArrayInteger[0]] = 0;
      for (int i = 1; i < n; i++) {
        nextRank[suffixArrayInteger[i]] = nextRank[suffixArrayInteger[i - 1]]
            + (comparator.compare(suffixArrayInteger[i - 1], suffixArrayInteger[i]) < 0 ? 1 : 0);
      }
      rank = nextRank;
      
      /*
      System.out.println("------------------------");
      for (int i = 0; i <= n; i++) {
        String temp = new String(cs).substring(suffixArrayInteger[i]);
        System.out.printf("%3d: %3d, %40s %40s\n", i, suffixArrayInteger[i], temp.substring(0, Math.min(k, temp.length())), temp);
      }
      */
    }
    
    int[] suffixArray = new int[n];
    for (int i = 0; i < n; i++) {
      suffixArray[i] = suffixArrayInteger[i];
    }
    
    return suffixArray;
  }
}
