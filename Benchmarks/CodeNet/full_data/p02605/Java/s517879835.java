import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni();
		int[][] co = new int[n][];
		for(int i = 0;i < n;i++){
			co[i] = new int[]{ni()*2, ni()*2, nc(), -1};
			if(co[i][2] == 'U'){
				co[i][2] = 0; co[i][3] = 1;
			}else  if(co[i][2] == 'D'){
				co[i][2] = 0; co[i][3] = -1;
			}else  if(co[i][2] == 'R'){
				co[i][2] = 1; co[i][3] = 0;
			}else  if(co[i][2] == 'L'){
				co[i][2] = -1; co[i][3] = 0;
			}
		}
		
		int SUP = 400005;
		{
			int[][] one = new int[n][];
			int q = 0;
			for(int i = 0;i < n;i++){
				if(co[i][2] == 0){
					one[q++] = co[i];
				}
			}
			one = Arrays.copyOf(one, q);
			Arrays.sort(one, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					if(a[0] != b[0])return a[0] - b[0];
					return a[1] - b[1];
				}
			});
			for(int i = 0;i < q;){
				int j = i;
				while(j < q && one[j][0] == one[i][0])j++;
				
				int y = -99999999;
				for(int k = i;k < j;k++){
					if(one[k][3] == 1){
						y = one[k][1];
					}else if(y >= 0){
						SUP = Math.min(SUP, (one[k][1] - y)/2);
					}
				}
				
				i = j;
			}
		}
		{
			int[][] one = new int[n][];
			int q = 0;
			for(int i = 0;i < n;i++){
				if(co[i][3] == 0){
					one[q++] = co[i];
				}
			}
			one = Arrays.copyOf(one, q);
			Arrays.sort(one, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					if(a[1] != b[1])return a[1] - b[1];
					return a[0] - b[0];
				}
			});
			for(int i = 0;i < q;){
				int j = i;
				while(j < q && one[j][1] == one[i][1])j++;
				
				int y = -99999999;
				for(int k = i;k < j;k++){
					if(one[k][2] == 1){
						y = one[k][0];
					}else if(y >= 0){
						SUP = Math.min(SUP, (one[k][0] - y)/2);
					}
				}
				
				i = j;
			}
		}
		
		int low = 0, high = SUP;
		while(high - low > 1){
			int h = high+low>>1;
			if(ok(h, co)){
				low = h;
			}else{
				high = h;
			}
		}
		if(low >= 400002){
			out.println("SAFE");
		}else{
			out.println(high * 5);
		}
	}
	
	static boolean ok(int h, int[][] co)
	{
		int n = co.length;
		int[][] es = new int[2*n][];
		int p = 0;
		for(int i = 0;i < n;i++){
			if(co[i][2] == 1){
				es[p++] = new int[]{co[i][0], co[i][1], 1};
				es[p++] = new int[]{co[i][0]+h+1, co[i][1], -1};
			}else if(co[i][2] == -1){
				es[p++] = new int[]{co[i][0]+1, co[i][1], -1};
				es[p++] = new int[]{co[i][0]-h, co[i][1], 1};
			}else if(co[i][3] == 1){
				es[p++] = new int[]{co[i][0], co[i][1], Math.min(400001, co[i][1] + h + 1), -1};
			}else{
				es[p++] = new int[]{co[i][0], Math.max(0, co[i][1] - h) , co[i][1] + 1, -1};
			}
		}
		es = Arrays.copyOf(es, p);
		Arrays.sort(es, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] != b[0])return a[0] - b[0];
				if(a.length != b.length)return a.length - b.length;
				return -(a[2] - b[2]);
			}
		});
		int[] ft = new int[400008];
		for(int[] e : es){
			if(e.length == 3){
				addFenwick(ft, e[1], e[2]);
			}else{
				if(sumFenwick(ft, e[2]-1) - sumFenwick(ft, e[1]-1) > 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int sumFenwick(int[] ft, int i)
	{
		int sum = 0;
		for(i++;i > 0;i -= i&-i)sum += ft[i];
		return sum;
	}
	
	public static void addFenwick(int[] ft, int l, int r, int v)
	{
		addFenwick(ft, l, v);
		addFenwick(ft, r, -v);
	}
	
	public static void addFenwick(int[] ft, int i, int v)
	{
		if(v == 0 || i < 0)return;
		int n = ft.length;
		for(i++;i < n;i += i&-i)ft[i] += v;
	}
	
	public static int firstGEFenwick(int[] ft, int v)
	{
		int i = 0, n = ft.length;
		for(int b = Integer.highestOneBit(n);b != 0;b >>= 1){
			if((i|b) < n && ft[i|b] < v){
				i |= b;
				v -= ft[i];
			}
		}
		return i;
	}
	
	public static int[] restoreFenwick(int[] ft)
	{
		int n = ft.length-1;
		int[] ret = new int[n];
		for(int i = 0;i < n;i++)ret[i] = sumFenwick(ft, i);
		for(int i = n-1;i >= 1;i--)ret[i] -= ret[i-1];
		return ret;
	}

	
	public static void main(String[] args) throws Exception
	{
//		int n = 200000, m = 99999;
//		Random gen = new Random();
//		StringBuilder sb = new StringBuilder();
//		sb.append(n + " ");
//		for (int i = 0; i < n; i++) {
//			sb.append(gen.nextInt(200001) + " ");
//			sb.append(gen.nextInt(200001) + " ");
//			sb.append("URDL".charAt(gen.nextInt(4)) + " ");
//		}
//		INPUT = sb.toString();

		
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
