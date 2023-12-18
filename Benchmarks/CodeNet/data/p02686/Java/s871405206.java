import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static final boolean L = true, R = false;
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		boolean[][] S = new boolean[N][];
		
		LinkedList<int[]> fst = new LinkedList<>();
		LinkedList<int[]> snd = new LinkedList<>();
		
		IntStream.range(0, N).forEach( i -> {
			String in = scanner.next();
			int left = 0, right = 0;
			boolean[] t = new boolean[in.length()];
			for (int j = 0, len = in.length(); j < len; j++) {
				if (in.charAt(j) == '(') {
					left++;
					t[j] = L;
				} else {
					right++;
					t[j] = R;
				}
			}
			S[i] = t;
			if (left - right >= 0) {
				fst.add( new int[]{right, i});
			} else {
				snd.add( new int[]{left,  i});
			}
		});
		
		Collections.sort(fst, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		Collections.sort(snd, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0] - o1[0];
			}
		});
		
		Stack<Boolean> stack = new Stack<>();
		for (int[] n : fst) {
			boolean[] T = S[n[1]];
			
			for(int i = 0, len = T.length; i < len; i++){
				if (T[i]) {
					stack.push(L);
				} else {
					if (stack.isEmpty()) {
						System.out.println("No");
						return;
					} else {
						if ( !stack.pop() ) {
							System.out.println("No");
							return;
						}
					}
				}
			};
		}
		
		
		for (int[] n : snd) {
			boolean[] T = S[n[1]];
			
			for(int i = 0, len = T.length; i < len; i++){
				if (T[i]) {
					stack.push(L);
				} else {
					if (stack.isEmpty()) {
						System.out.println("No");
						return;
					} else {
						if ( !stack.pop() ) {
							System.out.println("No");
							return;
						}
					}
				}
			};
		}
		
		if (stack.isEmpty()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void main(String[] args) {
		new Main();
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
