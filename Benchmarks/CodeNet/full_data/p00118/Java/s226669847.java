import java.util.Scanner;
public class Main {
	boolean[][] board; //見たか見てないかチェックする盤
	String[] map;      //今回は、文字の種類が３つあるので、逐次比較するためのクラス変数
	int[] fdx = new int[]{1, -1, 0, 0};
	int[] fdy = new int[]{0, 0, -1, 1};

	void dfs(int x, int y, char chr) {
		//範囲外はダメ
		if(x < 0 || y < 0 || x >= board[0].length || y >= board.length) return;
		//既に見た事があったり、違う文字だったらダメ
		if(board[y][x] || map[y].charAt(x) != chr) return;
		board[y][x] = true; //訪れた事を記録
		for(int r = 0; r < fdx.length; r++) {
			dfs(x + fdx[r], y + fdy[r], chr); //次へ進む
		}
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		int count = 0;
		while(stdIn.hasNext()) {
			int h = stdIn.nextInt(); 
			int w = stdIn.nextInt();
			if(h + w == 0) break;
			board = new boolean[h][w];
			map = new String[h];

			for(int r = 0; r < h; r++) {
				map[r] = stdIn.next();
			}
			while(true) {
				boolean flag = false;//見つかったか見つかっていないか
				for(int  r = 0; r < h; r++) {
					for(int c = 0; c < w; c++) {
						if(!board[r][c]) {
							flag = true; //見つかった
							dfs(c, r, map[r].charAt(c));
							count++;
						}
						if(flag) break; //既に見つかったなら、一旦リセット
					}
					if(flag) break; //既に見つかったなら、一旦リセット
				}
				if(!flag) break; //もう見つける事ができないなら、探索終了
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}