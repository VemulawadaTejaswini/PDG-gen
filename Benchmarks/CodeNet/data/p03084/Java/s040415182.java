import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	
	static char[] s, t;
	static int n, m;
	static int[] mmn, mms, mme, mmw;
	static LST ns, ss, es, ws;
	
	static void solve()
	{
		n = ni();
		m = ni();
		int Q = ni();
		s = ns(n);
		t = ns(m);
		
		ns = new LST(m);
		ss = new LST(m);
		for(int i = 0;i < m;i++){
			if(t[i] == 'N')ns.set(i);
			if(t[i] == 'S')ss.set(i);
		}
		es = new LST(n);
		ws = new LST(n);
		for(int i = 0;i < n;i++){
			if(s[i] == 'E')es.set(i);
			if(s[i] == 'W')ws.set(i);
		}
		
		mmn = get(t, 'N');
		mms = get(t, 'S');
		mme = get(s, 'E');
		mmw = get(s, 'W');
		hist = new ArrayList<>();
		trail = new char[20];
		
		for(int z = 0;z < Q;z++){
			int r1 = ni()-1, c1 = ni()-1;
			int r2 = ni()-1, c2 = ni()-1;
			
			ans = Long.MAX_VALUE / 2;
			dfs(r1, c1, r2, c2, s[r1]);
			dfs(r1, c1, r2, c2, t[c1]);
			
			if(ans > Long.MAX_VALUE / 10){
				out.println(-1);
			}else{
				out.println(ans);
			}
		}
		
	}
	
	static long ans;
	
	static List<int[]> hist;
	static char[] trail;
	
	static void dfs(int r, int c, int tr, int tc, char dir)
	{
		if(r == tr && c == tc){
			hist.add(new int[]{r, c});
			// shrink
//			tr(Arrays.copyOf(trail, hist.size()-1));
//			for(int[] e : hist){
//				tr(e);
//			}
			
			int[][] lhist = new int[hist.size()][];
			for(int i = 0;i < hist.size();i++){
				lhist[i] = Arrays.copyOf(hist.get(i), 2);
			}
			for(int i = 0;i < lhist.length-3;i++){
				if(trail[i] != trail[i+2]){
					// 90 90 90
					if(trail[i] == 'N'){
						int base = Math.min(lhist[i][0], lhist[i+3][0]);
						if(trail[i+1] == 'E'){
							int pre = es.prev(base-1);
							lhist[i+1][0] = lhist[i+2][0] = pre;
						}else{
							int pre = ws.prev(base-1);
							lhist[i+1][0] = lhist[i+2][0] = pre;
						}
					}else if(trail[i] == 'S'){
						int base = Math.max(lhist[i][0], lhist[i+3][0]);
						if(trail[i+1] == 'E'){
							int pre = es.next(base+1);
							lhist[i+1][0] = lhist[i+2][0] = pre;
						}else{
							int pre = ws.next(base+1);
							lhist[i+1][0] = lhist[i+2][0] = pre;
						}
					}else if(trail[i] == 'W'){
						int base = Math.min(lhist[i][1], lhist[i+3][1]);
						if(trail[i+1] == 'N'){
							int pre = ns.prev(base-1);
							lhist[i+1][1] = lhist[i+2][1] = pre;
						}else{
							int pre = ss.prev(base-1);
							lhist[i+1][1] = lhist[i+2][1] = pre;
						}
					}else if(trail[i] == 'E'){
						int base = Math.max(lhist[i][1], lhist[i+3][1]);
						if(trail[i+1] == 'N'){
							int pre = ns.next(base+1);
							lhist[i+1][1] = lhist[i+2][1] = pre;
						}else{
							int pre = ss.next(base+1);
							lhist[i+1][1] = lhist[i+2][1] = pre;
						}
					}
				}
			}
			
			long len = 0;
			for(int i = 0;i < lhist.length-1;i++){
				len += Math.abs(lhist[i][0]-lhist[i+1][0]);
				len += Math.abs(lhist[i][1]-lhist[i+1][1]);
			}
			ans = Math.min(ans, len);

			hist.remove(hist.size()-1);
			return;
		}
		if(hist.size() > 6)return;
		
		trail[hist.size()] = dir;
		hist.add(new int[]{r, c});
		
//		tr(r, c, tr, tc, dir);
		
		if(dir == 'N'){
			if(tr < r && c == tc){
				dfs(tr, tc, tr, tc, '_');
				hist.remove(hist.size()-1);
				return;
			}
			if(tr < r){
				if(s[tr] == 'E' && c < tc){
					dfs(tr, c, tr, tc, 'E');
					hist.remove(hist.size()-1);
					return;
				}
				if(s[tr] == 'W' && c > tc){
					dfs(tr, c, tr, tc, 'W');
					hist.remove(hist.size()-1);
					return;
				}
			}
			if(mme[0] >= 0 && mme[0] < r){
				dfs(mme[0], c, tr, tc, 'E');
			}
			if(mmw[0] >= 0 && mmw[0] < r){
				dfs(mmw[0], c, tr, tc, 'W');
			}
		}
		
		if(dir == 'S'){
			if(tr > r && c == tc){
				dfs(tr, tc, tr, tc, '_');
				hist.remove(hist.size()-1);
				return;
			}
			if(tr > r){
				if(s[tr] == 'E' && c < tc){
					dfs(tr, c, tr, tc, 'E');
					hist.remove(hist.size()-1);
					return;
				}
				if(s[tr] == 'W' && c > tc){
					dfs(tr, c, tr, tc, 'W');
					hist.remove(hist.size()-1);
					return;
				}
			}
			if(mme[1] < n && mme[1] > r){
				dfs(mme[1], c, tr, tc, 'E');
			}
			if(mmw[1] < n && mmw[1] > r){
				dfs(mmw[1], c, tr, tc, 'W');
			}
		}
		
		
		if(dir == 'W'){
			if(tc < c && r == tr){
				dfs(tr, tc, tr, tc, '_');
				return;
			}
			if(tc < c){
				if(t[tc] == 'S' && r < tr){
					dfs(r, tc, tr, tc, 'S');
					hist.remove(hist.size()-1);
					return;
				}
				if(t[tc] == 'N' && r > tr){
					dfs(r, tc, tr, tc, 'N');
					hist.remove(hist.size()-1);
					return;
				}
			}
			if(mms[0] >= 0 && mms[0] < c){
				dfs(r, mms[0], tr, tc, 'S');
			}
			if(mmn[0] >= 0 && mmn[0] < c){
				dfs(r, mmn[0], tr, tc, 'N');
			}
		}
		
		
		if(dir == 'E'){
			if(tc > c && r == tr){
				dfs(tr, tc, tr, tc, '_');
				hist.remove(hist.size()-1);
				return;
			}
			if(tc > c){
				if(t[tc] == 'S' && r < tr){
					dfs(r, tc, tr, tc, 'S');
					hist.remove(hist.size()-1);
					return;
				}
				if(t[tc] == 'N' && r > tr){
					dfs(r, tc, tr, tc, 'N');
					hist.remove(hist.size()-1);
					return;
				}
			}
			if(mms[1] < m && mms[1] > c){
				dfs(r, mms[1], tr, tc, 'S');
			}
			if(mmn[1] < m && mmn[1] > c){
				dfs(r, mmn[1], tr, tc, 'N');
			}
		}
		
		hist.remove(hist.size()-1);
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

	
	static int[] get(char[] s, char c)
	{
		int min = s.length, max = -1;
		for(int i = 0;i < s.length;i++){
			if(s[i] == c){
				if(min == s.length)min = i;
				max = i;
			}
		}
		return new int[]{min, max};
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
