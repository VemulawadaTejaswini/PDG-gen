import java.util.*;

public class Main {
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [][] pass = new int[n][n];
			for(int i = 0 ; i < n; i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
			}
			for(int i = 0 ; i < m; i++){
				String [] input = sc.next().split(",");
				int a = Integer.parseInt(input[0]) - 1;
				int b = Integer.parseInt(input[1]) - 1;
				int cost1 = Integer.parseInt(input[2]);
				int cost2 = Integer.parseInt(input[3]);
				pass[a][b] = cost1;
				pass[b][a] = cost2;
			}
			String [] lastinput = sc.next().split(",");
			int from = Integer.parseInt(lastinput[0]) - 1;
			int to = Integer.parseInt(lastinput[1]) - 1;
			int money = Integer.parseInt(lastinput[2]);
			int h = Integer.parseInt(lastinput[3]);
			
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
					}
				}
			}
			int ans = money - (pass[from][to] + pass[to][from] + h);
			System.out.println(ans);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}