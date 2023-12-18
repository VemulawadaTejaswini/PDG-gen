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
    final int ring = (int) 1e9 + 7;
    int n;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      int[] divisors = new int[n + 1];
      for (int i = 1; i <= n; ++i) {
        int x = i;
        for (int j = 2; j <= n; ++j) {
          while (x % j == 0) {
            ++divisors[j];
            x /= j;
          }
        }
      }
      long ans = 1;
      for (int i = 2; i <= n; ++i) {
          ans = mul(ans, divisors[i] + 1);
      }
      out.println(ans);
    }
    
    boolean isprime(int x) {
      for (int i = 2; i * i <= x; ++i) {
        if (x % i == 0) {
          return false;
        }
      }
      return true;
    }
    
    long mul(long a, long b) {
      return a * b % ring;
    }
    
    int i(long x) {
      return (int) x;
    }
    
    <T> void heapsort(T[] a, int s, int e) {
      Queue<T> queue = new PriorityQueue<>();
      for (int i = s; i <= e; ++i)
        queue.add(a[i]);
      for (int i = s; i <= e; ++i)
        a[i] = queue.poll();
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
