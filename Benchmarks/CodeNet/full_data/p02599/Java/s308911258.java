//package f;

import java.io.*;
import java.util.*;

public class Main {
    FastIO io = new FastIO();
    int N, Q;
    int[] C;
    Qry[] Qs;
    static BIT bt = new BIT(500005);
    static int[] mxis = new int[500005];

    void solve(){
        //Node[] nodes = new Node[N];
        //Node sgt = new Node(0, N-1, null, nodes);
        //BIT bt = new BIT(N);

        //shuffle(Qs);
        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.qr - b.qr;
            }
        });

        Arrays.fill(mxis, -1);

        int l = 1;
        for(int i=0; i<Q; i++){
            int r = Qs[i].qr;
            for(int j=l; j<=r; j++){
                int a = C[j];
                int mai = mxis[a];
                if(mai >= 0) {
                    bt.add(mai, -1);
                }
                bt.add(j, 1);
                mxis[a] = j;
            }

            Qs[i].ans = bt.query(Qs[i].ql, Qs[i].qr);
            l = r + 1;
        }

        //shuffle(Qs);
        Arrays.sort(Qs, new Comparator<Qry>() {
            @Override
            public int compare(Qry a, Qry b) {
                return a.idx - b.idx;
            }
        });

        PrintWriter out=new PrintWriter(System.out);
        for(Qry q : Qs){
            out.println(q.ans);
        }
        out.close();
    }


    public void main() throws Exception {
        N = io.nextInt();  Q = io.nextInt();
        C = new int[N+1];
        for(int i=1; i<=N; i++){
            C[i] = io.nextInt();
        }

        Qs = new Qry[Q];
        for(int i=0; i<Q; i++){
            int l, r;
            l = io.nextInt(); r = io.nextInt();
            Qs[i] = new Qry(l, r, i);
        }

        solve();

    }

    public static void main(String[] args) throws Exception {
        Main task = new Main();
        task.main();
    }

    static class Qry {
        int ql, qr, idx;
        long ans;
        public Qry(int l, int r, int i){
            ql = l; qr = r;
            idx = i;
        }
    }

    //index from 1
    static class BIT {
        int[] C;
        int N;
        public BIT(int n){
            C = new int[n + 1];
            N = n;
        }

        int lowbit(int a){
            return ((a ^ (a - 1)) + 1) >> 1;
        }

        void add(int idx, int a){
            while(idx <= N){
                C[idx] += a;
                idx += lowbit(idx);
            }
        }

        int sum(int idx){
            int ans = 0;
            while(idx > 0){
                ans += C[idx];
                idx -= lowbit(idx);
            }
            return ans;
        }

        long query(int l, int r){
            long ans = sum(r);
            if(l > 1){
                ans -= sum(l - 1);
            }
            return ans;
        }
    }

    static class FastIO {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();

        }

        public int nextInt(){
            return Integer.parseInt(next());
        }

        public char nextChar(){
            return next().charAt(0);
        }

        public long nextLong(){
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }

       
    }
}

