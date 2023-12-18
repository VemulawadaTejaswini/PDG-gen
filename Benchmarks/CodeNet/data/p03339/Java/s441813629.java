import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String S = in.next();
		
		int[] dp = new int[n];
		int westCount = 0;
		dp[0] = 0;
		if(S.charAt(0)=='W') westCount++;
		
		for(int i=1;i<n;i++) {
			if(S.charAt(i)=='W') {
				dp[i] = dp[i-1];
				westCount++;
			}else{
				dp[i] = Math.min(dp[i-1]+1, westCount);
			}
		}
		
		System.out.println(dp[n-1]);
		
		in.close();
	}

}
