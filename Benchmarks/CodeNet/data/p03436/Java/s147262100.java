import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderD.init(System.in);
        int h = ReaderD.nextInt();
        int w = ReaderD.nextInt();
        char[][] grid = new char[h][w];
        for (int i = 0; i < grid.length; i++) grid[i] = ReaderD.next().toCharArray();
        Graph gridGraph = new Graph(h*w);
        int white = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '.') {
                    white++;
                    if (i + 1 < grid.length && grid[i + 1][j] == '.') gridGraph.addEdge(i*w + j, (i + 1)*w + j);
                    if (j + 1 < grid[i].length && grid[i][j + 1] == '.') gridGraph.addEdge(i*w + j, i*w + j + 1);
                }
            }
        }

        gridGraph.bfs(0);
        if (gridGraph.distTo[h*w - 1] == -1) System.out.println(-1);
        else System.out.println(white - gridGraph.distTo[h*w - 1] - 1);
    }
}

class Graph{
    private int V;
    private ArrayList<Integer> adj[];
    private boolean visitedBFS[];
    private LinkedList<Integer> queue;
    int[] distTo;

    Graph(int V){
        this.V = V;
        adj = (ArrayList<Integer>[]) new ArrayList[V];
        visitedBFS = new boolean[V];
        distTo = new int[V];
        Arrays.fill(distTo, -1);
        queue = new LinkedList<>();
        for (int i = 0; i < V; i++) adj[i] = new ArrayList<>();
    }

    int vertices(){
        return V;
    }

    void bfs(int x){
        visitedBFS[x] = true;
        queue.addLast(x);
        distTo[x] = 0;
        while (!queue.isEmpty()){
            int s = queue.getFirst(); queue.removeFirst();
            for (int u: adj[s]){
                if (visitedBFS[u]) continue;
                visitedBFS[u] = true;
                queue.addLast(u);
                distTo[u] = 1 + distTo[s];
            }
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    Iterable<Integer>[] getAdj(){
        return adj;
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderD {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    //    Get a whole line.
    static String line() throws IOException {
        return reader.readLine();
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

