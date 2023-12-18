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
      long lo = 0, hi = n - 1, mid = -1;
      while (true) {
        mid = (lo + hi) / 2;
        long a = f(lo);
        long b = f(hi);
        if (a == b)
          break;
        if (a < b)
          hi = mid - 1;
        else
          lo = mid + 1;
      }
      out.println(f(mid));
    }
    
    long f(long targ) {
      long test = 0;
      for (int i = 0; i < n; ++i) {
        long val = a[i];
        for (int j = 0; j < n; ++j) {
          long diff = j > i ? j - i : (j + n - i) % n;
          if (diff <= targ)
            val = Math.min(val, a[j]);
        }
        test += val;
      }
      return test + targ * x;
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
