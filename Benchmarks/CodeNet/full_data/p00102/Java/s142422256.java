
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixLikeComputation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0){return;}
			int[][] array = new int[n][n];
			for(int i = 0;i<n;i++){
				String[] a = br.readLine().split(" ");
				for(int j = 0;j < n;j++){
					array[i][j]=Integer.parseInt(a[j]);
				}
			}
			int[][] result = makeNewArray(array);
			printArray(result);
			
		}
	}
	public static void printArray(int[][] array){
		for(int i=0;i<array.length;i++){
			for(int j = 0 ; j < array[0].length;j++){
				System.out.print(String.format("%1$5d", array[i][j]));
			}
			System.out.println("");
		}
	}
	
	public static int[][] makeNewArray(int[][] array){
		int[][] result =new int[array.length+1][array[0].length+1];
		for(int i = 0;i<array.length;i++){
			int sum = 0;
			for(int j = 0;j<array[0].length+1;j++){
				if(j < array[0].length){
					sum += array[i][j];
					result[i][j] = array[i][j];
				}else{
					result[i][j] = sum;
				}
			}
		}
		for(int j = 0;j < result[0].length;j++){
			int sum = 0;
			for(int i = 0; i < result.length;i++){
				if(i < result.length-1){
					sum+= result[i][j];
				}else{
					result[i][j] = sum;
				}
			}
		}
		return result;
	}

}