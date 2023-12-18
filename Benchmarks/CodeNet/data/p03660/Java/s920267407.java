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
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int N = sc.nextInt();
		ArrayList<ArrayList<Integer>> G = new ArrayList<>();
		for(int i = 0; i < N; i++) G.add(new ArrayList<>());
		for(int i = 0; i < N-1; i++){
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			G.get(s).add(t);
			G.get(t).add(s);
		}
		
		int[] distF = new int[N];
		Arrays.fill(distF, Integer.MAX_VALUE / 2);
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		distF[0] = 0;
		
		while(!queue.isEmpty()){
			int v = queue.poll();
			for(int next : G.get(v)){
				if(distF[next] > distF[v] + 1){
					distF[next] = distF[v] + 1;
					queue.add(next);
				}
			}
		}
		
		int[] distS = new int[N];
		Arrays.fill(distS, Integer.MAX_VALUE / 2);
		queue.add(N-1);
		distS[N-1] = 0;
		
		while(queue.size() != 0){
			int v = queue.poll();
			for(int next : G.get(v)){
				if(distS[next] > distS[v] + 1){
					distS[next] = distS[v] + 1;
					queue.add(next);
				}
			}
		}
		
		int numF = 0, numS = 0;
		for(int i = 0; i < N; i++){
			if(distF[i] <= distS[i]) numF++;
			else numS++;
		}
		System.out.println((numF > numS) ? "Fennec" : "Snuke");
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