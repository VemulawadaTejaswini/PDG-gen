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
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }
  
  static class TaskD {    
    int h, w, n, ai, bi;
    Map<Long, Integer> map;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      h = in.nextInt();
      w = in.nextInt();
      n = in.nextInt();
      map = new HashMap<Long, Integer>();
      for (int i = 0; i < n; ++i) {
        ai = in.nextInt();
        bi = in.nextInt();
        for (int j = -2; j <= 0; ++j)
          for (int k = -2; k <= 0; ++k)
            if (isWithin(ai + j, bi + k) && isWithin(ai + j + 2, bi + k + 2)) {
              long hash = pack(ai + j, bi + k);
              if (!map.containsKey(hash))
                map.put(hash, 1);
              else
                map.put(hash, map.get(hash) + 1);
            }
      }
      long[] total = new long[10];
      total[0] = (long) (h - 2) * (w - 2);
      for (long i : map.keySet()) {
        --total[0];
        ++total[map.get(i)]; 
      }
      for (int i = 0; i < 10; ++i)
        out.println(total[i]);
    }
    
    boolean isWithin(int x, int y) {
      return x >= 1 && x <= h && y >= 1 && y <= w;
    }
    
    long pack(long a, long b) {
      return a << 32 | b;
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
