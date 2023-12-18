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
        /*
                rr = raw_input
        rri = lambda: int(raw_input())
        rrm = lambda: map(int, raw_input().split())

        from collections import deque
        def solve(N, A):
            ans = 0
            todo = N * (N-1)
            while True:
                ans += 1
                found = False
                pairings = [None] * N
                for i, row in enumerate(A):
                    if row:
                        j = row[0]
                        if pairings[i] == pairings[j] == None and A[j] and A[j][0] == i:
                            pairings[i] = j
                            pairings[j] = i
                            row.popleft()
                            A[j].popleft()
                            found = True
                            todo -= 2
                if not todo: return ans
                if not found: return -1
        */
        
		int N = ni();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; ++i) {
            int t = 0;
            A[i][0] = 1;
            for (int j = 1; j < N; ++j) {
                A[i][j] = ni() - 1;
            }
        }
        
        int ans = 0, todo=N*(N-1);
        while (true) {
            ans++;
            boolean found = false;
            int[] pairings = new int[N];
            Arrays.fill(pairings, -1);
            for (int i = 0; i < N; ++i) {
                if (A[i][0] < N) {
                    int j = A[i][A[i][0]];
                    if (pairings[i] == pairings[j] && pairings[i] == -1 && A[j][0] < N && A[j][A[j][0]] == i) {
                        //System.out.println("" + i + " " + j);
                        pairings[i] = j;
                        pairings[j] = i;
                        A[i][0]++;
                        A[j][0]++;
                        found = true;
                        todo -= 2;
                    }
                }
            }
            //System.out.println(Arrays.toString(pairings));
            if (todo == 0) {
                break;
            }
            if (!found) {
                ans=-1;break;
            }
        }
        
        out.println(ans);
        
        //System.out.println(Arrays.deepToString(A));
        return;
        
	}
    
	
	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
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
