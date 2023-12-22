import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g1 = sc.nextInt();
			int g2 = sc.nextInt();
			
			if(n == 0 && m == 0 && s == 0 && g1 == 0 && g2 == 0){
				break;
			}
			
			int[][] street = new int[n + 1][n + 1];
			int x;
			int y;
			int cost;
			
			for(int i = 1; i < n + 1; i++){
				for(int j = 1; j < n + 1; j++){
					street[j][i] = Integer.MAX_VALUE/10;
				}
			}
			
			for(int i = 0; i < m ; i++){
				x = sc.nextInt();
				y = sc.nextInt();
				cost = sc.nextInt();
				street[x][y] = cost;
				street[y][x] = cost;
				
			}
			
			for(int i = 1; i < n + 1; i++){
				street[i][i] = 0;
				for(int j = 1; j < n + 1; j++){
					for(int k = 1; k < n + 1; k++){
						street[j][k] = Math.min(street[j][k], street[j][i] + street[i][k]);
					}
				}
			}
			int route[] = new int[3];
			route[0] = street[g2][g1];
			route[1] = street[s][g1];
			route[2] = street[s][g2];
			int sum = Integer.MAX_VALUE;
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(i != 1 && 2 != 0){
						sum = Math.min(sum, route[i] + route[j]);
					}
				}
			}
			System.out.println(sum);
			
		}
		
	}

}