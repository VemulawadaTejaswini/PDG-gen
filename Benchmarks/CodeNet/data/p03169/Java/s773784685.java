import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ans = new Main();
		System.out.printf("%.15f\n",ans.solve());
	}
 
	private double solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ones=0,twos=0,threes=0;
		for(int i=1;i<=N;i++) {
			int val = sc.nextInt();
			if(val==1) ones++;
			else if(val==2) twos++;
			else threes++;
		}
		double [][][] dp = new double[301][301][301];
		return solve(ones, twos, threes, dp, N);
	}

	private double solve(int ones, int twos, int threes, double [][][] dp, int N) {

		if (ones <0 || twos<0 || threes<0) return 0;
		if (ones==0 & twos==0 && threes==0) return 0;

		  
		if(dp[ones][twos][threes] > 0.0) return dp[ones][twos][threes];

		double choose_ones = ones * solve(ones-1, twos, threes, dp, N);
		double choose_twos = twos * solve(ones+1, twos-1, threes, dp, N);
		double choose_threes = threes * solve(ones, twos+1, threes-1, dp, N);
		
		double answer = (N + choose_ones + choose_twos + choose_threes)/(ones+twos+threes);
		dp[ones][twos][threes] = answer;
		return answer;
	}
}