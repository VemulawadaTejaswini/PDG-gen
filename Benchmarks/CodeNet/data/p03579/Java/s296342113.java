import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static Node[] V;
	private static int N;
	private static int M;
	private static int black = 0;
	private static int white = 0;
	
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		V = new Node[N];
		for(int i=0; i<N; i++) {
			V[i] = new Node();
			V[i].id = i;
		}
		for(int i=0; i<M; i++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			V[l].nbr.add(r);
			V[r].nbr.add(l);
		}
		V[0].dfs(0);
		System.out.println(black * white - M);
	}
	
	static class Node {
		int id;
		ArrayList<Integer> nbr = new ArrayList<>();
		boolean used;
		int d;
		
		void dfs(int d) {
			used = true;
			this.d = d;
			if(d%2 == 0) {
				black++;
			} else {
				white++;
			}
			for(int x : nbr) {
				if(!V[x].used) {
					V[x].dfs(d+1);
				} else {
					if(Math.abs(V[x].d - d)%2 == 0) {
						System.out.println(N*(N-1)/2 - M);
						System.exit(0);
					}
				}
			}
		}
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
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
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
