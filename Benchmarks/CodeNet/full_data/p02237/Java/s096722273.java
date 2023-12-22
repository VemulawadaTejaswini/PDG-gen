import java.io.IOException;
import java.util.Scanner;
class Main {
  	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] adj_m = new int[100][100];
		int n = scan.nextInt();
		int u, v, k;
		
		for(int i = 0; i < n; i++){
			u = scan.nextInt();
			k = scan.nextInt();
			
			for(int j = 0; j < k; j++){
				v = scan.nextInt();
				adj_m[u - 1][v - 1] = 1;
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(j != n - 1){
					System.out.print(adj_m[i][j] + " ");
				}else{
					System.out.println(adj_m[i][j]);
				}
			}
		}
		
		return;
	}
}