import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	int[][] cost;
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			cost = new int[n][n];
			for(int i = 0;i < n;i++){
				Arrays.fill(cost[i],-1000);
			}
			for(int i = 0;i < n;i++){
				cost[i][i] = 0;
			}
			for(int i = 0;i < m;i++){
				cost[scan.nextInt()][scan.nextInt()] = scan.nextInt();
			}
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					for(int k = 0;k < n;k++){
						cost[i][j] = Math.max(cost[i][j],cost[i][k] + cost[k][j]);
					}
				}
			}
			System.out.println(cost[0][n-1]);
		}
	}
}