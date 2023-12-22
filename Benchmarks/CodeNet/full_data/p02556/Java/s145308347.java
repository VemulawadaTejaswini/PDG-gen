import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[][]p= new int[n][2];
        TreeSet<Integer>ts = new TreeSet<>();
        for (int i =0;i<n;i++){
            p[i]=sc.nextIntArr(2);
            ts.add(p[i][1]);
        }
        HashMap<Integer,Integer>hm =new HashMap<>();
        while (!ts.isEmpty())hm.put(ts.pollFirst(),hm.size()+1);
        Arrays.sort(p,(x,y)->x[0]-y[0]);
        int sz=1;
        while (sz<hm.size())sz*=2;
        SegmentTree s1= new SegmentTree(sz);
        SegmentTree s2 = new SegmentTree(sz);
        long ans=(long)-1e16;
        for (int i =0;i<n;i++){
            long cur=p[i][0]+p[i][1];
            cur-=s1.query(1,hm.get(p[i][1]));
            ans=Math.max(ans,cur);
            cur=p[i][0]-p[i][1];
            cur-=s2.query(hm.get(p[i][1]),hm.size());
            ans=Math.max(ans,cur);
            s1.update_point(hm.get(p[i][1]),p[i][0]+p[i][1]);
            s2.update_point(hm.get(p[i][1]),p[i][0]-p[i][1]);
        }
        pw.println(ans);
        pw.flush();
    }
    static class SegmentTree {        // 1-based DS, OOP

        int N;            //the number of elements in the array as a power of 2 (i.e. after padding)
        int[]  sTree;

        SegmentTree( int in) {
            N = in;
            sTree = new int[N << 1];        //no. of nodes = 2*N - 1, we add one to cross out index zero
            Arrays.fill(sTree,(int)2e9);
        }

        void update_point(int index, int val)            // O(log n)
        {
            index += N - 1;
            sTree[index] = Math.min(val,sTree[index]);
            while (index > 1) {
                index >>= 1;
                sTree[index] = Math.min(sTree[index << 1] , sTree[index << 1 | 1]);
            }
        }

        int query(int i, int j) {
            return query(1, 1, N, i, j);
        }

        int query(int node, int b, int e, int i, int j)    // O(log n)
        {
            if (i > e || j < b)
                return (int)2e9;
            if (b >= i && e <= j)
                return sTree[node];
            int mid = b + e >> 1;
            int q1 = query(node << 1, b, mid, i, j);
            int q2 = query(node << 1 | 1, mid + 1, e, i, j);
            return Math.min(q1 , q2);
        }
    }
        static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
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

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}