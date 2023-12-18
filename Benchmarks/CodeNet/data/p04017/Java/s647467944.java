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
    TaskE solver = new TaskE();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskE {    
    int n, l, q, xi, ai, bi;
    int[][] hotelsPos;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      hotelsPos = new int[2][n];
      for (int i = 0; i < n; ++i) {
        hotelsPos[0][i] = in.nextInt();
        hotelsPos[1][n - i - 1] = Integer.MAX_VALUE / 2 - hotelsPos[0][i];
      }
      l = in.nextInt();
      q = in.nextInt();
      for (int i = 0; i < q; ++i) {
        ai = in.nextInt();
        bi = in.nextInt();
        int a = ai - 1;
        int b = bi - 1;
        out.println(time(a, b));
      }
    }
    
    int time(int a, int b) {
      int idx = 0;
      if (a > b) {
        idx = 1;
        a = n - a - 1;
        b = n - b - 1;
      }
      int ptr = a, ptr2 = a + 1, validPtr = a, days = 0;
      while (ptr < b && ptr2 < n) {
        if (hotelsPos[idx][ptr2] - l <= hotelsPos[idx][ptr]) {
          validPtr = ptr2;
        } else {
          ++days;
          ptr = validPtr;
          ptr2 = validPtr;
        }
        ++ptr2;
      }
      if (validPtr > ptr) {
        ++days;
      }
      return days;
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
