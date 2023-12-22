import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;
	static int timer = 1;
	static PriorityQueue<Integer> ans = new PriorityQueue<>();
	static int rootChild = 0;
	
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
			V[t].nbr.add(s);
		}

		V[0].dfs(-1);
		
		if(rootChild >= 2) {
			ans.add(0);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!ans.isEmpty()) {
			sb.append(ans.poll());
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	static class Node {
		int id;
		int prenum;
		int parent = -1;
		int lowest;
		boolean visited = false;
		HashSet<Integer> nbr = new HashSet<>();
		
		void dfs(int prev) {
			prenum = timer;
			lowest = timer;
			timer++;
			
			visited = true;
			
			for(int v : nbr) {
				if(!V[v].visited) {
					V[v].parent = id;
					V[v].dfs(id);
					
					lowest = Math.min(lowest, V[v].lowest);
				} else if(prev != v) {
					lowest = Math.min(lowest, V[v].prenum);
				}
			}
			if(parent == 0) {
				rootChild++;
			}
			if(parent != 0 && parent != -1 && lowest >= V[parent].prenum) {
				ans.add(parent);
			}
		}
	}
	
	static class Edge {
		int s;
		int t;
		
		Edge(int s, int t) {
			this.s = s;
			this.t = t;
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