import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[] arrived;
    static ArrayList<ArrayList<Integer>> map;
    static long mod = (long)1e9+7;
    static long INF = Long.MAX_VALUE/3;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arrived = new boolean[n];
        map = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            map.get(x).add(y);
        }
        int s = sc.nextInt()-1;
        int t = sc.nextInt()-1;
        long[][] dist = new long[n+1][3];
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i],INF);
        }
        Deque<Point> q = new ArrayDeque<Point>();
        q.add(new Point(s,0));
        dist[s][0] = 0;
        while(q.size() > 0){
            Point p = q.poll();
            int now = p.now;
            int cnt = p.cnt;
            for(int next : map.get(now)){
                int nc = (cnt+1)%3;
                if(dist[next][nc] != INF) {
                    continue;
                }
                dist[next][nc] = dist[now][cnt]+1;
                q.push(new Point(next,nc));
            }
        }
        long ans = dist[t][0];
        pw.println(ans == INF ? -1 : ans/3);
        pw.flush();
    }
    
    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
    }
}

class Point{
    int now,cnt;
    public Point(int n, int c){
        this.now = n;
        this.cnt = c;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
