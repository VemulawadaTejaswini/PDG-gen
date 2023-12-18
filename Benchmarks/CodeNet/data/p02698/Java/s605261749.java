import java.io.*;
import java.math.*;
import java.util.*;


public class Main{
    static long MOD = 998244353 ;
    static long [] fac;
    static ArrayList<Integer> graph[];
    static boolean [] used;
    static int a[];
    static int res[];
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
            int n = sc.nextInt();
            res = new int[n + 1];
            graph = new ArrayList[n + 1];
            used = new boolean [n + 1];
            a = new int[n + 1];
            for(int i = 1; i <= n; i++)
            {
                a[i] = sc.nextInt();
                graph[i] = new ArrayList();
            }
            for(int i = 1; i < n; i++)
            {
                int u = sc.nextInt(), v = sc.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }
            ArrayList<Integer> list = new ArrayList();
            list.add(0);
            list.add(a[1]);
            dfs(1, list);
            for(int i = 1; i <= n; i ++)
                out.println(res[i]);
        }
        out.close();
    }
    public static void dfs(int node, ArrayList<Integer> list)
    {
        used[node] = true;
        boolean add = false;
        int ori = 0;
        int index = Collections.binarySearch(list, a[node]);
        if(index < 0) index = -1 - index;
        //System.out.println("index : " + oindex  + " node: " + a[node] + " list: " + list);
        if(list.size() <= index)
        {
            add = true;
            list.add(a[node]);
        }
        else
        {
            ori = list.get(index);
            list.set(index, a[node]);
        }
        //System.out.println(node + " " + list);
        res[node] = list.size() - 1;
        for(int nei : graph[node])
        {
            if(used[nei]) continue;
            dfs(nei, list);
        }
        if(add) list.remove(list.size() - 1);
        else list.set(index, ori);
    }
    public static long C(int n, int m)
    {
        if(m == 0 || m == n) return 1l;
        if(m > n || m < 0) return 0l;
        long res = fac[n] * quickPOW((fac[m] * fac[n - m]) % MOD, MOD - 2) % MOD;

        return res;
    }
    public static long quickPOW(long n, long m)
    {
        long ans = 1l;
        while(m > 0)
        {
            if(m % 2 == 1)
                ans = (ans * n) % MOD;
            n = (n * n) % MOD;
            m >>= 1;
        }
        return ans;
    }
    public static int gcd(int a, int b)
    {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
    public static long solve(long x, long[] res){
        int n = res.length;
        long a = x / n;
        int b = (int)(x % n);
        return res[n - 1] * a + res[b];
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}