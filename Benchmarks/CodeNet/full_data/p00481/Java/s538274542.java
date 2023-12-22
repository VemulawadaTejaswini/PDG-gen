import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	final int INF = 1000000000;
	int h, w, n;
	int ans;
	char[][] board;
	class Pair {
		int h, w;
		Pair(int h, int w){
			this.h = h;
			this.w = w;
		}
		@Override
		public String toString(){
			return "(" + h + ", " + w + ")";
		}
	}
	public Pair bfs(int n, Pair p){
		int[][] min = new int[h][w];
		for(int i = 0; i < h; i++){
			Arrays.fill(min[i], INF);
		}
		int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		min[p.h][p.w] = 0;
		Queue<Pair> queue = new ArrayDeque<Pair>();
		queue.add(p);
		while(true){
			Pair pos = queue.poll();
			for(int i = 0; i < d.length; i++){
				int x = pos.w + d[i][1];
				int y = pos.h + d[i][0];
				if( x < 0 || x >= w || y < 0 || y >= h ){
					continue;
				}
				if( board[y][x] == 'X' || min[y][x] != INF ){
					continue;
				}
				min[y][x] = min[pos.h][pos.w]+1;
				if( board[y][x] == ('0' + n) ){
					ans += min[y][x];
					return new Pair(y, x);
				}
				queue.add(new Pair(y, x));
			}
		}
	}
	public int minPath(){
		Pair start = null;
	out:
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if( board[i][j] == 'S' ){
					start = new Pair(i, j);
					break out;
				}
			}
		}
		ans = 0;
		for(int i = 1; i <= n; i++){
			start = bfs(i, start);
		}
		return ans;
	}
	public void solve() throws IOException {
		h = nextInt();
		w = nextInt();
		n = nextInt();
		board = new char[h][w];
		for(int i = 0; i < h; i++){
			board[i] = nextToken().toCharArray();			
		}
		writer.println(minPath());
	}
	public static void main(String[] args){
		new Main().run();
	}
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() {
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public String nextToken() throws IOException {
		if( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}