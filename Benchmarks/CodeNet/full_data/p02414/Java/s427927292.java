import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int l = Integer.parseInt(str[2]);

		int[][] A = new int[n][m];
		int[][] B = new int[m][l];

		for(int i = 0; i < n; i++){
			str = br.readLine().split(" ");
			for(int j = 0; j < m; j++){
				A[i][j]= Integer.parseInt(str[j]);
			}
		}
		for(int i = 0; i < m; i++){
			str = br.readLine().split(" ");
			for(int j = 0; j < l; j++){
				B[i][j]= Integer.parseInt(str[j]);
			}
		}
		long c = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < l; j++){
				c = 0;
				for(int k = 0; k < m; k++){
					c += A[i][k] * B[k][j];
				}
				if(j == (l - 1)){
					System.out.print(c);
				}else{
					System.out.print(c + " ");
				}
			}
			System.out.println();
		}
	}
}