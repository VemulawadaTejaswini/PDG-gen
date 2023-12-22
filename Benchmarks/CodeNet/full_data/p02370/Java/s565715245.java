import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<LinkedList<Integer>> graph;
    public static void main(String[] args) throws Exception{
        FastScanner scanner = new FastScanner();
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new ArrayList<>(V);
        for(int i = 0; i < V; ++i){
            graph.add(new LinkedList<>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>(V);

        for(int i = 0; i < V; ++i){
            if(!visited[i]){
                dfs(i, visited, result);
            }
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        for(int i = V - 1; i >= 0; --i){
            printWriter.println(result.get(i));
        }
        printWriter.flush();
    }

    private static void dfs(int u, boolean[] visited, ArrayList<Integer> result){
        visited[u] = true;
        for(Integer v : graph.get(u)){
            if(!visited[v]){
                dfs(v, visited, result);
            }
        }

        result.add(u);
    }

    private static class FastScanner{
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}