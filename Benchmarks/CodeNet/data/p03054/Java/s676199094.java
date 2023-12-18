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
  int h;
  int w;
  int sr;
  int sc;
  char[] s;
  char[] t;
  
  
  private boolean canFallHorizontal() {
    int aliveMax = w;
    int aliveMin = 1;
    
    for (int i = s.length - 1; i >= 0; i--) {
      switch (t[i]) {
      case 'R':
        aliveMin = Math.max(aliveMin - 1, 1);
        break;
      case 'L':
        aliveMax = Math.min(aliveMax + 1, w);
        break;
      }
      
      switch (s[i]) {
      case 'R':
        aliveMax--;
        break;
      case 'L':
        aliveMin++;
        break;
      }
      if (aliveMin > aliveMax) {
        return true;
      }
    }
//    System.err.println(aliveMin);
//    System.err.println(aliveMax);
    if (aliveMin <= sc && sc <= aliveMax) {
      return false;
    }
    return true;
  }
  
  private boolean canFallVertical() {
    
    
    int aliveMax = h;
    int aliveMin = 1;
    
    for (int i = s.length - 1; i >= 0; i--) {
//      System.err.printf("%d %d\n", aliveMin, aliveMax);
      switch (t[i]) {
      case 'D':
        aliveMin = Math.max(aliveMin - 1, 1);
        break;
      case 'U':
        aliveMax = Math.min(aliveMax + 1, h);
        break;
      }
      
      switch (s[i]) {
      case 'D':
        aliveMax--;
        break;
      case 'U':
        aliveMin++;
        break;
      }
      if (aliveMin > aliveMax) {
        return true;
      }
    }
//    System.err.println(aliveMin);
//    System.err.println(aliveMax);
    if (aliveMin <= sr && sr <= aliveMax) {
      return false;
    }
    return true;
  }
  
  
  public String solve(int h, int w, int sr, int sc, char[] s, char[] t) {
    this.h = h;
    this.w = w;
    this.sr = sr;
    this.sc = sc;
    this.s = s;
    this.t = t;
    
    if (canFallHorizontal()) {
      return "No";
    }
    if (canFallVertical()) {
      return "No";
    }
    return "Yes";
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int n = reader.nextInt();
    int sr = reader.nextInt();
    int sc = reader.nextInt();
    char[] s = reader.next().toCharArray();
    char[] t = reader.next().toCharArray();
    out.println(new Solver().solve(h, w, sr, sc, s, t));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

