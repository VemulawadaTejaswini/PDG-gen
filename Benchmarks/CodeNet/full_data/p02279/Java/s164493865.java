import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		Node[] nodes = new Node[n];
		for(int i=0; i<n; i++) {
			nodes[i] = new Node();
		}
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			int k = sc.nextInt();
			int[] c = new int[k];
			for(int j=0; j<k; j++) {
				c[j] = sc.nextInt();
				nodes[c[j]].parent = id;
			}
			
			nodes[id].child = c;
		}
		
		for(int i=0; i<n; i++) {
			if(nodes[i].parent == -1) {
				nodes[i].writeData(nodes, 0);
				break;
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<n; i++) { 
			ans.append("node ");
			ans.append(i);
			ans.append(": parent = ");
			ans.append(nodes[i].parent);
			ans.append(", depth = ");
			ans.append(nodes[i].depth);
			ans.append(", ");
			ans.append(nodes[i].type);
			ans.append(", [");
			for(int j=0; j<nodes[i].child.length; j++) {
				if(j != 0) {
					ans.append(", ");
				}
				ans.append(nodes[i].child[j]);
			}
			ans.append("]\n");
		}
		System.out.print(ans);
	}
	
	static class Node {
		int parent = -1;
		int[] child;
		int depth;
		String type;
		
		void writeData(Node[] nodes, int depth) {
			this.depth = depth;
			for(int i=0; i<child.length; i++) {
				nodes[child[i]].writeData(nodes, depth + 1);
			}
			if(this.parent == -1) {
				type = "root"; 
			} else if(child.length != 0) {
				type = "internal node";
			} else {
				type = "leaf";
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