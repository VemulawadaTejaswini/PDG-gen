import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static Node[] V;
	private static ArrayList<Integer> sort = new ArrayList<>();
	
	public static void main(String[] args) {
		int Vn = sc.nextInt();
		int En = sc.nextInt();
		
		V = new Node[Vn];
		for(int i=0; i<Vn; i++) {
			V[i] = new Node();
			V[i].id = i;
		}
		
		for(int i=0; i<En; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			V[s].nbr.add(t);
		}
		
		for(int i=0; i<Vn; i++) {
			if(V[i].visited == 0) {
				V[i].visit();
			}
		}
		
		System.out.println(0);
	}
	
	static class Node {
		int id;
		HashSet<Integer> nbr = new HashSet<>();
		int visited = 0;
		
		void visit() {
			if(visited == 1) {
				System.out.println(1);
				System.exit(0);
			} else if(visited == 0) {
				visited = 1;
				for(int x : nbr) {
					V[x].visit();
				}
				
				visited = 2;
				sort.add(id);
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