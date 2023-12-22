import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	static final long MOD = 1000000007L;
	
	class Node {
		long a, b;
		
		public Node(long a, long b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Node node = (Node) o;
			return a == node.a &&
					b == node.b;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(a, b);
		}
	}
	
	Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		
		HashMap<Node, Integer> P = new HashMap<>();
		HashMap<Node, Integer> M = new HashMap<>();
		int aZero = 0, bZero = 0, abZero = 0;
		
		for (int i = 0; i < N; i++) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			
			if ( a == 0 && b == 0) {
				abZero++;
				continue;
			} else if ( a == 0 ) {
				aZero++;
				continue;
			} else if ( b == 0 ) {
				bZero++;
				continue;
			}
			
			if ( (a > 0 && b > 0) || (a < 0 && b < 0) ) {
				a = Math.abs(a);
				b = Math.abs(b);
				long gcd = gcd(a, b);
				Node n = new Node(a/gcd, b/gcd);
				P.put( n, P.getOrDefault(n, 0)+1);
			} else {
				a = Math.abs(a);
				b = Math.abs(b);
				long gcd = gcd(a, b);
				Node n = new Node(b/gcd, a/gcd);
				M.put( n, M.getOrDefault(n, 0)+1);
			}
		}
		
		long Ans = 1L;
		for ( Node key : P.keySet() ) {
			if ( M.containsKey(key) ) {
				long c = ( modPow(P.get(key)) + modPow(M.get(key)) ) % MOD - 1;
				if (c < 0) c += MOD;
				Ans = Ans*c%MOD;
				M.remove(key);
			} else {
				Ans = Ans*modPow(P.get(key))%MOD;
			}
		}
		
		for ( Node key : M.keySet() ) {
			Ans = Ans*modPow(M.get(key))%MOD;
		}
		
		//Aが0のイワシはBがどんな値であれBが0の物と同時に選ぶことはできない
		long c = ( modPow(aZero) + modPow(bZero) ) % MOD - 1;
		if (c < 0) c += MOD;
		Ans = Ans*c%MOD;
		
		//A, Bともに0の場合は単独で選ぶしかできない
		Ans = (Ans + abZero) % MOD;
		
		//全てを選ばないことは禁止されている
		Ans -= 1;
		if (Ans < 0) Ans += MOD;
		
		System.out.println(Ans);
	}
	
	long gcd(long a, long b) {
		if ( a % b == 0) return b;
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	long modPow(long n) {
		long res = 1;
		long a = 2L;
		while (n > 0) {
			if ( (n & 1) == 1) res = res * a % MOD;
			a = a * a % MOD;
			n >>= 1;
		}
		return res;
	}
}


class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
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
