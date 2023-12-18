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
  private ArrayList<Integer> b;
  private ArrayList<Integer> operations;
  
  private boolean dfs() {
    if (b.size() == 0) {
      return true;
    }
    for (int i = b.size() - 1; i >= 0; i--) {
      if (b.get(i) > i+1) {
        return false;
      } else if (b.get(i) == i+1) {
        b.remove(i);
        if (dfs()) {
          operations.add(i + 1);
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }
  
  public List<Integer> solve(ArrayList<Integer> b) {
    this.b = b;
    this.operations = new ArrayList<>();
    if (dfs()) {
      return this.operations;
    } else {
      return Arrays.asList(-1);
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    ArrayList<Integer> b = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      b.add(reader.nextInt());
    }
    List<Integer> solution = new Solver().solve(b);
    for (int num : solution) {
      out.println(num);
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

