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
    int[] a;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      a = new int[n];
      int[] p = new int[n + 1];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
        p[a[i]] = i;
      }
      TreeSet<Integer> set = new TreeSet<Integer>();
      set.add(-1);
      set.add(n);
      long ans = 0;
      for (int i = 1; i <= n; ++i) {
        int l = -1, r = -1;
        if (set.lower(p[i]) != null)
          l = set.lower(p[i]) + 1;
        else
          l = p[i];
        if (set.higher(p[i]) != null)
          r = set.higher(p[i]) - 1;
        else
          r = p[i];
        ans += (long) (p[i] - l + 1) * (r - p[i] + 1) * i;
        set.add(p[i]);
      }
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
