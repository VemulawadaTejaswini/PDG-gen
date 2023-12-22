import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();

			if(w == 0 && h == 0){
				break;
			}

			char matrix[][] = new char[h][w];

			for(int i = 0; i < h; i++){
				String input = sc.next();
				for(int j = 0; j < w; j++){
					matrix[i][j] = input.charAt(j);
				}
			}

//			showMatrix(matrix);
			solve(matrix);
		}
	}

	static void solve(char[][] matrix){
		int h = matrix.length;
		int w = matrix[0].length;

		int[][] resultB = new int[h][w];
		int[][] resultW = new int[h][w];

		int black = 0;
		int white = 0;

		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
//				if(matrix[i][j] != '.'){
//					continue;
//				}
				if(matrix[i][j] == 'B'){
					isExNeighbor(matrix, resultB, j, i, 'B');
				}
				if(matrix[i][j] == 'W'){
					isExNeighbor(matrix, resultW, j, i, 'W');
				}
			}
		}

		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(resultB[i][j] == TRUE && resultW[i][j] != TRUE){
					black++;
				}
				else if(resultW[i][j] == TRUE && resultB[i][j] != TRUE){
					white++;
				}
			}
		}


		//debug
//		showMatrix(resultB);
//		showMatrix(resultW);

		System.out.println(black+" "+white);
	}

	static void showMatrix(char[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length ; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

	}

	static void showMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length ; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

	}

	static final int TRUE = 2;
	static final int FALSE = 1;
	static final int NOT_VISITED = 0;
	static final int JUDGE = 4;
	static final int DC = 5;
	static void isExNeighbor(char[][] map, int[][] result, int x, int y, char type){
//		System.out.println("x = "+x+" y = "+y);
		int w = map[0].length;
		int h = map.length;

		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};

//		result[y][x] = JUDGE;
		if(map[y][x] == type){
			result[y][x] = DC;
		}
		else {
			result[y][x] = TRUE;
		}

		for(int i = 0; i < 4; i++){
			int tmpX = x + dx[i];
			int tmpY = y + dy[i];

			if(!inRange(tmpX, tmpY, h, w)){
				continue;
			}

			if(map[tmpY][tmpX] == '.' && result[tmpY][tmpX] == NOT_VISITED){
				isExNeighbor(map, result, tmpX, tmpY, type);
			}
		}
	}

	static boolean inRange(int x, int y, int h, int w){
		if(x >= 0 && x < w && y >= 0 && y < h){
			return true;
		}
		else {
			return false;
		}
	}

}

