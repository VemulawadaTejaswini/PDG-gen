import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> same = new ArrayList<>();
        ArrayList<ArrayList<Integer>> reverse = new ArrayList<>();
        HashMap<Integer,Integer> cost = new HashMap<>();
        boolean[] checked = new boolean[n];
        for(int i = 0; i < n; i++){
            same.add(new ArrayList<Integer>());
            reverse.add(new ArrayList<Integer>());
            cost.put(i,0);
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            cost.put(x,cost.get(x)+1);
            cost.put(y,cost.get(y)+1);
            int z = sc.nextInt()%2;
            if(z == 0){
                same.get(x).add(y);
                same.get(y).add(x);
            }else{
                reverse.get(x).add(y);
                reverse.get(y).add(x);
            }
        }
        int ans = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>(cost);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int k = e.getKey();
            int v = e.getValue();
            if(v == 0) break;
            if(!checked[k]){
                ans++;
                checked[k] = true;
            }
            for(int x : same.get(k)){
                checked[x] = true;
            }
            for(int y : reverse.get(k)){
                checked[y] = true;
            }
        }
        for(boolean b : checked){
            if(!b) ans++;
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
