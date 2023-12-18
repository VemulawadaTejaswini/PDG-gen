import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;
public class Main{
    static Scanner scn = new Scanner(System.in);
    static FastScanner sc = new FastScanner();
    static PrintWriter ot = new PrintWriter(System.out);
    static Random rand = new Random();
    static long mod = 1000000007;
    static long modmod = mod * mod;
    static long inf = (long)1e17;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int[] dx8 = {-1,-1,-1,0,0,1,1,1};
    static int[] dy8 = {-1,0,1,-1,1,-1,0,1};
    static char[] dc = {'R','D','L','U'};
    static long[] ans;
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] ab = new int[m][2];
        UnionFindTree uf = new UnionFindTree(n);
        for(int i = 0; i < m; i++){
            ab[i][0] = scn.nextInt()-1;
            ab[i][1] = scn.nextInt()-1;
        }
        ans = new long[m];
        ans[0] = ((long)n * (n-1)) / 2;
        long cnt;
		int j;
        for(int i = 0; i < m-1; i++){
            cnt = 0;
            j = m - i -1;
            if(!uf.same(ab[i][0], ab[i][1])){
                cnt = (long)uf.size[ab[i][0]] * uf.size[ab[i][1]];
            }
            ans[i+1] = ans[i] - cnt;
            uf.unite(ab[i][0], ab[i][1]);
        }
        for(int i = m-1; i >= 0; i--){
            System.out.println(ans[i]);
        }
    }
}

class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] b = new byte[1024];
    private int p = 0;
    private int bl = 0;
    private boolean hNB() {
        if (p<bl) {
            return true;
        }else{
            p = 0;
            try {
                bl = in.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bl<=0) {
                return false;
            }
        }
        return true;
    }
    private int rB() { if (hNB()) return b[p++]; else return -1;}
    private static boolean iPC(int c) { return 33 <= c && c <= 126;}
    private void sU() { while(hNB() && !iPC(b[p])) p++;}
    public boolean hN() { sU(); return hNB();}
    public String next() {
        if (!hN()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = rB();
        while(iPC(b)) {
            sb.appendCodePoint(b);
            b = rB();
        }
        return sb.toString();
    }
    public char nextChar() {
    	return next().charAt(0);
    }
    public long nextLong() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b=='-') {
            m=true;
            b=rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1||!iPC(b)){
                return (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int nextInt() {
        if (!hN()) throw new NoSuchElementException();
        long n = 0;
        boolean m = false;
        int b = rB();
        if (b == '-') {
            m = true;
            b = rB();
        }
        if (b<'0'||'9'<b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0'<=b&&b<='9') {
                n *= 10;
                n += b-'0';
            }else if(b==-1||!iPC(b)){
                return (int) (m?-n:n);
            }else{
                throw new NumberFormatException();
            }
            b = rB();
        }
    }
    public int[] nextInts(int n) {
    	int[] a = new int[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public int[] nextInts(int n,int s) {
    	int[] a = new int[n+s];
    	for(int i=s;i<n+s;i++) {
    		a[i] = nextInt();
    	}
    	return a;
    }
    public long[] nextLongs(int n) {
    	long[] a = new long[n];
    	for(int i=0;i<n;i++) {
    		a[i] = nextLong();
    	}
    	return a;
    }
    public int[][] nextIntses(int n,int m){
    	int[][] a = new int[n][m];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			a[i][j] = nextInt();
    		}
    	}
    	return a;
    }
    
    void nextIntses(int n,int[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextInt();
    		}
    	}
    }
    void nextLongses(int n,long[] ...m) {
    	int l = m[0].length;
    	for(int i=0;i<l;i++) {
    		for(int j=0;j<m.length;j++) {
    			m[j][i] = nextLong();
    		}
    	}
    }
}


class UnionFindTree {
	int[] root;
	int[] rank;
	int[] size;
	int[] edge;
	int num;
	UnionFindTree(int N){
		root = new int[N];
		rank = new int[N];
		size = new int[N];
		edge = new int[N];
		num = N;
		for(int i=0;i<N;i++){
			root[i] = i;
			size[i] = 1;
		}
	}
	public boolean isRoot(int x) {
		return x==find(x);
	}
	public int extraEdge(int x) {
		int r = find(x);
		return edge[r] - size[r] + 1;
	}
	public int find(int x){
		if(root[x]==x){
			return x;
		}else{
			return find(root[x]);
		}
	}

	public void unite(int x,int y){
		x = find(x);
		y = find(y);
		if(x==y){
			edge[x]++;
			return;
		}else{
			num--;
			if(rank[x]<rank[y]){
				root[x] = y;
				size[y] += size[x];
				edge[y] += edge[x]+1;
			}else{
				root[y] = x;
				size[x] += size[y];
				edge[x] += edge[y]+1;
				if(rank[x]==rank[y]){
					rank[x]++;
				}
			}
		}
	}

	public boolean same(int x,int y){
		return find(x)==find(y);
	}
}