import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

public class Main {
	//java11

	public static void main(String[] args) {

		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		long startTime = System.currentTimeMillis();

		UDGraph g = new UDGraph(N);
		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			g.addEdge(A, B);
		}

		long endTime = System.currentTimeMillis();

		System.out.println(endTime-startTime + "ms");

		//BFS
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(1);
		while(!queue.isEmpty()) {
			int n = queue.poll();
//			System.out.println("polled: " + n.value);

			//訪問済み
			g.setVisited(n);

			startTime = System.currentTimeMillis();
			for(Edge edge : g.getEdges(n)) {

				int node = edge.to;

				if(!queue.contains(node) && !g.getVisited(node)) {
					queue.add(node);
//					System.out.println("added: " + node.value);
					if(g.getRoot(node) >= 0) {
						System.out.println("No");
						return;
					}else {
						g.setRoot(node, n);
					}
				}
			}
			endTime = System.currentTimeMillis();
			System.out.println(n + ":" + (endTime-startTime) + "ms");
		}

		PrintWriter out = new PrintWriter(System.out);
		out.println("Yes");
		for(int i=2; i<=N; i++) {
			out.println(g.getRoot(i));
		}
		out.flush();
//		System.out.println("Yes");
//		for(int i=2; i<=N; i++) {
//			System.out.println(g.getNode(i).root.value);
//		}

	}

	//無向グラフ(UnDirected Graph)
	public static class UDGraph extends Graph{
		public UDGraph(int n) {
			super(n);
		}

		@Override
		public void addEdge(int from, int to) {
			//重みが1のグラフの場合(重みが均等な場合にも場合によっては使える)
			super.addEdge(from, to);
			super.addEdge(to, from);
		}

		@Override
		public void addEdge(int from, int to, long weight) {
			//エッジの重みが異なる場合
			super.addEdge(from, to, weight);
			super.addEdge(to, from, weight);
		}
	}

	//一般的なグラフ
	public static class Graph{
		int n;
		List<Edge>[] edges;
		boolean[] visited;
		int[] root;

		//1~Nまでをもつグラフ
		public Graph(int n) {
			this.n = n;
			edges = new ArrayList[n];
			for(int i=0; i<n; i++) {
				List<Edge> e_list = new ArrayList<>();
				edges[i] = e_list;
			}

			visited = new boolean[n];
			Arrays.fill(visited, false);

			root = new int[n];
			Arrays.fill(root, -1);
		}

		public void addEdge(int from, int to) {
			//重みが1のグラフの場合(重みが均等な場合にも場合によっては使える)
			edges[from-1].add(new Edge(to, 1));
		}

		public void addEdge(int from, int to, long weight) {
			//エッジの重みが異なる場合
			edges[from-1].add(new Edge(to, weight));
		}

		public void removeEdge(int from, int to) {
			//指定したノード間のエッジを削除
			edges[from-1].remove(new Edge(to, 1));
		}

		//ノード番号numのエッジの集合
		public List<Edge> getEdges(int num) {
			return edges[num-1];
		}

		//ノード番号numのルートノードのset
		public void setRoot(int num, int root_n) {
			root[num-1] = root_n;
		}

		//ノード番号numのルートノード
		public int getRoot(int num) {
			return root[num-1];
		}

		//ノード番号numのルートノードのset
		public void setVisited(int num) {
			visited[num-1] = true;
		}

		public boolean getVisited(int num) {
			return visited[num-1];
		}

		public void resetVisited() {
			Arrays.fill(visited, false);
		}
	}

	//エッジを表すクラス
	public static class Edge{
		int to;		//行き先
		long weight;		//重み

		public Edge(int to, long weight) {
			this.to = to;
			this.weight = weight;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Edge) {
				Edge e = (Edge)obj;
				if(this.to == e.to)
					return true;
				else
					return false;
			}

			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.to);
		}
	}

	static class FastScanner {
	    private InputStream in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    public FastScanner(InputStream in) {
	    	this.in = in;
	    }

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
	    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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
	}

}
