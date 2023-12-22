import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		int[][] days = new int[n][31];
		int[][][] memo = new int[n][31][n];
		
		for(int i = 0; i < n; i++){
			memo[i][0][i] = 1;
		}
		
		for(int i = 0; i < n; i++){
			int f = sc.nextInt();
			for(int j = 0; j < f; j++){
				int d = sc.nextInt();
				days[i][d] = 1;
			}
		}
		
		int ans = -1;
		for(int d = 1; d < 31; d++){
			for(int i = 0; i < n; i++){
				int sum = 0;
				for(int j = 0; j < n; j++){
					if(memo[i][d-1][j] == 1) {
						memo[i][d][j] = 1;
						sum++;
					}
					else if(days[i][d] == 1 && days[j][d] == 1){
						for(int k = 0; k < n; k++){
							if(memo[j][d-1][k] == 1 & memo[i][d][k] != 1){
								memo[i][d][k] = 1;
								sum++;
							}
						}
					}
				}
				if(sum == n){
					ans = d;
					break;
				}
			}
			if(ans != -1) break;
		}
		
		System.out.println(ans);
		
		
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}