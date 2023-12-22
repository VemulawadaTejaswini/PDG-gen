import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int W, H, res;
	static char [][]field;
	static int[]dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
	public static void main(String[] args) {
		while(read()){
			search_Start();
			System.out.println(res);
		}
	}
	static boolean read(){
		W = sc.nextInt(); H = sc.nextInt();
		if(W == 0 && H == 0)
			return false;
		
		field = new char[H][W];
		res = 0;
		
		String line;
		for(int i = 0; i < H; i++){
			line = sc.next();
			for(int j = 0; j < W; j++)
				field[i][j] = line.charAt(j);
		}
		return true;
	}
	static void search_Start(){
		/**
		 * ツづ慊つクツづ債スツタツーツトツ地ツ点ツづーツ探ツつキツ。
		 */
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				/**
				 * ツ個ゥツづつつッツつスツづァツ探ツ催オツ開ツ始
				 */
				if(field[i][j] == '@')
					dfs(j, i);
			}
		}
	}
	static void dfs(int x, int y){
		field[y][x] = '#';
		res++;
		int mx = 0, my = 0;
		for(int i = 0; i < 4; i++){
			mx = x + dx[i]; my = y + dy[i];
			if( 0 <= mx && mx < W && 0 <= my && my < H && field[my][mx] == '.')
				dfs(mx, my);
		}
	}

}