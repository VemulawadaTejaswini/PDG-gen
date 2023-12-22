import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		
		PriorityQueue<Edge> que = new PriorityQueue<>((a, b) -> a.w- b.w);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int w = sc.nextInt();
				if(i < j && w != -1) {
					que.add(new Edge(w, i, j));
				}
			}
		}
		
		Node[] V = new Node[n];
		for(int i=0; i<n; i++) {
			V[i] = new Node(i);
		}
		
		int sum = 0;
		while(!que.isEmpty()) {
			Edge edge = que.poll();
			int parent_1 = V[edge.a1].findParent(V);
			int parent_2 = V[edge.a2].findParent(V);
			if(parent_1 != parent_2) {
				V[parent_2].parent = parent_1;
				sum += edge.w;
//				System.out.println(edge.a1 + " " + edge.a2 + " " + edge.w);
			}
		}
		
		System.out.println(sum);
	}
	
	static class Node {
		int id;
		int parent = -1;
		
		Node(int id) {
			this.id = id;
		}
		
		public int findParent(Node[] V) {
			if(parent == -1) {
				return id;
			} else {
				parent = V[parent].findParent(V);
				return parent;
			}
		}
	}
	
	static class Edge {
		int w;
		int a1;
		int a2;
		
		Edge(int w, int a1, int a2) {
			this.w = w;
			this.a1 = a1;
			this.a2 = a2;
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