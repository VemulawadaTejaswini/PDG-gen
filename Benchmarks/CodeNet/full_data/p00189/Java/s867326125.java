import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
        }
	int[][] cost;
	int n;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			cost = new int[10][10];
			for(int i = 0;i < 10;i++){
				Arrays.fill(cost[i],Integer.MAX_VALUE);
			}
			int max = -1;
			for(int i = 0;i < n;i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				cost[a][b] = c;
				cost[b][a] = c;
				max = Math.max(max,Math.max(a, b));
			}
			for(int i = 0;i <= max;i++){
				for(int j = 0;j <= max;j++){
					for(int k = 0;k <= max;k++){
						if(j == k){
							cost[j][k] = 0;
						}else if(cost[j][i] != Integer.MAX_VALUE && cost[i][k] != Integer.MAX_VALUE){
							cost[j][k] = Math.min(cost[j][k],cost[j][i] + cost[i][k]);
						}
					}
				}
			}
			int min = Integer.MAX_VALUE;
			int t = 0;
			for(int i = 0;i <= max;i++){
				int tt = 0;
				for(int j = 0;j <= max;j++){
					if(cost[i][j] != Integer.MAX_VALUE){
						tt += cost[i][j];
					}
				}
				if(min > tt){
					min = tt;
					t = i;
				}
			}
			System.out.println(t + " " + min);
		}
	}
}