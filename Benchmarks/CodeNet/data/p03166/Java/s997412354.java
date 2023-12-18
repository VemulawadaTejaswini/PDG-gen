import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------
        long MOD = 1000000007;
        //int t = sc.nextInt();
        int t = 1;
        while(t -- > 0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), res =  -1;
            int cnt[] = new int[n + 1];
            ArrayList<Integer> child[] = new ArrayList[n + 1];
            for(int i = 0; i < m; i++)
            {
                int x = sc.nextInt(), y = sc.nextInt();
                if(child[x] == null) child[x] = new ArrayList<>();
                child[x].add(y);
                cnt[y]++;
            }
            Queue <Integer> q = new LinkedList<>();
            for(int i = 1; i <= n ; i++)
                if(cnt[i] == 0)
                    q.offer(i);
            while(!q.isEmpty())
            {
                for(int j = q.size(); j > 0; j--)
                {
                    int tmp = q.poll();
                    if(child[tmp] == null) continue;
                    for(int c : child[tmp])
                        if(--cnt[c] == 0)
                            q.offer(c);
                }
                res++;
            }
            out.println(res);
            //for(int ii = 0; ii <= n; ii++) System.out.println(Arrays.toString(dp[ii]));
        }

        out.close();

        /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String

        int result = 3*n;
        out.println(result);                    // print via PrintWriter
        */
        // Stop writing your solution here. -------------------------------------
        out.close();
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