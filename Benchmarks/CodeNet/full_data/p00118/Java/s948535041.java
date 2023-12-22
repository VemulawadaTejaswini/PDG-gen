import java.io.*;
import java.util.*;

public class Main {
	char[][] map;
	int height;
	int width;
	public void dfs(boolean[][] used, int h, int w){
		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				if( i*j != 0 || (i==0 && j==0) ){
					continue;
				}
				int x = w+j;
				int y = h+i;
				if( x < 0 || x >= width || y < 0 || y >= height ){
					continue;
				}
				if( used[y][x] || (map[h][w] != map[y][x]) ){
					continue;
				}
				used[y][x] = true;
				dfs(used, y, x);
			}
		}
	}
	public void solve() throws IOException {
		height = nextInt();
		width = nextInt();
		while( height != 0 || width != 0 ){
			map = new char[height][width];
			for(int i = 0; i < height; i++){
				map[i] = nextToken().toCharArray();
			}
			boolean[][] used = new boolean[height][width];
			int ans = 0;
			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					if( !used[i][j] ){
						ans++;
						dfs(used, i, j);
					}
				}
			}
			writer.println(ans);
			height = nextInt(); width = nextInt();
		}
		writer.flush();
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