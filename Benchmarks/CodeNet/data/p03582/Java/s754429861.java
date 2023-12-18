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
	
	static void solve()
	{
		int x = ni(), y = ni(), z = ni();
		int n = x+y+z;
		int[] f = new int[]{x, y, z};
		if(x == 0 && y == 0){
			for(int i = 0;i < z;i++){
				out.print("c");
			}
			out.println();
			return;
		}
		if(x == 0){
			f[0] = f[1]; 
			f[1] = f[2];
			f[2] = 0;
		}
		
		String ans = "";
		for(int ar = 1;ar <= n;ar++){
			int na = 0;
			int nbc = 0;
			for(int i = 0;i < n;i+=ar+1){
				if(i+ar+1 > n){
					na += n-i-1;
					nbc++;
				}else{
					na += ar;
					nbc += 1;
				}
			}
			assert na + nbc == n;
			if(na >= f[0]){
				for(int pe = n;pe >= ar+1;pe--){
					int lna = 0;
					for(int i = 0;i < n;i+=pe){
						if(i+pe > n){
							lna += Math.min(ar, n-1-i);
						}else{
							lna += ar;
						}
					}
					if(lna >= f[0]){
//						tr("OK", pe, lna, f[0], na, ar);
						int[] g = Arrays.copyOf(f, 3);
						char[] t = new char[n];
						int[] h = new int[n];
						for(int j = 0;j < pe;j++){
							for(int k = j;k < n-1;k+=pe){
								if(g[0] > 0){
									h[k/pe]++;
									g[0]--;
									t[k] = 'a';
								}
							}
						}
						for(int l = 0;l < n;l++){
							if(h[l] == 0){
								if(h[0] == h[l-1]){
									for(int j = 0;j < pe;j++){
										for(int k = j+pe*50;k >= j;k-=pe){
											if(k >= n)continue;
											if(t[k] != 0)continue;
											if(g[2] > 0){
												g[2]--;
												t[k] = 'c';
											}
										}
									}
									for(int j = 0;j < n;j++){
										if(t[j] == 0){
											t[j] = 'b';
										}
									}
								}else{
									int u = 0;
									for(;u < l && h[0] == h[u];u++);
									for(int j = 0;j < pe;j++){
										for(int k = j+(u-1)*pe;k >= j;k-=pe){
											if(k >= n)continue;
											if(t[k] != 0)continue;
											if(g[2] > 0){
												g[2]--;
												t[k] = 'c';
											}
										}
									}
									for(int j = 0;j < n;j++){
										if(t[j] == 0){
											t[j] = 'b';
										}
									}
								}
								String can = new String(t);
								can = rotate(can);
								if(can.compareTo(ans) > 0){
									ans = can;
								}
								break;
							}
						}
					}
				}
			}
		}
		
		if(x == 0){
			ans = ans.replace("b", "c");
			ans = ans.replace("a", "b");
		}
		out.println(ans);
	}
	
	static String rotate(String s)
	{
		String t = s;
		for(int i = 0;i < s.length();i++){
			String v = s.substring(i) + s.substring(0, i);
			if(v.compareTo(t) < 0){
				t = v;
			}
		}
		return t;
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
