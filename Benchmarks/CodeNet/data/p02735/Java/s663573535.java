import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	// フィールドのサイズ
	static int H;
	static int W;
	
	// マス移動
	static int[] dh = {0, 1};
	static int[] dw = {1, 0};
	
	// 経路上の黒マス個数
	static List<Integer> numBlack = new ArrayList<>();
	
	static void dfs(char[][] field, int h, int w, int b) {
		if (field[h][w] == '#')
			b++;
		
		if (h == H - 1 && w == W - 1)
			numBlack.add(b);
		
		for (int i = 0; i < 2; i++) {
			int nh = h + dh[i];
			int nw = w + dw[i];
			
			if (H <= nh || W <= nw)
				continue;
			
			dfs(field, nh, nw, b);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		
		char[][] field = new char[H][];
		for (int i = 0; i < H; i++) {
			field[i] = sc.next().toCharArray();
		}
		
		// printField(field);
		
		// 探索
		dfs(field, 0, 0, 0);
		
		// 結果
		Collections.sort(numBlack);
		int ans = numBlack.get(0);
		
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
}
