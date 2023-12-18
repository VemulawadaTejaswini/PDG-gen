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

public class Main {
  private static long solve(long[] as) {
    long[] dptable = new long[as.length + 1];
    dptable[0] = 0;
    dptable[1] = as[0] / 2;
    for (int i = 2; i <= as.length; i++) {
      dptable[i] = Math.max(dptable[i-2] + Math.min(as[i-1], as[i-2]), dptable[i-1] + as[i-1] / 2);
    }
    return dptable[as.length];
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] as = new long[n];
    for (int i = 0; i < n; i++) {
      as[i] = reader.nextLong();
    }
    out.println(solve(as));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

