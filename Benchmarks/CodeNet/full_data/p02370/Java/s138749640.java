import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer>[] graph;
    private static int[] in;
    public static void main(String[] args) throws Exception{
        FastScanner scanner = new FastScanner();
        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new List[V];
        in = new int[V];
        for(int i = 0; i < V; ++i){
            graph[i] = new LinkedList<>();
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u].add(v);
            ++in[v];
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < V; ++i){
            if(in[i] == 0){
                queue.add(i);
            }
        }

        List<Integer> result = new ArrayList<>(V);
        while(!queue.isEmpty()){
            Integer u = queue.remove();
            result.add(u);
            for(Integer v : graph[u]){
                --in[v];
                if(in[v] == 0){
                    queue.add(v);
                }
            }
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        for(Integer n : result){
            printWriter.println(n);
        }
        printWriter.flush();
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