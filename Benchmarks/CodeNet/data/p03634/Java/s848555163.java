import java.util.*;
import java.io.*;
 
public class Main {
    static ArrayList<HashMap<Integer,Long>> memo;
    static ArrayList<ArrayList<Point>> map;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        memo = new ArrayList<HashMap<Integer,Long>>();
        map = new ArrayList<ArrayList<Point>>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<Point>());
            memo.add(new HashMap<Integer,Long>());
        }
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            int c = sc.nextInt();
            map.get(a).add(new Point(b,c));
            map.get(b).add(new Point(a,c));
        }
        int q = sc.nextInt();
        int s = sc.nextInt()-1;
        for(int i = 0; i < q; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            boolean[] arrived = new boolean[n];
            arrived[a] = true;
            long ans = dfs(a,s,0,arrived);
            arrived[a] = false;
            arrived[b] = true;
            ans += dfs(b,s,0,arrived);
            System.out.println(ans);
        }
    }
    
    public static long dfs(int s, int g, long dist, boolean[] a){
        if(s == g){
            return dist;
        }else if(memo.get(s).containsKey(g)){
            return dist + memo.get(s).get(g);
        }
        long ret = Long.MAX_VALUE/2;
        for(Point p : map.get(s)){
            if(!a[p.x]){
                a[p.x] = true;
                long tmp = dfs(p.x,g,dist+p.d,a);
                if(tmp != Long.MAX_VALUE/2){
                    memo.get(s).put(g,tmp);
                    memo.get(g).put(s,tmp);
                }
                ret = Math.min(ret,tmp);
                a[p.x] = false;
            }
        }
        return ret;
    }
    
}

class Point{
    int x;
    long d;
    public Point(int x, long d){
        this.x = x;
        this.d = d;
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
