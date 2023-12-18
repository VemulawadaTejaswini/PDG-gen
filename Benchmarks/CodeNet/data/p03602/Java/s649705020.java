/**
 * DA-IICT
 * Author : Savaliya Sagar
 */
import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.fill;
import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;

public class Main
{
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	long mind = Long.MAX_VALUE;
	HashSet<Pair1> g[];
	int v[],d[];
	void solve()
	{
		int  n = ni();
		ArrayList<Pair> a = new ArrayList<>();
		g = new HashSet[n+1];
		v = new int[n+1];
		d = new int[n+1];
		for(int i=0;i<=n;i++)
			g[i] = new HashSet<>();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				long temp = ni();
				if(i>j){
					a.add(new Pair(i+1,j+1,temp));
					g[i+1].add(new Pair1(j+1,temp));
					g[j+1].add(new Pair1(i+1,temp));
				}
			}
		}
		sort(a,Collections.reverseOrder());
		long total = 0;
		for(int i=0;i<a.size();i++){
			Pair x = a.get(i);
			long d = dijkstra(x.u, n, x.v);
			if(d!=x.w)
			{
				out.println(-1);
				return;
			}
//			tr(d,x.u,x.v);
//			tr(g[x.u]);
			g[x.u].remove(new Pair1(x.v,x.w));
//			tr(g[x.u]);
			g[x.v].remove(new Pair1(x.u,x.w));
			d = dijkstra(x.u, n, x.v);
			if(d!=x.w){
				total += x.w;
			}
			g[x.u].add(new Pair1(x.v,x.w));
			g[x.v].add(new Pair1(x.u,x.w));
		}
		out.println(total);
	}
	public long dijkstra(int source,int n,int d){
		long dist[] = new long[n+1];
		boolean visited[] = new boolean[n+1];
        Arrays.fill(dist,Long.MAX_VALUE);
        PriorityQueue<Pair1> pq = new PriorityQueue<>();
        dist[source]=0;
        pq.add(new Pair1(dist[source],source));
        while(!pq.isEmpty()){
            Pair1 cur = pq.poll();
            int current = (int) cur.v;
            visited[current] = true;
            for(Pair1 p:g[current]){
                if(!visited[(int) p.u]){
                    if(dist[(int) p.u]>dist[current]+p.v){
                        dist[(int) p.u]=dist[current]+(int)p.v;
                        pq.add(new Pair1(dist[(int) p.u],p.u));
                    }
                }
            }
        }
        return dist[d];
}
	
	class Pair1 implements Comparable<Pair1> {
		long u;
		long v;

		public Pair1(long u, long v) {
			this.u = u;
			this.v = v;
		}

		public int hashCode() {
			int hu = (int) (u ^ (u >>> 32));
			int hv = (int) (v ^ (v >>> 32));
			return 31 * hu + hv;
		}

		public boolean equals(Object o) {
			Pair1 other = (Pair1) o;
			return u == other.u && v == other.v;
		}

		public int compareTo(Pair1 other) {
			return Long.compare(u, other.u) != 0 ? Long.compare(u, other.u)
					: Long.compare(v, other.v);
		}

		public String toString() {
			return "[u=" + u + ", v=" + v + "]";
		}
	}

	
	class Pair implements Comparable<Pair> {
		int u;
		int v;
		long w;
		public Pair(int u, int v,long w) {
			this.u = u;
			this.v = v;
			this.w = w;
		}

		public int hashCode() {
			return Objects.hash();
		}

		public boolean equals(Object o) {
			Pair other = (Pair) o;
			return u == other.u && v == other.v;
		}

		public int compareTo(Pair other) {
			return Long.compare(w,other.w);
		}

		public String toString() {
			return "[u=" + u + ", v=" + v +", w=" + w + "]";
		}
	}
	
	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}
	
	public static void main(String[] args) throws Exception
	{
		new Thread(null, new Runnable()
		{
			public void run()
			{
				try
				{
					new Main().run();
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf)
		{
			ptrbuf = 0;
			try
			{
				lenbuf = is.read(inbuf);
			} catch (IOException e)
			{
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c)
	{
		return !(c >= 33 && c <= 126);
	}
	
	private int skip()
	{
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	
	private double nd()
	{
		return Double.parseDouble(ns());
	}
	
	private char nc()
	{
		return (char) skip();
	}
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b)))
		{ // when nextLine, (isSpaceChar(b) && b !=
				// ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b)))
		{
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	
	private int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-')
		{
			minus = true;
			b = readByte();
		}
		
		while (true)
		{
			if (b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			} else
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-')
		{
			minus = true;
			b = readByte();
		}
		
		while (true)
		{
			if (b >= '0' && b <= '9')
			{
				num = num * 10 + (b - '0');
			} else
			{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private void tr(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}
