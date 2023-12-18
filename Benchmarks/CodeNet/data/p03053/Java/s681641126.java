import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
    	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int h = sc.nextInt();
        int w = sc.nextInt();
        
    	IntGrid g = new IntGrid(h,w);
    	
    	for(int i=0;i<h;i++){
    		char[] c = sc.next().toCharArray();
    		for(int j=0;j<w;j++){
    			switch(c[j]){
    			case '#':
    				g.grid[i][j] = 1; 
    			}
    		}
    	}
    	
    	out.println(g.solve());
        
        out.flush();
    }

}

class IntGrid {
	int[][] grid;
	
	public IntGrid(int h, int w){
		this.grid = new int[h][w];
	}
	
	//(n,m)が通行可能か返す（実装に応じて変更すべき）
	boolean isPassable(int n, int m){
		return true;
	}
	
	//(n,m)に隣接するグリッドを全て返す（通行可能かは問わない）
	java.util.LinkedList<Pair> nextList(int n, int m){
		java.util.LinkedList<Pair> list = new java.util.LinkedList<>();
		
		if(n>0){
			list.add(new Pair(n-1,m));
		}
		
		if(n<this.grid.length-1){
			list.add(new Pair(n+1,m));
		}
		
		if(m>0){
			list.add(new Pair(n,m-1));
		}
		
		if(m<this.grid[0].length-1){
			list.add(new Pair(n,m+1));
		}
		
		return list;
	}
	
	//(n,m)に隣接し、通行可能なグリッドを全て返す
	java.util.LinkedList<Pair> nextPList(int n, int m){
		java.util.LinkedList<Pair> list = new java.util.LinkedList<>();
		
		if(n>0){
			if(isPassable(n-1,m)){
				list.add(new Pair(n-1,m));
			}
		}
		
		if(n<this.grid.length-1){
			if(isPassable(n+1,m)){
				list.add(new Pair(n+1,m));
			}
		}
		
		if(m>0){
			if(isPassable(n,m-1)){
				list.add(new Pair(n,m-1));
			}
		}
		
		if(m<this.grid[0].length-1){
			if(isPassable(n,m+1)){
				list.add(new Pair(n,m+1));
			}
		}
		
		return list;
	}
	
	//(sa,sb)から(ga,gb)までの最短手数をBFSで計算。到達不可なら-1を返す。
	int distance(int sa, int sb, int ga, int gb){
		
		java.util.ArrayDeque<Pair> q = new java.util.ArrayDeque<>();
		
		int[][] distance = new int[grid.length][grid[0].length]; //未チェックなら-1
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				distance[i][j] = -1;
			}
		}
		
		q.offerFirst(new Pair(sa,sb));
		distance[sa][sb] = 0;
		
		boolean con = true;
		while(con && !q.isEmpty()){
			Pair now = q.pollFirst();
			
			for(Pair p:this.nextPList(now.a, now.b)){
				
				if(distance[p.a][p.b]==-1){
					if(p.a == ga && p.b == gb){
						return distance[now.a][now.b] + 1;
					}
					
					distance[p.a][p.b] = distance[now.a][now.b] + 1;
					q.offerLast(p);
				}
			}
		}
		
		return -1;
	}
	
	//(sa,sb)からの最短手数行列をBFSで計算。到達不可は-1。
	int[][] distanceMatrix(int sa, int sb){
		java.util.ArrayDeque<Pair> q = new java.util.ArrayDeque<>();
		
		int[][] distance = new int[grid.length][grid[0].length]; //未チェックなら-1
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				distance[i][j] = -1;
			}
		}
		
		q.offerFirst(new Pair(sa,sb));
		distance[sa][sb] = 0;
		
		boolean con = true;
		while(con && !q.isEmpty()){
			Pair now = q.pollFirst();
			
			for(Pair p:this.nextPList(now.a, now.b)){
				
				if(distance[p.a][p.b]==-1){
					distance[p.a][p.b] = distance[now.a][now.b] + 1;
					q.offerLast(p);
				}
			}
		}
		
		return distance;
	}
	
	int solve(){
		java.util.ArrayDeque<Pair> q = new java.util.ArrayDeque<>();
		
		int[][] distance = new int[grid.length][grid[0].length]; //未チェックなら-1
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				distance[i][j] = -1;
			}
		}
		
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				if(grid[i][j] == 1){
					q.offerFirst(new Pair(i,j));
					distance[i][j] = 0;
				}
			}
		}

		boolean con = true;
		while(con && !q.isEmpty()){
			Pair now = q.pollFirst();
			
			for(Pair p:this.nextPList(now.a, now.b)){
				
				if(distance[p.a][p.b]==-1){
					distance[p.a][p.b] = distance[now.a][now.b] + 1;
					q.offerLast(p);
				}
			}
		}
		
		int max = 0;
		for(int i=0;i<distance.length;i++){
			for(int j=0;j<distance[0].length;j++){
				max = Math.max(max,distance[i][j]);
			}
		}
		
		return max;
	}
}
 
class Pair implements Comparable<Pair>{
	int a,b;
	
	public Pair(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Pair){
			Pair p = (Pair) o;
			return a == p.a && b == p.b;
		}
		return super.equals(o);
	}
	
	@Override
	public int compareTo(Pair o){
		if(a!=o.a){
			return Integer.compare(a,o.a);
		}
		return Integer.compare(b, o.b);
	}
	
	@Override
	public int hashCode(){
		return (a<<16)+b;
	}
	
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}