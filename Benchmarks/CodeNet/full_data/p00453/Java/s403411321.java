import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	//final int INF = Integer.MAX_VALUE / 2;
	final long INF = Long.MAX_VALUE / 2;
	
	void solve() throws Exception{
		while(true){
			int n = sc.nextInt(), m = sc.nextInt();
			if(n == 0 && m == 0) break;
			calc(n, m);
		}
	}
	
	void calc(int n, int m){
		ArrayList<ArrayList<Pair>> list = new ArrayList<>();
		long[][][] cost = new long[n][1000][m+1];
		for(int i = 0; i < n; i++){
			list.add(new ArrayList<>());
			int k = sc.nextInt();
			for(int j = 0; j < k; j++){
				int x = sc.nextInt(), d = sc.nextInt();
				list.get(i).add(new Pair(x, d));
				for(int p = 0; p <= m; p++){
					if(i == 0 && p == 0) cost[i][j][p] = 0;
					else cost[i][j][p] = Long.MAX_VALUE;
				}
			}
		}
		
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < list.get(i).size(); j++){
				for(int k = 0; k < list.get(i+1).size(); k++){
					for(int p = 0; p <= m; p++){
						if(cost[i][j][p] == Long.MAX_VALUE) continue;
						long d1 = list.get(i).get(j).d, d2 = list.get(i+1).get(k).d;
						int x1 = list.get(i).get(j).x, x2 = list.get(i+1).get(k).x;
						long c = (d1 + d2) * Math.abs(x2 - x1);
						cost[i+1][k][p] = Math.min(cost[i+1][k][p], cost[i][j][p] + c);
						
						if(i >= n-2 || p == m) continue;
						d2 = list.get(i+2).get(k).d;
						x2 = list.get(i+2).get(k).x;
						c = (d1 + d2) * Math.abs(x2 - x1);
						cost[i+2][k][p+1] = Math.min(cost[i+2][k][p+1], cost[i][j][p] + c);
					}
				}
			}
		}
		
		long min = Long.MAX_VALUE;
		for(int i = 0; i < list.get(n-2).size(); i++){
			for(int j = 0; j < m; j++){
				min = Math.min(min, cost[n-2][i][j]);
			}
		}
		for(int i = 0; i < list.get(n-1).size(); i++){
			for(int j = 0; j <= m; j++){
				min = Math.min(min, cost[n-1][i][j]);
			}
		}
		System.out.println(min);
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms\n", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

