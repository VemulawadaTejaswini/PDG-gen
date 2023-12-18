import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> work = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < m; i++){
            work.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt();
            if(a >= m){
                continue;
            }
            work.get(a).add(b);
        }
        Queue<Integer> q = new PriorityQueue<Integer>();
        int cnt = 1;
        for(int i = 1; i <= m; i++){
            int j = 0;
            int li = 0;
            Collections.sort(work.get(m-i),Comparator.reverseOrder());
            while(cnt > j && li < work.get(m-i).size()){
                if(cnt > q.size()){
                    q.add(work.get(m-i).get(li));
                }else{
                    int prev = q.poll();
                    q.add(Math.max(prev,work.get(m-i).get(li)));
                }
                j++;
                li++;
            }
            cnt++;
        }
        long ans = 0;
        while(q.size() > 0){
            ans += q.poll();
        }
        System.out.println(ans);
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
