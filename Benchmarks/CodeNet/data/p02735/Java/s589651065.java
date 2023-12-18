import java.util.Arrays;
import java.util.Scanner;

class Main {
	// フィールドのサイズ
	static int H;
	static int W;
	
	// マス移動
	static int[] dh = {0, 1};
	static int[] dw = {1, 0};
	
	// そのマスに到達するまでの最小「白⇒黒」回数
	static int[][] numChange;
	
	static void dfs(char[][] field, int h, int w, int change) {
		if (field[h][w] == '#')
			change++;
		
		if (numChange[h][w] != -1 && change >= numChange[h][w])
			return;
		
		for (int i = 0; i < 2; i++) {
			int nh = h + dh[i];
			int nw = w + dw[i];
			
			if (H <= nh || W <= nw)
				continue;
			
			dfs(field, h, w, nh, nw, change);
		}
	}
	
	static void dfs(char[][] field, int ph, int pw, int h, int w, int change) {
		if (field[ph][pw] == '.' && field[h][w] == '#')
			change++;
		
		numChange[h][w] = change;
		
		// printField(numChange);
		
		for (int i = 0; i < 2; i++) {
			int nh = h + dh[i];
			int nw = w + dw[i];
			
			if (H <= nh || W <= nw)
				continue;
			
			dfs(field, h, w, nh, nw, change);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		
		numChange = new int[H][W];
		for (int i = 0; i < H; i++)
			Arrays.fill(numChange[i], -1);
		
		// printField(numBlack);
		
		char[][] field = new char[H][];
		for (int i = 0; i < H; i++) {
			field[i] = sc.next().toCharArray();
		}
		
		// printField(field);
		
		// 探索
		dfs(field, 0, 0, 0);
		
		// 結果
		int ans = numChange[H - 1][W - 1];
		
		System.out.println(ans);
		
		sc.close();
	}
	
	static void printField(char[][] f) {
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
	}
	
	static void printField(int[][] f) {
		System.out.println();
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
	}
}
