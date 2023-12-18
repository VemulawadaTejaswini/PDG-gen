import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
public class Main {
  	static class Graph {
      int N;
      ArrayList<ArrayList<Integer>> list;
      HashMap<Integer, Integer> counter;
      public Graph(int v){
      	N = v;
        list = new ArrayList<>();
        counter = new HashMap<>();
        for(int i = 0; i <= v; i++)
          list.add(i, new ArrayList<>());
      }
      public void addEdge(int v1, int v2){
        list.get(v1).add(v2);
      }
      public void addToCounter(int v, int x){
      	counter.put(v, counter.getOrDefault(v, 0) + x);
      }
    }
  
  static void dfsUtil(Graph g, int i, boolean[] visited, int count) {
        visited[i] = true;
    	g.addToCounter(i, count);
        for(Integer x : g.list.get(i)) {
            if(!visited[x]) 
              dfsUtil(g, x, visited, count);
        }
    }
   
    
    static void dfs(Graph g, int v, int count) {
        boolean[] visited = new boolean[g.N + 1];
        for(int i = 1; i <= g.N; i++) {
            visited[i] = false;
        }
		
        dfsUtil(g, v, visited, count);
    }
	public static void main(String... args) throws Exception {
      InputStream inputStream = System.in;
      OutputStream outputStream = System.out;
	  InputReader in = new InputReader(inputStream);
	  PrintWriter out = new PrintWriter(outputStream);
      String[] u = in.readLine().split(" ");
      int N = Integer.parseInt(u[0]);
      int Q = Integer.parseInt(u[1]);
      HashMap<Integer, Integer> queries = new HashMap<>();
      Graph g = new Graph(N);  
      for(int i = 1; i < N; i++){
        String[] y = in.readLine().split(" ");
        g.addEdge(
          Integer.parseInt(y[0]), 
          Integer.parseInt(y[1])
        );
      }
      
      for(int i = 0; i < Q; i++){
        String[] z = in.readLine().split(" ");
      	int p = Integer.parseInt(z[0]);
        int x = Integer.parseInt(z[1]);
        dfs(g, p, x);
      }
      
      for(int i = 1; i <= N; i++) {
      	System.out.print(g.counter.get(i)+" ");
      }
      
    }
  
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        private String readLine0() {
            StringBuilder buf = new StringBuilder();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r') {
                    buf.appendCodePoint(c);
                }
                c = read();
            }
            return buf.toString();
        }

        public String readLine() {
            String s = readLine0();
            while (s.trim().length() == 0) {
                s = readLine0();
            }
            return s;
        }

    }
}