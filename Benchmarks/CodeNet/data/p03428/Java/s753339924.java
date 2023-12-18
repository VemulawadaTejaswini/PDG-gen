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
			co[i] = new int[]{ni(), ni()};
		}
		boolean[] dead = new boolean[n];
		outer:
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				for(int k = j+1;k < n;k++){
					if(j == i || k == i)continue;
					if(isACB(co[j][0], co[j][1], 
							co[k][0], co[k][1],
							co[i][0], co[i][1])){
						dead[i] = true;
						continue outer;
					}
					
					for(int l = k+1;l < n;l++){
						if(j == i || k == i || l == i)continue;
						if(onSameLine(co[j], co[k], co[l]))continue;
						int c1 = ccw(co[j], co[k], co[i]);
						int c2 = ccw(co[k], co[l], co[i]);
						int c3 = ccw(co[l], co[j], co[i]);
						if(c1+c2+c3 == 3 || c1+c2+c3 == -3){
							dead[i] = true;
							continue outer;
						}
					}
				}
			}
		}
		
		int alive = 0;
		for(int i = 0;i < n;i++){
			if(!dead[i])alive++;
		}
		if(alive == 2){
			for(int i = 0;i < n;i++){
				if(dead[i]){
					out.println(0);
				}else{
					out.println(0.5);
				}
			}
			return;
		}
		
		outer:
		for(int i = 0;i < n;i++){
			if(dead[i]){
				out.println(0);
				continue;
			}
			
			double[][] theta = new double[n-1][];
			int p = 0;
			for(int j = 0;j < n;j++){
				if(j == i)continue;
				theta[p++] = new double[]{Math.atan2(
						co[j][1]-co[i][1], 
						co[j][0]-co[i][0]
								), j};
			}
			Arrays.sort(theta, new Comparator<double[]>() {
				public int compare(double[] a, double[] b) {
					return Double.compare(a[0], b[0]);
				}
			});
			for(int j = 0;j < n-1;j++){
				int cur = (int)theta[j][1];
				int nex = (int)theta[(j+1)%(n-1)][1];
				if(inArg(
						co[cur][0]-co[i][0],
						co[cur][1]-co[i][1],
						-(co[cur][0]-co[i][0]),
						-(co[cur][1]-co[i][1]),
						co[nex][0]-co[i][0],
						co[nex][1]-co[i][1]) < 0){
//					tr(cur, i, nex);
					double val = Math.atan2(
							co[nex][1]-co[i][1], 
							co[nex][0]-co[i][0]
									) - Math.atan2(
											co[cur][1]-co[i][1], 
											co[cur][0]-co[i][0]
													) - Math.PI;
					if(val < -1e-5)val += 2*Math.PI;
					out.printf("%.14f\n", val/(2*Math.PI));
					continue outer;
				}
			}
		}
	}
	public static boolean onSameLine(int[] a, int[] b, int[] c)
	{
		return (long)(c[0]-a[0])*(b[1]-a[1])-(long)(c[1]-a[1])*(b[0]-a[0])==0;
	}

	
	public static boolean isACB(long ax, long ay, long bx, long by, long cx, long cy)
	{
		return (cx-ax)*(by-ay)-(cy-ay)*(bx-ax)==0 && (cx-ax)*(cx-bx)+(cy-ay)*(cy-by) <= 0;
	}
	
	public static int inArg(long ax, long ay, long bx, long by, long cx, long cy)
	{
		return (int)(Long.signum(ax*cy-ay*cx)-Long.signum(bx*cy-by*cx)-Long.signum(ax*by-ay*bx));
	}

	
	public static int ccw(int[] a, int[] b, int[] t){ return Long.signum((long)(t[0]-a[0])*(b[1]-a[1])-(long)(b[0]-a[0])*(t[1]-a[1])); }

	
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
