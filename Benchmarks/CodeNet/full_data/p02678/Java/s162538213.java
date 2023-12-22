import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] arrived = new boolean[n];
        arrived[0] = true;
        int arrivedCnt = 1;
        int[] ans = new int[n];
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        for(int i = 0; i < n; i++){
            map.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            map.get(a).add(b);
            map.get(b).add(a);
        }
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.add(0);
        while(q.size() > 0){
            int now = q.poll();
            for(int next : map.get(now)){
                if(arrived[next]){
                    continue;
                }else{
                    arrived[next] = true;
                    ans[next] = now+1;
                    arrivedCnt++;
                    q.add(next);
                }
            }
        }
        if(arrivedCnt != n){
            System.out.println("No");
        }else{
            System.out.println("Yes");
            for(int i = 1; i < n; i++){
                System.out.println(ans[i]);
            }
        }
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
