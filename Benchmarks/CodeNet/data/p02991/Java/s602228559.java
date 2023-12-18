import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
	ArrayList<HashSet<Integer>> edgeList;
	ArrayList<HashSet<Integer>> threeStepEdgeList;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		edgeList = new ArrayList<>(n);
		threeStepEdgeList = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			edgeList.add(new HashSet<>());
			threeStepEdgeList.add(new HashSet<>());
		}
		
		for(int i = 0; i< m; i++) {
			int from = fs.nextInt()-1;
			int to = fs.nextInt()-1;
			edgeList.get(from).add(to);
		}
		
		for(int i = 0; i < n; i++) {
			dfs(0, i, i);
		}
		
		int start = fs.nextInt()-1;
		int end = fs.nextInt()-1;
		
		int[] visitedNode = new int[n];
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(new Node(start, 0));
		visitedNode[start] = 1;
		
		while(!queue.isEmpty()) {
			Node thisNode = queue.poll();
			
			if(thisNode.id == end) {
				System.out.println(thisNode.depth);
				return;
			}
			
			for(Integer nextNode : threeStepEdgeList.get(thisNode.id)) {
				if(visitedNode[nextNode] == 1 || thisNode.id == nextNode) {
					continue;
				}
				
				queue.add(new Node(nextNode, thisNode.depth+1));
				visitedNode[nextNode] = 1;
			}
		}
		
		System.out.println(-1);
	}
	
	class Node{
		int depth;
		int id;
		Node(int id, int depth){
			this.id = id;
			this.depth = depth;
		}
	}
	
	void dfs(int depth, int nowEdge, int start) {
		if(depth == 3) {
			threeStepEdgeList.get(start).add(nowEdge);
			return;
		}
		
		for(Integer nextEdge : edgeList.get(nowEdge)) {
			dfs(depth+1, nextEdge, start);
		}
	}
	
	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
