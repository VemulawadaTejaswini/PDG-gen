import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int appart[][][] = new int[4][3][10];
		
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 3; j++)
				for(int k = 0; k < 10; k++)
					appart[i][j][k] = 0;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			
			appart[b-1][f-1][r-1] += v;
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(appart[i][j][k] + " ");
				}
				System.out.println("");
			}
			System.out.println("####################");
		}
	}
}