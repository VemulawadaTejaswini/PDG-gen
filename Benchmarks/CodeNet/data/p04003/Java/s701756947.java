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
    int n, m, pi, qi, ci;
    int[] minCost;
    List<Integer>[] graph;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      m = in.nextInt();
      graph = (ArrayList<Integer>[]) new ArrayList[2 * n + 1];
      for (int i = 0; i <= 2 * n; ++i)
        graph[i] = new ArrayList<Integer>();
      for (int i = 0; i < m; ++i) {
        pi = in.nextInt();
        qi = in.nextInt();
        ci = in.nextInt();
        graph[pi].add(qi);
        graph[qi].add(pi);
        graph[pi + n].add(ci);
        graph[qi + n].add(ci);
      }
      minCost = new int[n + 1];
      Arrays.fill(minCost, Integer.MAX_VALUE / 2);
      minCost[1] = 0;
      dfs(1, -1, 0);
      int ans = minCost[n] >= Integer.MAX_VALUE / 2 ? -1 : minCost[n];
      out.println(ans);
    }
    
    void dfs(int v, int l, int c) {
      if (v == n)
        return;
      for (int w = 0; w < graph[v].size(); ++w) {
        int nxc = l != graph[v + n].get(w) ? c + 1 : c;
        if (nxc < minCost[graph[v].get(w)]) {
          minCost[graph[v].get(w)] = nxc;
          dfs(graph[v].get(w), graph[v + n].get(w), nxc);
        }
      }
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
