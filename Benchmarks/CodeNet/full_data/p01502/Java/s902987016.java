import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {

		int n = sc.nextInt();

		calc(n);


	}
	public void calc(int n){
		int[][] costs = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				costs[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				sum += Math.min(costs[i][j], costs[j][i]);
			}
		}
		
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}