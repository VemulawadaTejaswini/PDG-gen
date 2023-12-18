import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		int s = fs.nextInt() - 1;
		int t = fs.nextInt() - 1;

		//隣接リスト
		//iとjが距離dで接続しているとき、rinsetuList[i]はint[]型の{j ,d}を要素として持つ
		ArrayList<int[]>[] rinsetuList = new ArrayList[n];
		ArrayList<int[]>[] rinsetuList2 = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			rinsetuList[i] = new ArrayList<int[]>();
			rinsetuList2[i] = new ArrayList<int[]>();
		}

		//ノードの優先度付きキュー
		//(nodeIndex, sからの道のり)をsからの道のりが小さい順に格納
		Comparator<int[]> comp = (x, y) -> x[1] - y[1];
		PriorityQueue<int[]> nodeQue = new PriorityQueue<int[]>(comp);
		PriorityQueue<int[]> nodeQue2 = new PriorityQueue<int[]>(comp);
		nodeQue.add(new int[] { s, 0 });
		nodeQue2.add(new int[] { t, 0 });

		for (int i = 0; i < m; i++) {
			int u = fs.nextInt() - 1;
			int v = fs.nextInt() - 1;
			int a = fs.nextInt();
			int b = fs.nextInt();

			rinsetuList[u].add(new int[] { v, a });
			rinsetuList[v].add(new int[] { u, a });
			rinsetuList2[u].add(new int[] { v, b });
			rinsetuList2[v].add(new int[] { u, b });

			if (u == s) {
				nodeQue.add(new int[] { v, a });
			}
			if (v == s) {
				nodeQue.add(new int[] { u, a });
			}
			if (u == s) {
				nodeQue2.add(new int[] { v, b });
			}
			if (v == s) {
				nodeQue2.add(new int[] { u, b });
			}
		}

		ShortestPath res = MyDijkstra(s, n, rinsetuList, nodeQue);
		ShortestPath res2 = MyDijkstra(t, n, rinsetuList2, nodeQue2);

		int[] output = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i = n - 1;i >= 0; i--) {
			if(res.dist[i] + res2.dist[i] < min) {
				min = res.dist[i] + res2.dist[i];
			}else {
			}
			output[i] = min;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(1000000000000000L - output[i]);
		}

	}

	private static ShortestPath MyDijkstra(int startIndex, int nodeN, ArrayList<int[]>[] rinsetuList,
			PriorityQueue<int[]> nodeQue) {
		//スタートノードからの道のり
		int[] d = new int[nodeN];
		for (int i = 0; i < nodeN; i++) {
			d[i] = i == startIndex ? 0 : 1000000001;
		}
		//直前に通るべきノード
		int[] prev = new int[nodeN];

		while (!nodeQue.isEmpty()) {
			//最も近いノード
			int[] nearestNode = nodeQue.poll();

			for (int[] node : rinsetuList[nearestNode[0]]) {
				int dist = d[nearestNode[0]] + node[1];
				if (d[node[0]] > dist) {
					d[node[0]] = dist;
					prev[node[0]] = nearestNode[0];
					nodeQue.add(new int[] { node[0], dist });
				}
			}
		}

		ArrayList<Integer> path = new ArrayList<Integer>();
		int goalIndex = 0;
		int i = goalIndex;
		while(true) {
			path.add(i);
			if(i == startIndex) break;
			i = prev[i];
		}
		Collections.reverse(path);

		return new ShortestPath(d, path);

	}
}

class ShortestPath {
	int[] dist;
	ArrayList<Integer> path;

	public ShortestPath(int[] dist, ArrayList<Integer> path) {
		this.dist = dist;
		this.path = path;
	}
}

class FastScanner {
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
public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
  long nl = nextLong();
  if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
  return (int) nl;
}
public double nextDouble() { return Double.parseDouble(next());}
}