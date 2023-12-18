import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    static class Count {
        public int index   = 0;
        public int current = 0;
        
        public Count(int index, int current) {
            this.index   = index;
            this.current = current;
        }
        
        public int compareTo(Count c) {
            return this.current - c.current;
        }
    }

	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
		    A[i] = reader.nextInt();
		}
		for(int i=0; i<N; i++) {
		    B[i] = reader.nextInt();
		}
		solver(N, A, B);
	}
	
	public static void solver(int N, int[] A, int[] B) {
		// write logic
		Comparator<Count> cmp = new Comparator<Count>() {
		    @Override
		    public int compare(Count c1, Count c2) {
		        return -c1.compareTo(c2);
		    }
		};

		PriorityQueue<Count> pq = new PriorityQueue<Count>(cmp);
		for(int i=0; i<N; i++) {
		    Count tmp = new Count(i, B[i]);
		    pq.add(tmp);
		}
		
		int ans = 0;
		while(pq.size() > 0) {
		    Count nxt = pq.poll();
		    if (nxt.current == A[nxt.index]) continue;
		    nxt.current -= B[(N+nxt.index-1)%N]+B[(N+nxt.index+1)%N];
		    B[nxt.index] = nxt.current;
		    ans++;
		    if (nxt.current <= 0) {
		        ans = -1;
		        break;
		    }

		    while(nxt.current > B[(N+nxt.index-1)%N]+B[(N+nxt.index+1)%N]) {
    		    nxt.current -= B[(N+nxt.index-1)%N]+B[(N+nxt.index+1)%N];
    		    B[nxt.index] = nxt.current;
    		    ans++;
		    }
		    pq.add(nxt);
		}
		System.out.println(ans);
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
