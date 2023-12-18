import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni(), m = ni();
		if(m % 2 == 1){
			out.println(-1);
			return;
		}
		int[] from = new int[m];
		int[] to = new int[m];
		for(int i = 0;i < m;i++){
			from[i] = ni()-1;
			to[i] = ni()-1;
		}
		
		Map<Integer, Queue<Edge>> g = new HashMap<>();
		for(int i = 0;i < m;i++){
			if(!g.containsKey(from[i])){
				g.put(from[i], new ArrayDeque<>());
			}
			if(!g.containsKey(to[i])){
				g.put(to[i], new ArrayDeque<>());
			}
			Edge e = new Edge(from[i], to[i]);
			g.get(from[i]).add(e);
			g.get(to[i]).add(e);
		}
		
		Set<Long> sps = new HashSet<>();
		int pre = -1;
		for(int i = 0;i < n;i++){
			if(g.get(i).size() % 2 != 0){
				if(pre == -1){
					pre = i;
				}else{
					Edge e = new Edge(pre, i);
					e.special = true;
					g.get(pre).add(e);
					g.get(i).add(e);
					sps.add((long)pre<<32|i);
					sps.add((long)i<<32|pre);
					pre = -1;
				}
			}
		}
		
		Result ep = eulerianPathUndirected(g);
//		tr(ep.first, ep.es);
		if(ep == null){
			out.println(-1);
			return;
		}
		int cur = ep.first;
		int par = 0;
		for(int i = 0;i < ep.es.size();i++){
			Edge x = ep.es.get(i);
			if(x.special){
				cur = x.u^x.v^cur;
				continue;
			}
			if(par == 0){
				out.println((cur+1) + " " + ((x.u^x.v^cur)+1));
			}else{
				out.println(((x.u^x.v^cur)+1) + " " + (cur+1));
			}
			par ^= 1;
			cur = x.u^x.v^cur;
		}
	}
	
	static int[][] packU(int n, int[] from, int[] to) {
		int[][] g = new int[n][];
		int[] p = new int[n];
		for (int f : from)
			p[f]++;
		for (int t : to)
			p[t]++;
		for (int i = 0; i < n; i++)
			g[i] = new int[p[i]];
		for (int i = 0; i < from.length; i++) {
			g[from[i]][--p[from[i]]] = to[i];
			g[to[i]][--p[to[i]]] = from[i];
		}
		return g;
	}
	
	public static class Result
	{
		int first;
		List<Edge> es;
		public Result(int first, List<Edge> es) {
			this.first = first;
			this.es = es;
		}
	}
	
	public static Result eulerianPathUndirected(Map<Integer, Queue<Edge>> g)
	{
		int first = -1;
		int odd = 0;
		for(int key : g.keySet()) {
			if(g.get(key).size() % 2 == 1) {
				first = key;
				odd++;
			}
		}
		if(odd > 2)return null;
		if(first == -1) {
			for(int key : g.keySet()) first = key;
		}
		int m = 0;
		for(Queue<Edge> es : g.values())m += es.size();
		m /= 2;
		List<Edge> route = new ArrayList<>();
		dfs(first, g, route, null);
		return route.size() == m ? new Result(first, route) : null;
	}
	
	public static class Edge
	{
		int u, v;
		boolean alive;
		boolean special;
		public Edge(int u, int v) {
			this.u = u;
			this.v = v;
			alive = true;
		}
		@Override
		public String toString() {
			return "Edge [u=" + u + ", v=" + v + ", alive=" + alive + ", special=" + special + "]";
		}
		
	}
	
	private static void dfs(int cur, Map<Integer, Queue<Edge>> rem, List<Edge> route, Edge comein)
	{
		while(!rem.get(cur).isEmpty()) {
			Edge e = rem.get(cur).poll();
			if(e.alive) {
				e.alive = false;
				dfs(e.u ^ e.v ^ cur, rem, route, e);
			}
		}
		if(comein != null)route.add(comein);
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
