import java.io.*;
import java.util.*;

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
}

class Solver {
  long[] as;
  
  private long solveRangeSmall(int minIndex, int maxIndex) {
    long sum = 0;
    for (int i = minIndex; i < maxIndex; i++) {
      long minValue = as[i];
      for (int j = i + 1; j <= maxIndex; j++) {
        minValue = Math.min(minValue, as[j-1]);
        sum += minValue;
      }
    }
    return sum;
  }
  
  private long getFixedRange(int index, int minIndex, int maxIndex) {
    if (index < minIndex || maxIndex <= index) {
      return -1;
    }
    return as[index];
  }
  
  private long solveRangeWithCenterFix(int minIndex, int maxIndex, int centerIndex) {
    long minValue = Math.min(as[centerIndex - 1], as[centerIndex]);
    long sum = minValue;
    
    int smallCursor = centerIndex - 2;
    int largeCursor = centerIndex + 1;
    while (minIndex <= smallCursor || largeCursor < maxIndex) {
//      System.err.printf("%d %d %d %d\n", minIndex, smallCursor, largeCursor, maxIndex);
      long smallCursorValue = getFixedRange(smallCursor, minIndex, maxIndex);
      long largeCursorValue = getFixedRange(largeCursor, minIndex, maxIndex);
      if (smallCursorValue > largeCursorValue) {
        minValue = Math.min(minValue, smallCursorValue);
        sum += minValue * (largeCursor - centerIndex);
        smallCursor--;
//        System.err.printf("Move small: %d %d %d\n", sum, largeCursor, centerIndex);
      } else {
        minValue = Math.min(minValue, largeCursorValue);
        sum += minValue * (centerIndex - smallCursor - 1);
        largeCursor++;
//        System.err.printf("Move large: %d %d %d\n", sum, smallCursor, centerIndex);
      }
    }
//    System.err.println(sum);
    return sum;
  }
  
  private long solveRange(int minIndex, int maxIndex) {
//    System.err.printf("%d, %d\n", minIndex, maxIndex);
    if (maxIndex - minIndex < 4) {
      return solveRangeSmall(minIndex, maxIndex);
    }
    int midIndex = (minIndex + maxIndex) / 2;
    long sum1 = solveRangeWithCenterFix(minIndex, maxIndex, midIndex);
    long sum2 = solveRange(minIndex, midIndex);
    long sum3 = solveRange(midIndex, maxIndex);
    return sum1 + sum2 + sum3;
  }
  
  public long solve(long[] as) {
    this.as = as;
    return solveRange(0, as.length);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] as = new long[n];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextLong();
    }
    out.println(new Solver().solve(as));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

