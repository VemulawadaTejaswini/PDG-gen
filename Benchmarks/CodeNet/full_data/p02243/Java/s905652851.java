import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
		int n = sc.nextInt();
		
		Node[] V = new Node[n];
		PriorityQueue<Node> que = new PriorityQueue<>(11, (a, b) -> a.d - b.d);
		for(int i=0; i<n; i++) {
			sc.nextInt();
			int k = sc.nextInt();
			int[] v = new int[k];
			int[] c = new int[k];
			for(int j=0; j<k; j++) {
				v[j] = sc.nextInt();
				c[j] = sc.nextInt();
			}
			V[i] = new Node(v, c);
		}
		V[0].d = 0;
		que.add(V[0]);
		
		while(!que.isEmpty()) {
			Node node1 = que.poll();
			for(int i=0; i<node1.v.length; i++) {
				Node node2 = V[node1.v[i]];
				if(node2.d > node1.d + node1.c[i]) {
					if(que.contains(node2)) {
						que.remove(node2);
					}
					node2.d = node1.d + node1.c[i];
					que.add(node2);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(i + " " + V[i].d);
		}
	}
	
	static class Node {
		int d = Integer.MAX_VALUE;
		int[] v;
		int[] c;
		
		Node(int[] v, int[] c) {
			this.v = v;
			this.c = c;
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