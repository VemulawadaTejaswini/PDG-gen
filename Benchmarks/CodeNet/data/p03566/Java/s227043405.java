import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int[] T = new int[N];
		int[] V = new int[N];
		for(int i=0; i<N; i++) T[i] = reader.nextInt();
		for(int i=0; i<N; i++) V[i] = reader.nextInt();
		solver(N, T, V);
	}
	
	public static void solver(int N, int[] T, int[] V) {
		// write logic
		int[] fMax = new int[20001];
		int[] rMax = new int[20001];
		int[] ansV = new int[20001];
		int i    = 1;
		int it   = 0;
		int sum  = 0;
		int maxV = 0;
		while(true) {
		    if (sum < i) {
		        if (it == N) break;
		        sum += T[it];
		        maxV = V[it];
		        it++;
		    }
		    fMax[i] = Math.min(fMax[i-1]+1, maxV);
		    i++;
		}

		int tmpsum = 0;
		i = 1;
		it = 0;
		while(true) {
		    if (tmpsum < i) {
		        if (it == N) break;
		        tmpsum += T[N-it-1];
		        maxV = V[N-it-1];
		        it++;
		    }
		    rMax[sum-i] = Math.min(rMax[sum-i+1]+1, maxV);
		    i++;
		}
		
		int ans = 0;
		int cross = 0;
		for(int t=0; t<sum; t++) {
		    if (fMax[t] == rMax[t+1] && rMax[t] == fMax[t+1] && Math.abs(fMax[t]-fMax[t+1]) == 1) cross++;
		    ans += Math.min(fMax[t], rMax[t]) + Math.min(fMax[t+1], rMax[t+1]);
		}
		System.out.println((double)ans/2.0+(double)cross*0.25);
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
	
    static int bellmanford(int n, Edge[] edges, int s, int g) {
	    int[] distance = new int[n];
        int[] count    = new int[n];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[s] = 0;

        for (int i=0; i<n-1; i++) {
            for (Edge e : edges) {
                if (distance[e.source] != Integer.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
                    distance[e.target] = distance[e.source] + e.cost;
                }
            }
        }
        int tmp = distance[g];
        for (int i=0; i<n-1; i++) {
            for (Edge e : edges) {
                if (distance[e.source] != Integer.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
                    distance[e.target] = distance[e.source] + e.cost;
                }
            }
        }
        
        // check logic
        if (tmp > distance[n-1]) return Integer.MIN_VALUE;
        else return distance[n-1];
    }

	static class Edge {
	    public int source = 0;
	    public int target = 0;
	    public int cost   = 0;
	    
	    public Edge(int source, int target, int cost) {
	        this.source = source;
	        this.target = target;
	        this.cost   = cost;
	    }
	    
	    public int compareTo(Edge e) {
	        return this.cost - e.cost;
	    }
	}
}
