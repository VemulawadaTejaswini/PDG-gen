import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static char[][] matrix;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int h = Integer.parseInt(tmpArray[0]);
			int w = Integer.parseInt(tmpArray[1]);

			if(w == 0 && h == 0){
				break;
			}

			matrix = new char[h][w];
			visited = new boolean[h][w];
			
			for(int i = 0; i < h; i++){
				Arrays.fill(matrix[i], '\0');
				Arrays.fill(visited[i], false);
			}

//			int x = 0;
//			int y = 0;
			for(int i = 0; i < h; i++){
				String tmpStr = br.readLine();
				for(int j = 0; j < w; j++){
					matrix[i][j] = tmpStr.charAt(j);
				}
			}
//			System.out.println("Start from "+x+" "+y);

			int areas = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(!visited[i][j]){
						dfs(j, i, matrix[i][j], 0);
						areas++;
					}
					else {
						dfs(j, i, matrix[i][j], 0);
					}
				}
			}
			
			System.out.println(areas);
		}
	}

//	static int depth = 0;
	static void dfs(int x, int y, char type, int depth){
		int h = matrix.length;
		int w = matrix[0].length;
		
		if(depth >= 100){
			return;
		}
		
		visited[y][x] = true;
		
		depth++;
		
		//System.out.println("x , y "+ x+ " "+ y+" "+type+" depth "+(depth));
		
		//???
		if(x > 1 && matrix[y][x - 1] == type && !visited[y][x - 1]){
			dfs(x - 1, y, type, depth);
		}
		
		//???
		if(y < h - 1 && matrix[y + 1][x] == type && !visited[y + 1][x]){
			dfs(x, y + 1, type, depth);
		}
		
		//???
		if(x < w - 1 && matrix[y][x + 1] == type && !visited[y][x + 1]){
			dfs(x + 1, y, type, depth);
		}
		
		//???
		if(y > 1 && matrix[y - 1][x] == type && !visited[y - 1][x]){
			dfs(x, y - 1, type, depth);
		}
		
	}


}