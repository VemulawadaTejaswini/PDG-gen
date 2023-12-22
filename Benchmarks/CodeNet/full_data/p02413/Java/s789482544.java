import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int r = Integer.parseInt(tmpArray[0]);
		int c = Integer.parseInt(tmpArray[1]);
		
		int[][] result = new int[r+1][c+1];
		
		for(int i = 0; i < r ; i++){
			tmpArray = br.readLine().split(" ");
			for(int j = 0; j < c ; j++){
				result[i][j] = Integer.parseInt(tmpArray[j]);
				result[i][c] += result[i][j];
				result[r][c] += result[i][j];
				result[r][j] += result[i][j];
			}
		}
		
		
		for(int i = 0; i <= r ; i++){
			for(int j = 0; j <= c ; j++){
				if(j != 0){
					System.out.print(" ");
				}
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}