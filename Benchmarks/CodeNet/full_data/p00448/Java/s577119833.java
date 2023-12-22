import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int r = Integer.parseInt(tmpArray[0]);
			int c = Integer.parseInt(tmpArray[1]);
			
			if(r == 0 && c== 0){
				break;
			}
			int[][] matrix = new int[r][c];
			
			for(int i = 0; i < r; i++){
				tmpArray = br.readLine().split(" ");
				for(int j = 0; j < c; j++){
					matrix[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}
			
			PermGenerator pg = new PermGenerator(r);
			
			int[][] command = pg.getResult();
			
			int maxAvailable = 0;
			for(int i = 0; i < command.length ; i++){
				reverseOsenbei(matrix, command[i]);
				int available = 0;
				for(int j = 0; j < c ; j++){
					int black = 0;
					for(int k = 0; k < r ; k++){
						if(matrix[k][j] == 1){
							black++;
						}
					}
					available += Math.max(black, r - black);
				}
				if(maxAvailable < available){
					maxAvailable = available;
				}
			}
			
			System.out.println(maxAvailable);
		}
	}
	
	static void reverseOsenbei(int[][] matrix, int[] command){
		for(int i = 0; i < matrix.length ; i++){
			if(command[i] == 1){
				for(int j = 0; j < matrix[0].length ; j++){
					matrix[i][j] = (matrix[i][j] + 1)%2;
				}
			}
		}
	}

}

class PermGenerator {
	private int[][] result;
	
	public PermGenerator(int n){
		result = new int[(int)Math.pow(2, n)][n];
		
		permutation(n);
	}
	
	private void permutation(int n){
		int limit = (int)Math.pow(2, n);
		
		for(int i = 0; i < limit ; i++){
			int x = i;
			for(int j = 0; j < n; j++){
				result[i][n - j - 1] = x%2;
				x /= 2;
			}
		}
	}
	
	public void print(){
		for(int i = 0; i < result.length ; i++){
			for(int j = 0; j < result[0].length ; j++){
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] getResult(){
		return result;
	}
	
}