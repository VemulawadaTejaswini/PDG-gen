import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int sx = sc.nextInt()-1;
		int sy = sc.nextInt()-1;
		int gx = sc.nextInt()-1;
		int gy = sc.nextInt()-1;
		
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    grid[i] = s.toCharArray();
		}
		
		// 計算
		long result = Long.MAX_VALUE;
		int[] dx = {0, -1, 1, 0}; // 4
		int[] dy = {-1, 0, 0, 1}; // 4
		long[] dist = new long[h*w*4];
		long INF = 1001001001001001001L;
		Arrays.fill(dist, INF);
		PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>((s, t) -> Long.compare(s.dist, t.dist));
		for(int i = 0; i < 4; i++){
		    pq.add(new Vertex((sx*w+sy)*4 + i, 0));
		    dist[(sx*w+sy)*4 + i] = 0;
		}
		while(!pq.isEmpty()){
		    Vertex v = pq.poll();
		    int i = v.id/4/w;
		    int j = v.id/4%w;
		    int d = v.id%4;
		    if(v.dist != dist[v.id]) continue;
		    //System.out.println("i:" + i + " j:" + j + " d:" + d + " dist:" + v.dist);
		    for(int p = 0; p < 4; p++){
		        int nid = (i*w+j)*4 + p;
		        if(dist[nid] > (v.dist+(k-1))/k*k){
		            pq.add(new Vertex(nid, (v.dist+(k-1))/k*k));
		            dist[nid] = (v.dist+(k-1))/k*k;
		        }
		    }
		    int ni = i + dx[d];
		    int nj = j + dy[d];
		    if(0 <= ni && ni < h && 0 <= nj && nj < w){
		        if(grid[ni][nj] == '.'){
		            int nid = (ni*w+nj)*4 + d;
		            if(dist[nid] > v.dist+1){
		                pq.add(new Vertex(nid, v.dist+1));
		                dist[nid] = v.dist+1;
		            }
		        }
		    }
		}
		for(int i = 0; i < 4; i++){
		    result = min(result, dist[(gx*w+gy)*4 + i]);
		}
		if(result == INF){
		    result = -1;
		}else{
		    result = (result+(k-1))/k;
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}

class Vertex {
	int id;
	long dist;
	
	Vertex(int id, long dist) {
		this.id = id;
		this.dist = dist;
	}

	public String toString() {
		return "id:" + id + " dist:" + dist;
	}
}

