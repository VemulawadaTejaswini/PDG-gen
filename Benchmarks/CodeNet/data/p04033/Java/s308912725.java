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
  private static String solve(int a, int b) {
    if (a <= 0 && 0 <= b) {
      return "Zero";
    }
    if (0 < a) {
      return "Positive";
    }
    if ((b - a) % 2 == 0) {
      return "Negative";
    }
    return "Positive";
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int a = reader.nextInt();
    int b = reader.nextInt();
    System.out.println(solve(a, b));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

