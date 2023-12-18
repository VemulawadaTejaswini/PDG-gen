import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static char[] str;
	static int pos;
	static int len;
	
	static void solve()
	{
		for(int T = ni();T > 0;T--){
			str = ns().toCharArray();
			pos = 0;
			len = str.length;
			Clause res = parse();
			assert pos == len-1;
			out.print(res.value + " ");
			Clause minc = clone(res, 0);
			Clause maxc = clone(res, 99);
			int ans = dfs(res, minc, maxc);
			if(ans == -1)ans = pos;
			out.println(ans+1);
		}
	}
	
	static Clause clone(Clause c, int v)
	{
		if(c == null)return null;
		Clause ret = new Clause();
		ret.type = c.type;
		ret.start = c.start;
		ret.end = c.end;
		ret.value = v;
		ret.l = clone(c.l, v);
		ret.r = clone(c.r, v);
		if(ret.l != null)ret.l.par = ret;
		if(ret.r != null)ret.r.par = ret;
		return ret;
	}
	
	static int dfs(Clause c, Clause minc, Clause maxc)
	{
		if(c.type == 'v'){
			if(c.value >= 10){
				minc.value = c.value/10;
				int min = propagate(minc);
				maxc.value = c.value/10*10+9;
				int max = propagate(maxc);
				if(min == max){
					return c.start;
				}
				minc.value = c.value;
				min = propagate(minc);
				maxc.value = c.value;
				max = propagate(maxc);
				if(min == max){
					return c.start+1;
				}
			}else if(c.value >= 1){
				minc.value = c.value;
				int min = propagate(minc);
				maxc.value = c.value*10+9;
				int max = propagate(maxc);
				if(min == max){
					return c.start;
				}
			}else{
				minc.value = c.value;
				int min = propagate(minc);
				maxc.value = c.value;
				int max = propagate(maxc);
				if(min == max){
					return c.start;
				}
			}
			return -1;
		}else if(c.type == '^' || c.type == '_'){
			{
				int res = dfs(c.l, minc.l, maxc.l);
				if(res != -1)return res;
			}
			{
				minc.l.value = c.l.value;
				int min = propagate(minc.l);
				maxc.l.value = c.l.value;
				int max = propagate(maxc.l);
				if(min == max){
					return c.r.start-1;
				}
			}
			{
				int res = dfs(c.r, minc.r, maxc.r);
				if(res != -1)return res;
			}
			{
				minc.r.value = c.r.value;
				int min = propagate(minc.r);
				maxc.r.value = c.r.value;
				int max = propagate(maxc.r);
				if(min == max){
					return c.end-1;
				}
			}
			return -1;
		}else{
			throw new RuntimeException();
		}
	}
	
	static int propagate(Clause c)
	{
		int v = c.value;
		for(Clause x = c.par;x != null;x = x.par){
			x.solve();
			v = x.value;
		}
		return v;
	}
	
	static class Clause
	{
		int type;
		int start;
		int end;
		int value;
		Clause l, r;
		Clause par;
		
		public void solve()
		{
			if(type == '_'){
				value = Math.min(l.value, r.value);
			}else if(type == '^'){
				value = Math.max(l.value, r.value);
			}
		}
	}
	
	static Clause parse()
	{
		int start = pos;
		if(str[pos] == '_'){
			pos++;
			assert str[pos] == '(';
			pos++;
			Clause one = parse();
			assert str[pos] == ',';
			pos++;
			Clause two = parse();
			assert str[pos] == ')';
			pos++;
			Clause ret = new Clause();
			ret.type = '_';
			ret.start = start;
			ret.end = pos;
			ret.l = one;
			ret.r = two;
			ret.l.par = ret.r.par = ret;
			ret.solve();
			return ret;
		}else if(str[pos] == '^'){
			pos++;
			assert str[pos] == '(';
			pos++;
			Clause one = parse();
			assert str[pos] == ',';
			pos++;
			Clause two = parse();
			assert str[pos] == ')';
			pos++;
			Clause ret = new Clause();
			ret.type = '^';
			ret.start = start;
			ret.end = pos;
			ret.l = one;
			ret.r = two;
			ret.l.par = ret.r.par = ret;
			ret.solve();
			return ret;
		}else{
			int d = str[pos]-'0';
			pos++;
			if(str[pos] >= '0' && str[pos] <= '9'){
				d = 10 * d + str[pos]-'0';
				pos++;
			}
			Clause ret = new Clause();
			ret.type = 'v';
			ret.start = start;
			ret.end = pos;
			ret.value = d;
			return ret;
		}
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
