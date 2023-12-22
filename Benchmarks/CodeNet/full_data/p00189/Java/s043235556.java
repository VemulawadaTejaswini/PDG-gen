import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[][] cost = new int[10][10];
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			int a, b, c;
			int m = -1;
			for(int i=0;i<n;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
				m = Math.max(Math.max(a, b), m);
			}
			for(int i=0;i<=m;i++) cost[i][i] = 0;
			
			for(int i=0;i<=m;i++){
				for(int j=0;j<=m;j++){
					for(int k=0;k<=m;k++){
						if(cost[j][i]!=Integer.MAX_VALUE && cost[i][k]!=Integer.MAX_VALUE){
							cost[j][k] = Math.min(cost[j][k], cost[j][i]+cost[i][k]);
						}
					}
				}
			}
			
			int min = Integer.MAX_VALUE;
			int num = -1;
			int sum;
			for(int i=0;i<=m;i++){
				sum = 0;
				for(int j=0;j<=m;j++) sum += cost[i][j];
				if(min>sum){
					num = i;
					min = sum;
				}
			}
			System.out.println(num + " " + min);
		}	
	}	
}