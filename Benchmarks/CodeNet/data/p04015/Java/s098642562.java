// -*- coding: utf-8 -*-
//import java.awt.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    InputStream inputStream;
    if (args.length > 0 && args[0].equals("devTesting")) {
      try {
        inputStream = new FileInputStream(args[1]);
      } catch(FileNotFoundException e) {
        throw new RuntimeException(e);
      }
    } else {
      inputStream = System.in;
    }
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskC {    
    int n, a, xi;
    int[] cards;
    long[][][] state;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      a = in.nextInt();
      cards = new int[n];
      for (int i = 0; i < n; ++i) {
        xi = in.nextInt();
        cards[i] = xi;
      }
      state = new long[n][n * 50 + 1][n + 1];
      for (long[][] i : state) {
        for (long[] j : i) {
          Arrays.fill(j, -1L);
        }
      }
      out.println(go(n - 1, 0, 0));
    }
    
    long go(int pos, int s, int t) {
      if (pos < 0) {
        if (t > 0 && s % t == 0 && s / t == a) {
          return 1L;
        }
        return 0L;
      }
      if (state[pos][s][t] != -1L) {
        return state[pos][s][t];
      }
      long ans = go(pos - 1, s + cards[pos], t + 1) + go(pos - 1, s, t);
      state[pos][s][t] = ans;
      return ans;
    }
    
  }
      
  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream));
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }
    
    public String nextLine() {
      try {
        return reader.readLine();
      } catch(IOException e) {
        throw new RuntimeException(e);
      }
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

    public boolean hasInput() {
      try {
        if (tokenizer != null && tokenizer.hasMoreTokens()) {
          return true;
        }
        reader.mark(1);
        int ch = reader.read();
        if (ch != -1) {
          reader.reset();
          return true;
        }
        return false;
      } catch(IOException e) {
        throw new RuntimeException(e);
      }
    }
    
  }
}
