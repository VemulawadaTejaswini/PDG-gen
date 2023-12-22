import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int RED = 1;
	static final int BLACK = 2;
	static final int VISITED = 3;

	static final int UP = 1;
	static final int DOWN = 2;
	static final int RIGHT = 3;
	static final int LEFT = 4;
	static final int START = 0;

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String tmp = br.readLine();
			/*
			if(tmp == null){
				break;
			}*/

			String[] tmpArray = tmp.split(" ");

			int width = Integer.parseInt(tmpArray[0]);
			int height = Integer.parseInt(tmpArray[1]);

			if(width == 0 && height == 0){
				break;
			}
			int[][] tiles = new int[height][width];

			int currentX = 0;
			int currentY = 0;

			for(int i = 0; i < height; i++){
				String tmpStr = br.readLine();
				for(int j = 0; j < width ; j++){
					char tmpChar = tmpStr.charAt(j);
					if(tmpChar == '.' || tmpChar == '@'){
						tiles[i][j] = BLACK;
					}
					else {
						tiles[i][j] = RED;
					}

					if(tmpChar == '@'){
						currentX = j;
						currentY = i;
					}
				}
			}

			System.out.println(visit(tiles, currentX, currentY, START));
		}
	}

	static int visit(int[][] tiles, int curX, int curY, int dest){
		int result = 1;
		
		if(!available(tiles, curX, curY)){
			return 0;
		}
		tiles[curY][curX] = VISITED;
		
		result += visit(tiles, curX-1, curY, dest);
		result += visit(tiles, curX+1, curY, dest);
		result += visit(tiles, curX, curY-1, dest);
		result += visit(tiles, curX, curY+1, dest);
		
		return result;
	}

	private static boolean available(int[][] tiles, int curX, int curY) {
		// TODO ?????????????????????????????????????????????
		if(curX < 0 || curX >= tiles[0].length || curY < 0 || curY >= tiles.length || tiles[curY][curX] == RED || tiles[curY][curX] == VISITED){
			return false;
		}
		else{
			return true;
		}
	}

}