import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {
    static int max; static  int arr[][]; static boolean visited[][];
    static int depth[][]; static int n,m;
    private static void bfs(int x1, int y1){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x1,y1));
        while(q.size() > 0){
            Pair p = q.poll();
            int x = p.x; int y = p.y;
            visited[x][y] = true;
            if(x+1 < n && !visited[x+1][y] && arr[x+1][y]==0) {
                q.add(new Pair(x + 1, y));
                depth[x+1][y] = 1 + depth[x][y];
                if(depth[x+1][y] > max) max = depth[x+1][y];
            }
            if(x-1 >=0 && !visited[x-1][y] && arr[x-1][y]==0) {
                q.add(new Pair(x - 1, y));
                depth[x-1][y] = 1 + depth[x][y];
                if(depth[x-1][y] > max) max = depth[x-1][y];
            }
            if(y+1 < m && !visited[x][y+1] && arr[x][y+1]==0) {
                q.add(new Pair(x, y + 1));
                depth[x][y+1] = 1 + depth[x][y];
                if(depth[x][y+1] > max) max = depth[x][y+1];
            }
            if(y-1 >=0 && !visited[x][y-1] && arr[x][y-1]==0) {
                q.add(new Pair(x, y - 1));
                depth[x][y-1] = 1 + depth[x][y];
                if(depth[x][y-1] > max) max = depth[x][y-1];
            }
        }
    }
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
             n = sc.nextInt();
             m = sc.nextInt();
           arr = new int[n][m];
           visited = new boolean[n][m];
           depth  = new int[n][m];
            for(int i=0; i<n; i++){
                    String s = sc.next();
                for(int j=0; j<s.length(); j++) {
                    if (s.charAt(j)=='#') arr[i][j] = 1;
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(arr[i][j]==0) {
                       for(int k=0; k<n; k++){
                           for(int l=0; l<m; l++){
                               visited[k][l] = false;
                               depth[k][l] = 0;
                           }
                       }
                        bfs(i, j);
                    }
                }
            }
            out.println(max);
    }
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
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
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p){
        return (int)(this.x - p.x);
    }
}
class Tuple{
    String s;
    int x, y;

    public Tuple(String s, int x, int y) {
        this.s = s;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return x == tuple.x &&
                y == tuple.y &&
                s.equals(tuple.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, x, y);
    }
}