import java.util.*;
public class Main {
	String[] tile;
	boolean[][] board;
	String error;
	int nowx = 0, nowy = 0;

	void dfs() {
		if(nowx < 0 || nowx >= tile[0].length() || nowy < 0 || nowy >= tile.length || tile[nowy].charAt(nowx) == '.' || error != null) return;
		switch(tile[nowy].charAt(nowx)) {
		case '>':nowx++;break;
		case '<':nowx--;break;
		case 'v':nowy++;break;
		case '^':nowy--;break;
		case '.':return;
		}
		if(board[nowy][nowx]) {
			error = "LOOP"; //既に訪れたら、ループ状態に突入してしまう。
			return;
		}
		board[nowy][nowx] = true; //調査済み
		dfs();
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int height = stdIn.nextInt();
			int width = stdIn.nextInt();
			if(width + height == 0) break;
			tile = new String[height];
			board = new boolean[height][width];
			error = null;
			nowx = nowy = 0;
			
			for(int r =0; r < tile.length; r++) {
				tile[r] = stdIn.next();
			}
			board[0][0] = true;
			dfs();

			System.out.println(((error == null) ? (nowx + " " + nowy) : error));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}