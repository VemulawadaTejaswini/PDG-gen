import java.util.*;

public class Main{
	static int[][] board;
	static int w, h;
	static int sx, sy;
	static int inf = 1000000000;
	private static int dfs(int x, int y, int bx, int by, int count){// (x, y)?????????G?????§???????°??????¢?????????(???????????°inf)
		int[] res  = new int[4];
		if(count > 10) return inf;
		for(int i = 0; i < 4; i++) res[i] = inf;
		board[bx][by] = 0; // ??????????????????
		if(x > 0 && board[x-1][y] != 1){// x?????????
			for(int i = 1; x-i >= 0; i++){
				if(board[x-i][y] == 1){
					res[0] = dfs(x-i+1, y, x-i, y, count+1);
					break;
				}else if (board[x-i][y] == 3) {
					board[bx][by] = 1; // ????????????
					return 1;
				}
			}
			if(res[0] != inf) res[0]++;
		}
		if(y > 0 && board[x][y-1] != 1){// y?????????
			for(int i = 1; y-i >= 0; i++){
				if(board[x][y-i] == 1){
					res[1] = dfs(x, y-i+1, x, y-i, count+1);
					break;
				}else if (board[x][y-i] == 3) {
					board[bx][by] = 1; // ????????????
					return 1;
				}
			}
			if(res[1] != inf) res[1]++;
		}
		if(x+1 < w && board[x+1][y] != 1){// x??£??????
			for(int i = 1; x+i < w; i++){
				if(board[x+i][y] == 1){
					res[2] = dfs(x+i-1, y, x+i, y, count+1);
					break;
				}else if (board[x+i][y] == 3) {
					board[bx][by] = 1; // ????????????
					return 1;
				}
			}
			if(res[2] != inf) res[2]++;
		}
		if(y+1 < h && board[x][y+1] != 1){// y??£??????
			for(int i = 1; y+i < h; i++){
				if(board[x][y+i] == 1){
					res[3] = dfs(x, y+i-1, x, y+i, count+1);
					break;
				}else if (board[x][y+i] == 3) {
					board[bx][by] = 1; // ????????????
					return 1;
				}
			}
			if(res[3] != inf) res[3]++;
		}
		board[bx][by] = 1; // ????????????
		Arrays.sort(res);
		return res[0];
	}
	private static void solve(){
		int res = dfs(sx, sy, sx, sy, 0);
		if(res != inf && res <= 10) System.out.println(res);
		else System.out.println(-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) break;
			board = new int[w][h];
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					board[j][i] = sc.nextInt();
					if(board[j][i] == 2){
						sx = j;
						sy = i;
					}
				}
			}
			solve();
		}
	}
}