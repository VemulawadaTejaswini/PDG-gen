import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.Entry;


class Main {
	static Node[] node;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N-1];
		int[] B = new int[N-1];
		for(int i = 0; i < N-1; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		node = new Node[N];
		for(int i = 0; i < N; i++) {
			node[i] = new Node();
		}
		for(int i = 0; i < N-1; i++) {
			node[A[i] - 1].dst.add(B[i] - 1);
			node[B[i] - 1].dst.add(A[i] - 1);
		}
		int count = 0;
		while(true) {
			Data tmp = diameter();
			if(tmp.length <= K) break;
			node[tmp.maxID].rem = true;
			count++;
		}
		System.out.println(count);
	}
	static int timer;
	static int[] prenum;
	static int[] lowest;
	static int[] parent;
	static boolean[] visited;
	static void dfs(int u, int prev) {
    // ノード u を訪問した直後の処理
		prenum[u] = timer;
		lowest[u] = timer;
		timer++;

		visited[u] = true;
		
		for(int i = 0; i < node[u].dst.size(); i++) {
			if (!visited[node[u].dst.get(i)]) {
		            parent[node[u].dst.get(i)] = u;
		            dfs( node[u].dst.get(i), u );
		            lowest[u] = Math.min( lowest[u], lowest[node[u].dst.get(i)]);
			}
		    else if  (node[u].dst.get(i) != prev) {
		            lowest[u] = Math.min( lowest[u], prenum[node[i].dst.get(i)]);
		     }
		}
    }
    
	static Data diameter() {
		int[] min = new int[node.length];
		boolean[] cantRemove = new boolean[node.length];
		for(int i = 0; i < node.length; i++) {
			if(node[i].rem) cantRemove[i] = true;
			ArrayList<Integer> next = node[i].dst;
			int count = 0;
			for(int j = 0; j < next.size(); j++) {
				if(!node[next.get(j)].rem) count++;
			}
			if(count >= 2) cantRemove[i] = true;
		}
		prenum = new int[node.length];
		lowest = new int[node.length];
		parent = new int[node.length];
		visited = new boolean[node.length];
		int root = 0;
		timer = 1;
		dfs( root, -1);
		
		Arrays.fill(min, 2 << 28);
		ArrayDeque<P> q = new ArrayDeque<>();
		for(int i = 0; i < node.length; i++) {
			if(!node[i].rem) {
				q.addFirst(new P(i,0));
				break;
			}
		}
		int maxP = 0;
		int maxL = 0;
		while(!q.isEmpty()) {
			P p = q.pollLast();
			if(min[p.now] <= p.cost) continue;
			min[p.now] = p.cost;
			if(maxL < p.cost) {
				maxL = p.cost;
				maxP = p.now;
			}
			for(int i = 0; i < node[p.now].dst.size(); i++) {
				if(!node[node[p.now].dst.get(i)].rem) q.addFirst(new P(node[p.now].dst.get(i),p.cost+1));
			}
		}
		Arrays.fill(min, 2 << 28);
		q.addFirst(new P(maxP,0));
		maxP = 0;
		maxL = 0;
		while(!q.isEmpty()) {
			P p = q.pollLast();
			if(min[p.now] <= p.cost) continue;
			min[p.now] = p.cost;
			if(maxL < p.cost && !cantRemove[p.now]) {
				maxL = p.cost;
				maxP = p.now;
			}
			for(int i = 0; i < node[p.now].dst.size(); i++) {
				if(!node[node[p.now].dst.get(i)].rem) q.addFirst(new P(node[p.now].dst.get(i),p.cost+1));
			}
		}
		return new Data(maxP,maxL);
	}
	static class P {
		int now;
		int cost;
		P(int a, int b) {
			now = a;
			cost = b;
		}
	}
	static class Data {
		int maxID;
		int length; 
		Data(int a, int b) {
			maxID = a;
			length = b;
		}
	}
	static class Node {
		boolean rem = false;
		ArrayList<Integer> dst = new ArrayList<>();
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
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	    public int nextInt() {
	        if (!hasNext()) throw new NoSuchElementException();
	        int n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	}
}
