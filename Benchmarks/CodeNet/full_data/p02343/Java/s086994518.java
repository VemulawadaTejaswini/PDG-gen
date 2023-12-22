import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Node[] V;

	public static void main(String[] args) {
		int n = sc.nextInt();
		int q = sc.nextInt();
		V = new Node[n];
		
		for(int i=0; i<n; i++) {
			V[i] = new Node(i);
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<q; i++) {
			int cmd = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(cmd == 0) {
				int x_parent = V[x].findParent();
				int y_parent = V[y].findParent();
				V[y_parent].parent = x_parent;
			} else {
				int x_parent = V[x].findParent();
				int y_parent = V[y].findParent();
				if(x_parent == y_parent) {
					ans.append("1\n");
				} else {
					ans.append("0\n");
				}
			}
		}
		
		System.out.print(ans);
	}
	
	static class Node {
		int id;
		int parent = -1;
		
		Node(int i) {
			id = i;
		}
		
		public int findParent() {
			if(parent == -1) {
				return id;
			} else {
				parent = V[parent].findParent();
				return parent;
			}
		}
	}

	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
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
	}
}