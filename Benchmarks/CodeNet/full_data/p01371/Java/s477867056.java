import java.util.Arrays;
import java.util.Scanner;

public class Main{

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			int N = in.nextInt();
			if(N==0) return ;
			int[] noEquip = new int[N];
			int[][] matrix = new int[N][N];
			for(int i=0; i<N; i++){
				noEquip[i] = in.nextInt();
				for(int j=0; j<N; j++){
					matrix[i][j] = in.nextInt();
				}
			}
			System.out.println(solve(noEquip, matrix));
		}
	}

	int solve(int[] noEquip, int[][] matrix){
		int N = noEquip.length;
		int[] dp = new int[1<<N];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		for(int bit=0; bit<(1<<N); bit++){
			for(int i=0; i<N; i++)if(((bit>>i)&1)==0){
				int min = noEquip[i];
				for(int j=0; j<N; j++)if(((bit>>j)&1)>0){
					min = Math.min(min, matrix[i][j]);
				}
				dp[bit|(1<<i)] = Math.min(dp[bit|(1<<i)], dp[bit] + min);
			}
		}
		
		return dp[(1<<N)-1];
	}

	public static void main(String[] args){
		new Main().run();
	}
}