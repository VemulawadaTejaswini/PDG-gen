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
    int n, k, l, p, q, r, s, ptr;
    int[][] comp;
    List<Integer>[][] graph;
    
    void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      k = in.nextInt();
      l = in.nextInt();
      graph = (ArrayList<Integer>[][]) new ArrayList[2][n + 1];
      for (int i = 0; i < 2; ++i)
        for (int j = 0; j <= n; ++j)
          graph[i][j] = new ArrayList<Integer>(); 
      for (int i = 0; i < k; ++i) {
        p = in.nextInt();
        q = in.nextInt();
        graph[0][p].add(q);
        graph[0][q].add(p);
      }
      for (int i = 0; i < l; ++i) {
        r = in.nextInt();
        s = in.nextInt();
        graph[1][r].add(s);
        graph[1][s].add(r);
      }
      comp = new int[2][n + 1];
      int[] ans = new int[n + 1];
      Arrays.fill(ans, 1);
      for (int j = 1; j <= n; ++j) {
        if (comp[0][j] == 0) {
          Set<Integer>[] set = (TreeSet<Integer>[]) new TreeSet[2];
          set[0] = new TreeSet<Integer>();
          ptr = j;
          dfs(graph[0], j, comp[0], set[0]);
          for (int k : set[0]) {
            if (comp[1][k] == 0) {
              ptr = k;
              set[1] = new TreeSet<Integer>();
              dfs(graph[1], k, comp[1], set[1]);
              if (set[1] != null) {
        //~ System.err.println(k);
        //~ System.err.println(set[0]);
        //~ System.err.println(set[1]);
        //~ System.err.println();
                int cnt = 0;
                List<Integer> list = new ArrayList<Integer>();
                for (int kk : set[0])
                  if (set[1].contains(kk)) {
                    ++cnt;
                    list.add(kk);
                  }
                for (int kk : list)
                  ans[kk] += cnt - 1;
              }
            }
          }
        }
      }
      out.print(ans[1]);
      for (int i = 2; i <= n; ++i)
        out.print(" " + ans[i]);
      out.println();
    }
    
    void dfs(List<Integer>[] graph, int v, int[] comp, Set<Integer> set) {
      comp[v] = ptr;
      set.add(v);
      for (int w : graph[v])
        if (comp[w] == 0)
          dfs(graph, w, comp, set);
    }
    
    int i(long x) {
      return (int) x;
    }
    
    <T> void heapSort(T[] a, int s, int e) {
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
