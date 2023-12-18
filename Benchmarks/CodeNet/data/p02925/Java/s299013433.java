

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FastScanner fc = new FastScanner();
		
		int n = fc.nextInt();
//		int n = Integer.parseInt(br.readLine());

		int[][] games = new int[n][n - 1];

		for(int i = 0; i < n; i++){

//			String[] tmpArray = br.readLine().split(" ");
			for(int j = 0; j < n - 1; j++){
//				games[i][j] = Integer.parseInt(tmpArray[j]);
				games[i][j] = fc.nextInt();
			}
		}
		
		ArrayList[] edges = new ArrayList[n*(n - 1)/2];
		
		for(int i = 0; i < edges.length; i++){
			edges[i] = new ArrayList<Edge>();
		}
		
		//debug
//		for(int i = 1; i <= n; i++){
//			for(int j = 1; j <= n; j++){
//				if(i == j){
//					System.out.print("x ");
//				}
//				else {
//					System.out.print(MatchID.calcID(i, j, n)+" ");
//				}
//			}
//			System.out.println();
//		}
		
		boolean referenced[] = new boolean[edges.length];
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n - 1; j++){
				int prevID = MatchID.calcID(i + 1, games[i][j - 1], n);
				edges[prevID].add(new Edge(i + 1, games[i][j], n));
				referenced[MatchID.calcID(i + 1, games[i][j], n)] = true;
			}
		}
		
		//debug
//		for(int i = 0; i < edges.length; i++){
//			for(int j = 0; j < edges[i].size(); j++){
//				System.out.println("game "+i+" to "+((Edge)(edges[i].get(j))).to);
//			}
//		}
		
		visited = new boolean[edges.length];
		
		for(int i = 0; i < edges.length && !cycle; i++){
			if(referenced[i]){
//				System.out.println("match "+i+" ignored");
				continue;
			}
			
			Arrays.fill(visited, false);
			
			dfs(edges, i, 1);
			
			break;
		}
		
		if(cycle || maxDepth == 0){
			System.out.println(-1);
		}
		else {
			System.out.println(maxDepth);
		}
	}
	
	static boolean visited[];
	static boolean cycle = false;
	static int maxDepth = 0;

//	static void dfs2(ArrayList<Edge>[] edges, int ID, int depth){
//		Stack<Integer> stack = new Stack<Integer>();
////		if(cycle){
////			return;
////		}
//		visited[ID] = true;
////		maxDepth = Math.max(depth, maxDepth);
//		stack.push(ID);
//		while(!stack.empty()){
//			int tmpID = stack.pop();
//			
//			Iterator<Edge> it = edges[tmpID].iterator();
//			while(it.hasNext()){
//				Edge tmpEdge = it.next();
//
//				if(visited[tmpEdge.to]){
//					cycle = true;
//					break;
//				}
//				else {
//					visited[tmpEdge.to] = true;
//					stack.push(tmpEdge.to);
//				}
//			}
//
//			visited[ID] = false;
//		}
//	}
	
	static void dfs(ArrayList<Edge>[] edges, int ID, int depth){
		if(cycle){
			return;
		}
		visited[ID] = true;
		maxDepth = Math.max(depth, maxDepth);
		
		Iterator<Edge> it = edges[ID].iterator();
		while(it.hasNext()){
			Edge tmpEdge = it.next();
			
//			if(visited[tmpEdge.to]){
//				cycle = true;
//				break;
//			}
//			else {
			if(!visited[tmpEdge.to]){
				dfs(edges, tmpEdge.to, depth + 1);
			}
//			}
		}
		
//		visited[ID] = false;
	}
}

class Edge {
	int to;
	
	Edge(int p1, int p2, int n){
		if(p2 > p1){
			int tmp = p2;
			p2 = p1;
			p1 = tmp;
		}
		
		this.to = MatchID.calcID(p1, p2, n);
	}
}

class MatchID {
	static int calcID(int p1, int p2, int n){
		if(p1 > p2){
			int tmp = p2;
			p2 = p1;
			p1 = tmp;
		}
		
		return ((n - 1) + (n - (p1 - 1))) * (p1 - 1)/2 + (p2 - p1) - 1;
		
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
		}else{
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
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
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
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() { return Double.parseDouble(next());}
}