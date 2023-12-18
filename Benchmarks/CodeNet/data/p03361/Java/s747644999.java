import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int h = sc.nextInt();// 縦のマス数
		int w = sc.nextInt();// 横のマス数

		String[][] grid = new String[h][w];

		for(int i = 0; i < h; i++){
			String temp = sc.next();
			grid[i] = temp.split("");
		}

		// 判定
		String result = "Yes";
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(!hasNeighbor(grid, i, j)){
					result = "No";
					break;
				}
			}
		}

		// 出力
		System.out.println(result);
	}

	// 自分が","、または、自分が"#"かつ隣に"#"がいるか
	static boolean hasNeighbor(String[][] grid, int x, int y){
		
		// 宣言
		int h = grid.length;    // 縦のサイズ
		int w = grid[0].length; // 横のサイズ
		//System.out.println("h:" + h + " w:" + w);

		String up = null;   // 上
		String down = null; // 下
		String left = null; // 左
		String right = null;// 右
		String lu = null;   // 左上
		String ru = null;   // 右上
		String ld = null;   // 左下
		String rd = null;   // 右下

		if(x > 0)     up = grid[x - 1][y]; // 上
		if(x < h - 1) down = grid[x + 1][y]; // 下
		if(y > 0)     left = grid[x][y - 1]; // 左
		if(y < w - 1) right = grid[x][y + 1]; // 右
		//if(x > 0 && y > 0)         lu = grid[x - 1][y - 1]; // 左上
		//if(x > 0 && y < w - 1)     ru = grid[x - 1][y + 1]; // 右上
		//if(x < h - 1 && y > 0)     ld = grid[x + 1][y - 1]; // 左下
		//if(x < h - 1 && y < w - 1) rd = grid[x + 1][y + 1]; // 右下
		
		// 判定
		if(grid[x][y].equals(".")) return true;
		if(up != null && up.equals("#")) return true;
		if(down != null && down.equals("#")) return true;
		if(left != null && left.equals("#")) return true;
		if(right != null && right.equals("#")) return true;

		return false;
	}

}


