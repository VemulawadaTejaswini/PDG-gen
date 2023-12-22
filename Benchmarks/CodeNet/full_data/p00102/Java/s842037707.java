import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[][]matrix;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		matrix = new int[n+1][n+1];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	static void solve(){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][n] = matrix[i][n] + matrix[i][j];
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[n][i] = matrix[n][i] + matrix[j][i];
			}
		}
		for(int k = 0; k < n; k++){
			matrix[n][n] += matrix[n][k];
		}
		for(int i = 0; i < n+1; i++){
			for(int j = 0; j < n+1; j++){
				System.out.printf("%5d",matrix[i][j]);
			}
			System.out.println();
		}
	}
}