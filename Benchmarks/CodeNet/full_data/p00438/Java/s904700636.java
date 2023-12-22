import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0)break;
			int[][] map = new int[b+1][a+1];
			int[][] cost = new int[b+1][a+1];
			
			int n = sc.nextInt();
			int x, y;
			for(int i=0;i<n;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				map[y][x]++;
			}
			
			cost[0][1]=1;
			for(int i=1;i<=b;i++){
				for(int j=1;j<=a;j++){
					if(map[i][j]==0)cost[i][j]=cost[i-1][j]+cost[i][j-1];
				}
			}
			System.out.println(cost[b][a]);
				
		}
	
	}	
}