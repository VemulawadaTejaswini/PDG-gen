import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.lang.Math;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayDeque;

public class Main {
    static class Tree {
        public int parent = -1;
        public HashMap<Integer, Boolean> children = new HashMap<Integer, Boolean>();
    }

	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		String s = reader.next();
		String t = reader.next();
		int N = s.length();
		int M = t.length();
		
		long[][] table = new long[N][26];
		for(int i=0; i<N; i++) {
		    for(int j=0; j<26; j++) {
		        table[i][j] = Long.MAX_VALUE;
		    }
		}
		for (int i=0; i<N; i++) {
		    int alp = s.charAt(i) - 'a';
		    int j = (N+i-1)%N;
		    while (true) {
		        table[j][alp] = (N+i-j)%N;
		        if (table[j][alp] == 0) table[j][alp] = N;
		        if (i == j || s.charAt(i) == s.charAt(j)) break;
		        j = (N+j-1)%N;
		    }
		}
		
		long ans = -1;
		for (int i=0; i<N; i++) {
		    if (t.charAt(0) == s.charAt(i)) {
		        ans = i+1;
		        break;
		    }
		}
		if (ans == -1) {
		    System.out.println(ans);
		    return;
		}
		
		for (int i=1; i<M; i++) {
		    if (table[(int)((ans-1)%(long)N)][t.charAt(i)-'a'] == Long.MAX_VALUE) {
		        System.out.println(-1);
		        return;
		    }
		    ans += table[(int)((ans-1)%(long)N)][t.charAt(i)-'a'];
		}
		System.out.println(ans);
	}
	
	public static void solver() {
		// write logic
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
		public int nextInt() {
			return (int)nextLong();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}
