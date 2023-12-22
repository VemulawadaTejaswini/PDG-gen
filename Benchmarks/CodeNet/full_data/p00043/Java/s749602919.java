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
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String S = scanner.next();
			if(S == null) break;
			int[] num = new int[10];
			for(int i = 0; i < S.length(); i++) num[S.charAt(i) - '0']++;
			
			ArrayList<Integer> ans = new ArrayList<>();
			for(int i = 1; i <= 9; i++){
				int[] tehai = Arrays.copyOf(num, num.length);
				tehai[i]++;
				if(tehai[i] == 5) continue;
				if(canTitoi(Arrays.copyOf(tehai, tehai.length)) || can1(Arrays.copyOf(tehai, tehai.length))) ans.add(i);
			}
			
			if(ans.isEmpty()) System.out.println(0);
			else{
				for(int i = 0; i < ans.size(); i++){
					System.out.print(ans.get(i) + (i == ans.size()-1 ? "\n" : " "));
				}
			}
		}
		scanner.close();
 	}
	
	
	
	boolean canTitoi(int[] tehai){
		int sum = 0;
		for(int i = 1; i <= 9; i++){
			if(tehai[i] == 2) sum++;
			else if(tehai[i] != 0) return false;
		}
		return sum == 7;
	}
	
	boolean can1(int[] tehai){
		for(int i = 1; i <= 9; i++){
			if(tehai[i] < 2) continue;
			int[] t = Arrays.copyOf(tehai, tehai.length);
			t[i] -= 2;
			if(can4(t)) return true;
		}
		return false;
	}
	
	boolean can4(int[] tehai){
		int sumAll = 0;
		for(int i = 1; i <= 9; i++){
			sumAll += tehai[i];
			if(tehai[i] >= 3){
				int[] t = Arrays.copyOf(tehai, tehai.length);
				t[i] -= 3;
				if(can4(t)) return true;
			}
			if(i <= 7 && tehai[i] >= 1 && tehai[i+1] >= 1 && tehai[i+2] >= 1){
				int[] t = Arrays.copyOf(tehai, tehai.length);
				t[i]--; t[i+1]--; t[i+2]--;
				if(can4(t)) return true;
			}
		}
		return sumAll == 0;
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

class Pair{
	int x;
	long d;
	public Pair(int x, long d){this.x = x; this.d = d;}
}

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

