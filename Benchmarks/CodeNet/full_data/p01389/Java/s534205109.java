import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");
		
		int h = Integer.parseInt(tmpArray[0]);
		int w = Integer.parseInt(tmpArray[1]);
		
		int map[][] = new int[h + 1][w + 1];
		
		//初期化
		for(int i = 0; i < map.length ; i++){
			Arrays.fill(map[i], Integer.MAX_VALUE);
		}
		map[0][1] = 0;
		
		for(int i = 0; i < h; i++){
			String str = br.readLine();
			for(int j = 0; j < w; j++){
				map[i + 1][j + 1] = str.charAt(j) - '0';
			}
		}
		
		for(int i = 1; i <= h; i++){
			for(int j = 1; j <= w; j++){
				map[i][j] += Math.min(map[i - 1][j], map[i][j - 1]);
				
				//debug
//				for(int i = 1; i < h; i++){
//					for(int j = 1; j < w; j++){
//						
//					}
//				}
			}
		}
		
		System.out.println(map[h][w]);
	}

}

