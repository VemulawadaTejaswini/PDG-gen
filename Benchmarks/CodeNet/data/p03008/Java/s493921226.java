import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	
	void solve()
	{
		int N = ni();
        int[] A = na(3);
        int[] B = na(3);
        
        int ans = N;
        for (int g = 0; g <= N; ++g) {
            if (g * A[0] > N) break;
            for (int s = 0; s <= N; ++s) {
                int cost = g*A[0] + s*A[1];
                if (cost > N) break;
                int bns = N + g*(B[0] - A[0]) + s*(B[1] - A[1]);
                if (bns > ans) ans = bns;
                int b = (N-cost) / A[2];
                bns = N + g*(B[0] - A[0]) + s*(B[1] - A[1]) + b*(B[2] - A[2]);
                if (bns > ans) ans = bns;
            }
        }
        
        int N2 = ans;
        for (int g = 0; g <= N2; ++g) {
            if (g * B[0] > N2) break;
            for (int s = 0; s <= N; ++s) {
                int cost = g*B[0] + s*B[1];
                if (cost > N2) break;
                int bns = N2 + g*(A[0] - B[0]) + s*(A[1] - B[1]);
                if (bns > ans) ans = bns;
                int b = (N2-cost) / B[2];
                bns = N2 + g*(A[0] - B[0]) + s*(A[1] - B[1]) + b*(A[2] - B[2]);
                if (bns > ans) ans = bns;
            }
        }
        
        out.println("" + ans);
	}
	
	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
//		Thread t = new Thread(null, null, "~", Runtime.getRuntime().maxMemory()){
//			@Override
//			public void run() {
//				long s = System.currentTimeMillis();
//				solve();
//				out.flush();
//				if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
//			}
//		};
//		t.start();
//		t.join();
	}
	
	public static void main(String[] args) throws Exception { new Main().run(); }
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private double nd() { return Double.parseDouble(ns()); }
	private char nc() { return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private long[] nal(int n)
	{
		long[] a = new long[n];
		for(int i = 0;i < n;i++)a[i] = nl();
		return a;
	}
	
	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private int[][] nmi(int n, int m) {
		int[][] map = new int[n][];
		for(int i = 0;i < n;i++)map[i] = na(m);
		return map;
	}
	
	private int ni() { return (int)nl(); }
	
	private long nl()
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
	
	private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
}
