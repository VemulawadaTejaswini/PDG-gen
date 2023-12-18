import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int mod = (int)1e9 + 7;
	static int h, w;
	static char[][] grid;
	static int[][] memo;
	
	public static int dp(int i, int j) {
		if(!isValid(i, j))
			return 0;
		if(i == h - 1 && j == w - 1)
			return 1;
		
		if(memo[i][j] != -1)
			return memo[i][j];
		
		return memo[i][j] = ((dp(i + 1, j) % mod) + (dp(i, j + 1) % mod)) % mod;
	}
	
	public static boolean isValid(int i, int j) {
		return i < h && j < w && grid[i][j] == '.';
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		
		grid = new char[h][w];
		for(int i = 0; i < h; i++) {
			String s = br.readLine();
			for(int j = 0; j < w; j++)
				grid[i][j] = s.charAt(j);
		}
		
		memo = new int[h][w];
		for(int i = 0; i < h; i++)
			Arrays.fill(memo[i], -1);
		
		System.out.println(dp(0, 0));
	}
}
