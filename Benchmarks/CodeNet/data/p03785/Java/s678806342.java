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
    TaskA solver = new TaskA();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskA {    
//    Pair[] t;
    int[] t;
    int c, k, n;
    
    class PairII {
      int a, b;
      
      public int compareTo(PairII other) {
        if (this.a != other.a) {
          return this.a - other.a;
        }
        return this.b - other.b;
      }
    }
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      c = in.nextInt();
      k = in.nextInt();
//      t = new PairII[2 * n];
      t = new int[n];
      for (int i = 0; i < n; ++i) {
        t[i] = in.nextInt();
      }
      
      Arrays.sort(t);
      int cnt = 0, actc = 0, limit = -1;
      for (int i = 0; i < n; ++i) {
        if (limit == -1 || t[i] > limit || actc == c) {
          actc = 0;
          limit = t[i] + k;
          ++cnt;
          ++actc;
        } else {
          ++actc;
        }
      }
      
      out.println(cnt);
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
