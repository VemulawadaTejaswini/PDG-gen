import java.util.*;
import java.io.*;

public class Main {


	public static void main(String[] args) {
		Main ans = new Main();
		System.out.println(ans.solve());
	}

	private double solve() {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] array = new int[N+1];
		int one=0, two=0,three=0;
		for(int i=1;i<=N;i++){
			int val = sc.nextInt();
			if (val==1) one++;
			else if (val==2) two++;
			else three++;
		}
		double [][][] dp = new double[302][302][302];

		return solve(one,two,three,N, dp);
	}

	private double solve(int one, int two, int three, int N, double [][][] dp) {

		if (one==0 && two==0 && three==0) return 0;
		if (one<0 || two<0 || three<0) return 0;

		if (dp[one][two][three]!=0) return dp[one][two][three];

		double val = one * solve(one-1, two, three, N, dp)
		 				+ two * solve(one+1, two-1, three,N, dp)
		 				+ three * solve(one, two+1, three-1, N, dp)
		 				+ N;

		double answer = val/(one+two+three);

		dp[one][two][three] = answer;

		return answer;

 	}
}