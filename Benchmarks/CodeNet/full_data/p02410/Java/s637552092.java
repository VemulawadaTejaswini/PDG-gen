import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] tmp = parceIntArray(br.readLine().split(" "));
		int n = tmp[0];
		int m = tmp[1];
		tmp = null;
		int[][] matrix = new int[n][m];
		int[][] vector = new int[m][1];
		for(int i = 0;i < n;i++){
			matrix[i] = parceIntArray(br.readLine().split(" "));
		}
		for(int i = 0;i < m;i++){
			vector[i][0] = Integer.parseInt(br.readLine());
		}
		for(int i = 0;i < n;i++){
			int sum = 0;
			for(int j = 0;j < m;j++){
				sum += matrix[i][j] * vector[j][0];
			}
			System.out.println(sum);
		}
	}
	
	static int[] parceIntArray(String[] strArr)throws NumberFormatException{
		int [] arr = new int[strArr.length];
		for(int i = 0;i < arr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		return arr;
	}
}