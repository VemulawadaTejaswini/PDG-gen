import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.SplittableRandom;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static long TL = 1850;
	static boolean debug = false;
	
	static void solve()
	{
		long start = System.currentTimeMillis();
		int D = ni();
		int M = 26;
		int[] C = na(M);
		int[][] S = new int[D][];
		for(int i = 0;i < D;i++){
			S[i] = na(M);
		}
		SplittableRandom gen = new SplittableRandom();
		int[] route = new int[D];
		for(int i = 0;i < D;i++){
			int argmax = 0;
			for(int j = 0;j < M;j++){
				if(S[i][j] > S[i][argmax]){
					argmax = j;
				}
			}
			route[i] = argmax;
		}
		
		long score = score(route, C, S);
		int[] cur = route;
		long bestscore = score;
		int[] arg = null;
		
		LST[] lsts = new LST[M];
		for(int i = 0;i < M;i++){
			lsts[i] = new LST(D);
		}
		for(int i = 0;i < D;i++){
			lsts[cur[i]].set(i);
		}
		
		double T = 2500;
		int rep = 0;
		for(;System.currentTimeMillis() - start < TL;rep++){
			int day = gen.nextInt(D);
			int to = gen.nextInt(M);
			
			if(cur[day] == to)continue;
			int old = cur[day];
			
			long nscore = score;
			
			// remove cur[day]
			{
				lsts[old].unset(day);
				int pre = lsts[old].prev(day);
				int nex = lsts[old].next(day);
				if(nex == -1)nex = D;
				nscore -= S[day][old];
//				nscore -= C[old] * ((nex-pre-1)*(nex-pre)/2 - (nex-day-1)*(nex-day)/2 - (day-pre-1)*(day-pre)/2);
				nscore -= C[old] * (nex-day) * (day - pre);
			}
			
			// add to
			{
				int pre = lsts[to].prev(day);
				int nex = lsts[to].next(day);
				if(nex == -1)nex = D;
				nscore += S[day][to];
//				nscore += C[to] * ((nex-pre-1)*(nex-pre)/2 - (nex-day-1)*(nex-day)/2 - (day-pre-1)*(day-pre)/2);
				nscore += C[to] * (nex-day) * (day - pre);
				lsts[to].set(day);
			}
			
			cur[day] = to;
//			long ex = score(cur, C, S);
//			assert ex == nscore;
			
			if(nscore >= score || (nscore-score) > -15*T && gen.nextDouble() < Math.exp((nscore-score)/T)){
				score = nscore;
				if(score > bestscore){
					bestscore = score;
					arg = Arrays.copyOf(cur, D);
//					tr(bestscore, rep, T);
				}
			}else{
				cur[day] = old;
				lsts[to].unset(day);
				lsts[old].set(day);
			}
			T *= 0.99999995;
		}
		
		if(debug){
			tr(bestscore, rep); // 15432593
		}else{
			for(int v : arg){
				out.println(v+1);
			}
		}
		
//		tr(score(route, C, S));
	}
	
	public static class LST {
		public long[][] set;
		public int n;
//		public int size;
		
		public LST(int n) {
			this.n = n;
			int d = 1;
			for(int m = n;m > 1;m>>>=6, d++);
			
			set = new long[d][];
			for(int i = 0, m = n>>>6;i < d;i++, m>>>=6){
				set[i] = new long[m+1];
			}
//			size = 0;
		}
		
		// [0,r)
		public LST setRange(int r)
		{
			for(int i = 0;i < set.length;i++, r=r+63>>>6){
				for(int j = 0;j < r>>>6;j++){
					set[i][j] = -1L;
				}
				if((r&63) != 0)set[i][r>>>6] |= (1L<<r)-1;
			}
			return this;
		}
		
		// [0,r)
		public LST unsetRange(int r)
		{
			if(r >= 0){
				for(int i = 0;i < set.length;i++, r=r+63>>>6){
					for(int j = 0;j < r+63>>>6;j++){
						set[i][j] = 0;
					}
					if((r&63) != 0)set[i][r>>>6] &= ~((1L<<r)-1);
				}
			}
			return this;
		}
		
		public LST set(int pos)
		{
			if(pos >= 0 && pos < n){
//				if(!get(pos))size++;
				for(int i = 0;i < set.length;i++, pos>>>=6){
					set[i][pos>>>6] |= 1L<<pos;
				}
			}
			return this;
		}
		
		public LST unset(int pos)
		{
			if(pos >= 0 && pos < n){
//				if(get(pos))size--;
				for(int i = 0;i < set.length && (i == 0 || set[i-1][pos] == 0L);i++, pos>>>=6){
					set[i][pos>>>6] &= ~(1L<<pos);
				}
			}
			return this;
		}
		
		public boolean get(int pos)
		{
			return pos >= 0 && pos < n && set[0][pos>>>6]<<~pos<0;
		}
		
		public LST toggle(int pos)
		{
			return get(pos) ? unset(pos) : set(pos);
		}
		
		public int prev(int pos)
		{
			for(int i = 0;i < set.length && pos >= 0;i++, pos>>>=6, pos--){
				int pre = prev(set[i][pos>>>6], pos&63);
				if(pre != -1){
					pos = pos>>>6<<6|pre;
					while(i > 0)pos = pos<<6|63-Long.numberOfLeadingZeros(set[--i][pos]);
					return pos;
				}
			}
			return -1;
		}
		
		public int next(int pos)
		{
			for(int i = 0;i < set.length && pos>>>6 < set[i].length;i++, pos>>>=6, pos++){
				int nex = next(set[i][pos>>>6], pos&63);
				if(nex != -1){
					pos = pos>>>6<<6|nex;
					while(i > 0)pos = pos<<6|Long.numberOfTrailingZeros(set[--i][pos]);
					return pos;
				}
			}
			return -1;
		}
		
		private static int prev(long set, int n)
		{
			long h = set<<~n;
			if(h == 0L)return -1;
			return -Long.numberOfLeadingZeros(h)+n;
		}
		
		private static int next(long set, int n)
		{
			long h = set>>>n;
			if(h == 0L)return -1;
			return Long.numberOfTrailingZeros(h)+n;
		}
		
		@Override
		public String toString()
		{
			List<Integer> list = new ArrayList<Integer>();
			for(int pos = next(0);pos != -1;pos = next(pos+1)){
				list.add(pos);
			}
			return list.toString();
		}
	}

	
	static long score(int[] route, int[] C, int[][] S)
	{
		int D = route.length, M = C.length;
		int[] last = new int[M];
		Arrays.fill(last, -1);
		long score = 0;
		for(int i = 0;i < D;i++){
			last[route[i]] = i;
			score += S[i][route[i]];
			for(int j = 0;j < M;j++){
				score -= C[j] * (i - last[j]);
			}
		}
		return score;
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
