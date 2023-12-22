import java.util.*;

public class Main {

	final int MAX_N = 100009;
	final int MAX_DEPTH = 20;
	double[][] dp = new double[MAX_N][MAX_DEPTH];
	double[][] prob = new double[MAX_N][MAX_DEPTH];

	void run(){
		Scanner in = new Scanner(System.in);
		init();
		for(;;){
			int n = in.nextInt();
			if(n == 0) return ;
			System.out.printf("%.10f\n", solve(n));
		}
	}

	void init(){
		dp[1][1] = 1.0;
		prob[1][1] = 1.0;
		for(int i=2; i<MAX_N-1; i++){
			for(int j=0; j<MAX_DEPTH; j++){
				if(j==0){
					for(int k=0; k<MAX_DEPTH; k++){
						prob[i][j] += prob[i-1][k] * (1.0 - 1.0/(1<<k));
					}
					for(int k=0; k<MAX_DEPTH; k++){
						dp[i][j] += prob[i-1][k] * (1.0 - 1.0/(1<<k)) * dp[i-1][k] / prob[i][j];
					}
				}
				else{
					prob[i][j] += prob[i-1][j-1] * (1.0/(1<<(j-1)));
					dp[i][j] += (dp[i-1][j-1] + 1.0);
				}
			}
		}
	}

	double solve(int n){
		double ret = 0.0;
		for(int i=0; i<MAX_DEPTH; i++){
			ret += prob[n][i] * dp[n][i];
		}
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}