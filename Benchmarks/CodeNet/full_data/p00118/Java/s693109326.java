import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

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

			char[][] matrix = new char[h][w];
			boolean[][] visited = new boolean[h][w];
			
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
						dfs(j, i, matrix, visited, matrix[i][j]);
						areas++;
					}
				}
			}
			
			System.out.println(areas);
		}
	}

	static void dfs(int x, int y, char[][] matrix, boolean[][] visited, char type){
		int h = matrix.length;
		int w = matrix[0].length;
		
		visited[y][x] = true;
		
		//System.out.println("x , y "+ x+ " "+ y+" "+type);
		
		//???
		if(x > 1 && matrix[y][x - 1] == type && !visited[y][x - 1]){
			dfs(x - 1, y, matrix, visited, type);
		}
		
		//???
		if(y < h - 1 && matrix[y + 1][x] == type && !visited[y + 1][x]){
			dfs(x, y + 1, matrix, visited, type);
		}
		
		//???
		if(x < w - 1 && matrix[y][x + 1] == type && !visited[y][x + 1]){
			dfs(x + 1, y, matrix, visited, type);
		}
		
		//???
		if(y > 1 && matrix[y - 1][x] == type && !visited[y - 1][x]){
			dfs(x, y - 1, matrix, visited, type);
		}
		
	}


}