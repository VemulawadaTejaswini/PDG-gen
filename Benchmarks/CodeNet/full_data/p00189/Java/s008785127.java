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
				Arrays.fill(cost[i], Integer.MAX_VALUE);
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
						cost[i][j] = Math.min(cost[i][j],cost[i][k] + cost[k][j]);
					}
				}
			}
			int min = -1;
			int t = -1;
			for(int i = 0;i <= max;i++){
				int tt = 0;
				for(int j = 0;j <= max;j++){
					if(i == j){
						continue;
					}
					tt += cost[i][j];
				}
				if(min == -1 || min > tt){
					min = tt;
					t = i;
				}else if(min == t && t > i){
					t = i;
				}
			}
			System.out.println(t + " " + min);
		}
	}
}