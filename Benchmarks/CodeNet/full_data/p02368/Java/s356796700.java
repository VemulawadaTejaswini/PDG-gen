import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	private static Node[] V;
	private static ArrayList<Integer> prenum = new ArrayList<>();
	private static int groupnum = 1;
	
	public static void main(String[] args) {
		int Vn = sc.nextInt();
		int En = sc.nextInt();
		
		V = new Node[Vn];
		for(int i=0; i<Vn; i++) {
			V[i] = new Node();
			V[i].id = i;
			V[i].group = -i;
		}
		
		for(int i=0; i<En; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			V[s].nbr.add(t);
			V[t].revnbr.add(s);
		}
		for(int i=0; i<Vn; i++) {
			V[i].dfs();
		}
		
		for(int i=0; i<Vn; i++) {
			V[i].visited = false;
		}
		
		for(int i=prenum.size()-1; i>=0; i--) {
			V[prenum.get(i)].revdfs();
			groupnum++;
		}
		
		int Q = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<Q; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
//			System.out.println(V[u].group + " " + V[v].group);
			if(V[u].group == V[v].group) {
				ans.append(1);
				ans.append("\n");
			} else {
				ans.append(0);
				ans.append("\n");
			}
		}
		
		System.out.print(ans);
	}
	
	static class Node {
		int id;
		HashSet<Integer> nbr = new HashSet<>();
		HashSet<Integer> revnbr = new HashSet<>();
		int group;
		boolean visited;
		
		void dfs() {
			if(visited) {
				return;
			}
			visited = true;
			
			for(int x : nbr) {
				if(!V[x].visited) {
					V[x].dfs();
				}
			}
			
			prenum.add(id);
		}
		
		void revdfs() {
			if(visited) {
				return;
			}
			visited = true;
			
			for(int x : revnbr) {
				if(!V[x].visited) {
					V[x].revdfs();
				}
			}
			
			group = groupnum;
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