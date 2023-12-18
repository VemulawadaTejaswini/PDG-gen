import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.*;

public class Main {
    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> divs = new ArrayList<Integer>();
        for (int i=1; i<=(int)Math.pow(n, 0.5); i++) {
            if (n % i == 0) {
                divs.add(i);
                if (i*i != n) {
                    divs.add(n/i);
                }
            }
        }
        return divs;
    }

	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N     = reader.nextInt();
		int[] A   = new int[N+1];
		int[] cnt = new int[N+1];
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i=1; i<=N; i++) {
		    A[i] = reader.nextInt();
		}
		for (int i=N; i>0; i--) {
		    if (A[i] != cnt[i]) {
		        ans.add(i);
		        ArrayList<Integer> div = divisors(i);
		        for (int it : div) {
		            cnt[it] ^= 1;
		        }
		    }
		}
		System.out.println(ans.size());
		for (int i=0; i<ans.size(); i++) {
		    System.out.print(ans.get(i));
		    if (i == ans.size()-1) System.out.println();
		    else System.out.print(" ");
		}
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
