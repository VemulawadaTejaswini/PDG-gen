import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int cnts[] = new int[n];
        int cnt = 0;
        ans = new int[n-1];
        Deque<edge> q = new ArrayDeque<>();
        for(int i = 0; i < n-1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;b--;
            cnts[a]++;
            cnts[b]++;
            q.add(new edge(a,b,i,false));
        }
        int priority = 0;
        int ind = 0;
        for(int c : cnts){
            if(c > cnt){
                priority = ind;
                cnt = c;
            }
            ind++;
        }
        System.out.println(cnt);
        used = new boolean[n][cnt];
        while(q.size() > 0){
            edge e = q.poll();
            int p1 = e.p;
            int p2 = e.p2;
            int index = e.i;
            if(!e.roop && p1 != priority && p2 != priority){
                q.add(new edge(p1,p2,index,true));
            }
            for(int i = 0; i < cnt; i++){
                if(!used[p1][i] && !used[p2][i]){
                    used[p1][i] = true;
                    used[p2][i] = true;
                    ans[index] = i;
                    break;
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            System.out.println(ans[i]+1);
        }
    }
    
}
class edge{
    int p,p2,i;
    boolean roop;
    public edge(int p, int p2, int i, boolean roop){
        this.p = p;
        this.p2 = p2;
        this.i = i;
        this.roop = roop;
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


