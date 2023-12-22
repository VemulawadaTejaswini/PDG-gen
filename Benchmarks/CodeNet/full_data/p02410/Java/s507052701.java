import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arrayA = new int[n][m];
		int[] arrayB = new int[m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				arrayA[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i< m; i++){
			arrayB[i] = scan.nextInt();
		}
		int intCount = 0;
		for(int i = 0; i < n; i++){
			intCount = 0;
			for(int j = 0; j < m; j++){
				intCount += arrayA[i][j] * arrayB[j];
			}
			System.out.println(intCount);
		}
		scan.close();
	}
}