
import java.util.*;
public class Main {
	int INF = 1 << 24;

	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [][] pass = new int[n][n];
			for(int i = 0; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			int [] size = new int[n];
			
			for(int i = 0; i < n-1; i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				int cost = sc.nextInt();
				pass[a][b] = cost;
				pass[b][a] = cost;
				size[a]++; size[b]++;
			}
			
			for(int i = 0; i < n; i++){
				if(i != 0 && size[i] == 1){
					for(int j = 0; j < n; j++){
						if(pass[i][j] != INF){
							pass[i][j] = INF;
							pass[j][i] = INF;
						}
					}
				}
			}
			
			int sum = 0;
			for(int i = 0; i < n; i++){
				for(int j = i+1; j < n; j++){
					if(pass[i][j] != INF){
						sum+= pass[i][j];
					}
					
				}
			}
			sum *= 2;
			
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
					}
				}
			}
			int max = 0;
			for(int i = 0; i < n; i++){
				if(pass[0][i] == INF) continue;
				max = Math.max(max, pass[0][i]);
			}
			System.out.println(sum - max);
			
//			//deebug
//			for(int i = 0; i < n; i++){
//				for(int j = 0; j < n; j++){
//					if(pass[i][j] == INF){
//						System.out.print("INF ");
//					}
//					else{
//						System.out.print(pass[i][j] + " ");
//					}
//				}
//				System.out.println();
//			}
		}
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}