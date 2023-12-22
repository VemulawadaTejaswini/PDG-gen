import java.util.Scanner;


public class Main{

	static int[] memo;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		memo = new int[n+1];
		System.out.println(function(n));
	}

	public static int function(int n) {
		if(n==0 || n==1) {
			memo[n] = 1;
			return 1;
		}

		if(memo[n]!=0) {
			return memo[n];
		}else {
			memo[n] = function(n-1) + function(n-2);
		}
		return memo[n];
	}

}