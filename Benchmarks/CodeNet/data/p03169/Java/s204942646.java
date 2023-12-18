import java.util.*;
import java.io.*;

public class Main {


	public static void main(String[] args) {
		Main answer = new Main();
		System.out.println(answer.solve());
	}

	private double solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int one=0,two=0,three=0;
		for(int i=0;i<N;i++){
			int val = sc.nextInt();
			if (val==1) one++;
			else if (val==2) two++;
			else if (val==3) three++;
		}

		double [][][] dp = new double [300][300][300];
		for(int i=0;i<300;i++){
			for(int j=0;j<300;j++){
				for(int k=0;k<300;k++){
					dp[i][j][k] = -1.0;
				}
			}
		}


		solve(dp, one, two, three, N);

		return dp[one][two][three];
	}

	double solve(double[][][] dp, int one, int two, int three, int N) {

		if (one<0 || two<0 || three<0) return 0;
		if (one==0 && two==0 && three==0) return 0;
		if (dp[one][two][three] >0) return dp[one][two][three];
		 
		dp[one][two][three] = (N+ one * solve(dp, one-1,two, three, N)
							   + two * solve(dp, one+1, two-1, three, N)
							   + three * solve(dp, one, two+1, three-1, N))/ (one+two+three);

		return dp[one][two][three];
	}

}
