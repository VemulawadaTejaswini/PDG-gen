import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long max = Long.MAX_VALUE/10;
    int n=1;
    long[] dat;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // Each point has a infinite distance from 0 (except itself)
    long solve() {
        Scanner sc = new Scanner(System.in);
        int n0 = sc.nextInt(), m = sc.nextInt();
        while(n<n0) n*=2; // let n be 1<<x
        dat = new long[2*n]; // this is why something like 4*n0+10 is safe
        for(int i=0;i<2*n-1;i++) dat[i] = max;
        update(0,0);
        Edge[] edges = new Edge[m];
        for(int i=0;i<m;i++){
            edges[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }
        Arrays.sort(edges);
        if(edges[0].from!=0) return -1;
        for(Edge e:edges){
            int end = e.to;
            long curVal = find(end,end), prev = find(e.from,end-1);
            if(prev+e.cost<curVal){
                update(end,prev+e.cost);
            }
        }
        long ans = find(n0-1,n0-1);
        if(ans<max) return ans;
        return -1;
    }
    // find the minimum value in [left, right]
    long find(int left, int right){
        return query(left, right+1, 0, 0, n);
    }
    void update(int idx, long val){
        idx += n-1;
        dat[idx] = val;
        // update in an upward direction
        while(idx>0){
            idx = (idx-1)/2;
            dat[idx] = Math.min(dat[idx*2+1], dat[idx*2+2]);
        }
    }
    // find the minimum value in [a,b)
    // when invoking, query(a,b,0,0,n), n is the adjusted value ( n = 1<<x)
    long query(int a, int b, int idx, int left, int right){
        if(right<=a||left>=b) return max;
        if(a<=left&&right<=b) return dat[idx];
        int mid = (left+right)/2;
        long vl = query(a,b,2*idx+1, left, mid);
        long vr = query(a,b,2*idx+2, mid, right);
        return Math.min(vl,vr);
    }
    class Edge implements Comparable<Edge>{
        int from,to, cost;
        public Edge(int f, int t, int c){
            from = f; to = t; cost = c;
        }
        public int compareTo(Edge e){
            if(this.from!=e.from) return Integer.compare(from, e.from);
            if(this.to!=e.to) return Integer.compare(to, e.to);
            return cost-e.cost;
        }
    }
}
