import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while((n = sc.nextInt()) != 0){

			int[][] list = new int[n + 1][n + 1];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					list[i][j] = sc.nextInt();
					list[i][n] += list[i][j];
		}
				list[n][n] += list[i][n];
				
				for(int j = 0; j < n; j++)
					list[n][j] += list[i][j];
		}
			for(int i = 0; i < n + 1; i++){
				for(int j = 0; j < n + 1; j++)
					System.out.printf("%5d", list[i][j]);
				
				System.out.println();
			}
		}
	}
}