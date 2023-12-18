

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int matrix[][] = new int[n + 1][n + 1];

		for(int i = 0; i <= n; i++){
			Arrays.fill(matrix[i], 1);
		}

		for(int i = 0; i < (n + 1) / 2; i++){
			if(n % 2 == 1){
				matrix[i + 1][n - i - 1] = 0;
			}
			else{
				matrix[i + 1][n - i] = 0;
			}
		}

		for(int i = 1; i <= n; i++){
			for(int j = i + 1; j <= n; j++){
				if(matrix[i][j] != 0){
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
