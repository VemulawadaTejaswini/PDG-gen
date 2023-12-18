import sun.security.krb5.internal.PAData;

import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int N = 1;
        while (N < n) N <<= 1; //padding
        int[]in = new int[N+1];
        char[] s = sc.nextLine().toCharArray();
        SegmentTree sg = new SegmentTree(in);
        for (int i=0;i<n;i++){
            if (s[i]=='1')
                sg.update_point(i+1,2*N);
        }
        sg.update_point(1,0);
        int[]parent=new int[N+1];
        parent[0]=0;
        for (int i =1;i<=n;i++){
            if (s[i]=='1')continue;
            Pair x = sg.query(Math.max((i+1)-m,0),i+1);
            parent[i]=x.idx-1;
            sg.update_point(i+1,x.val+1);
        }
        int ans =sg.query(n+1,n+1).val;
        if (ans>n+1){
            out.println(-1);
        }
        else {
            ArrayList<Integer>sol = new ArrayList<>();
            int lst =n;
            while (parent[lst]!=lst){
                sol.add(lst-parent[lst]);
                lst=parent[lst];
            }
            Collections.reverse(sol);
            for (int x:sol)out.print(x+" ");
        }

        out.flush();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

    static class Pair {
        int idx, val;

        Pair(int a, int b) {
            val = a;
            idx = b;
        }
    }

    static class SegmentTree {        // 1-based DS, OOP

        int N;            //the number of elements in the array as a power of 2 (i.e. after padding)
        int[] lazy;
        Pair[] sTree;

        SegmentTree(int[] in) {
            N = in.length - 1;
            sTree = new Pair[N << 1];//no. of nodes = 2*N - 1, we add one to cross out index zero
            lazy = new int[N << 1];
            for (int i =0;i<sTree.length;i++){
                sTree[i]=new Pair(1000000000,i);
            }
            build(1, 1, N);
        }

        void build(int node, int b, int e)    // O(n)
        {
            if (b == e)
                sTree[node] = new Pair(2*N, e);
            else {
                int mid = b + e >> 1;
                build(node << 1, b, mid);
                build(node << 1 | 1, mid + 1, e);
                if (sTree[node << 1].val <= sTree[node << 1 | 1].val)
                    sTree[node] = new Pair(sTree[node << 1].val, sTree[node << 1].idx);
                else {
                    sTree[node] = new Pair(sTree[node << 1 | 1].val, sTree[node << 1 | 1].idx);
                }
            }
        }


        void update_point(int index, int val)            // O(log n)
        {
            index += N - 1;
            sTree[index].val = val;
            while (index > 1) {
                index >>= 1;
                if (sTree[index << 1].val < sTree[index << 1 | 1].val)
                    sTree[index] = new Pair(sTree[index << 1].val, sTree[index << 1].idx);
                else {
                    sTree[index] = new Pair(sTree[index << 1 | 1].val, sTree[index << 1 | 1].idx);
                }
            }
        }



        Pair query(int i, int j) {
            return query(1, 1, N, i, j);
        }

        Pair query(int node, int b, int e, int i, int j)    // O(log n)
        {
            if (i > e || j < b)
                return null;
            if (b >= i && e <= j)
                return sTree[node];
            int mid = b + e >> 1;
            Pair q1 = query(node << 1, b, mid, i, j);
            Pair q2 = query(node << 1 | 1, mid + 1, e, i, j);
            if (q1==null)return q2;
            if (q2==null)return q1;
            if (q1.val<q2.val)
            return q1;
            return q2;
        }
    }

}