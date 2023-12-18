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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskB {    
    int n;
    long x;
    long[] a;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      x = in.nextInt();
      a = new long[n];
      for (int i = 0; i < n; ++i)
        a[i] = in.nextInt();
      long ans = 0;
      long[] changes = new long[n];
      for (int i = 0; i < n; ++i) {
        long val = a[i], val2 = a[i], minDiff = Long.MAX_VALUE / 2;
        for (int j = 0; j < n; ++j) {
          long diff = j > i ? j - i : (n - i + j) % n;
          if (a[j] + x * diff < a[i] && diff < minDiff) {
            val = a[j] + x * diff;
            minDiff = diff;
            val2 = a[j];
            changes[i] = diff;
          }
        }
        ans += val2;
      }
      long best = 0;
      for (int i = 0; i < n; ++i)
        best = Math.max(best, changes[i]);
      ans += best * x;
      out.println(ans);
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
