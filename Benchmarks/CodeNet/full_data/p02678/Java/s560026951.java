import java.io.*;
import java.util.*;
public class Main {
    static List<Integer> al[];
    static boolean visited[];
    static int depth[];
    private static void bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        depth[x] = 1;
        while(q.size() > 0){
            int xx = q.poll();
            for(int child : al[xx]){
                if(!visited[child]){
                    visited[child] = true;
                    q.add(child);
                    depth[child] = xx+1;
                }
            }
        }
    }
    private static void solver(InputReader sc, PrintWriter out) {
       int n = sc.nextInt();
       int m = sc.nextInt();
       al = new ArrayList[n];
       visited = new boolean[n];
       depth = new int[n];
       for(int i=0; i<n; i++) al[i] = new ArrayList<>();
       for(int i=0; i<m; i++){
           int x = sc.nextInt()-1;
           int y = sc.nextInt()-1;
           al[x].add(y);
           al[y].add(x);
       }
       bfs(0);
       for(int i=1; i<n; i++){
          if(depth[i]==0){
              out.println("No");
              return;
          }
       }
       out.println("Yes");
       for(int i=1; i<n; i++){
           out.println(depth[i]);
       }
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
        public int[] readIntArray(int n){
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = nextInt();
            return arr;
        }
    }
}
class Pair{
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}