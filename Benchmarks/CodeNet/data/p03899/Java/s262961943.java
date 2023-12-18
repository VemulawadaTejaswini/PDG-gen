import java.io.*;
import java.util.*;


class Main {
    static final long I=1L<<53;
    static void mEqN(int n,int k,long[]a){
        long[]ans=new long[k+1];
        Arrays.fill(ans,-I);
        ans[0]=0;
        for(int i=0;i<n;++i){
            for(int j=Math.min(i+1,k);j>=1;--j){
                ans[j]=Math.max(ans[j],ans[j-1]+j*a[i]);
            }
        }
        out.println(ans[k]);
    }
    static void solve(int n,int m,int k,long[]a){
        MaxSegmentTree[]seg=new MaxSegmentTree[2];
        Arrays.setAll(seg,x->new MaxSegmentTree());
        for(int i=0;i<n;++i){
            seg[0].update(i,a[i]);
        }
        for(int i=1;i<k;++i){
            int u=(i-1)%2;
            int nxt=1-u;
            for(int j=i;j<n;++j){
                long val=seg[u].query(Math.max(i-1,j-m),j)+(i+1)*a[j];
                seg[nxt].update(j,val);
            }
        }
        out.println(seg[(k-1)%2].query(k-1,n));
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;++i){
            a[i]=sc.nextLong();
        }
        if(n==m){
            mEqN(n,k,a);
        }else{
            solve(n,m,k,a);
        }
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
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
}
class MaxSegmentTree {
    static final int SIZE = 1 << 18;
    static final long INFINITY = (1L << 62) - 1;
    long[] seg;
    MaxSegmentTree() {
	this.seg = new long[2 * SIZE];
    }
    void update(int x, long value) {
	x += SIZE - 1;
	this.seg[x] = value;
	while (x > 0) {
	    x = (x - 1) / 2;
	    this.seg[x] = Math.max(this.seg[2 * x + 1], this.seg[2 * x + 2]);
	}
    }
    long query(int l, int r) {
	l += SIZE - 1;
	r += SIZE - 1;
        long y = -INFINITY;
	while (l < r) {
	    if ((l & 1) == 0) {
		y = Math.max(y, this.seg[l]);
	    }
	    if ((r & 1) == 0) {
		y = Math.max(y, this.seg[r - 1]);
	    }
	    l /= 2;
	    r = (r - 1) / 2;
	}
	return y;
    }
}
