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
		
		int[] num = new int[N];
		Arrays.fill(num, Integer.MAX_VALUE / 2);
		int[] from = new int[N];
		Arrays.fill(from, -1);
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);
		num[0] = 0;
		
		while(queue.size() != 0){
			int v = queue.poll();
			if(v == N-1) break;
			for(int next : G.get(v)){
				if(num[next] > num[v] + 1){
					num[next] = num[v] + 1;
					from[next] = v;
					queue.add(next);
				}
			}
		}
		
		boolean[] visited = new boolean[N];
		int now = N-1;
		for(int i = 0; now != -1; i++){
			//System.out.println(now);
			if(i <= num[N-1] / 2) visited[now] = true;
			now = from[now];
		}
		//System.out.println(num[N-1]);
		
		int numF = 1;
		Queue<Integer> queueAns = new ArrayDeque<>();
		queueAns.add(0);
		
		while(queueAns.size() != 0){
			int v = queueAns.poll();
			for(int next : G.get(v)){
				if(!visited[next]){
					visited[next] = true;
					numF++;
					queueAns.add(next);
				}
			}
		}
		
		System.out.println((numF > N - numF) ? "Fennec" : "Snuke");
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