import java.util.Scanner;


public class Main{

	static int[] dp = new int[1000001];
	static int[] dp_odd = new int[1000001];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		solve();

		while(true){
			int input = Integer.parseInt(s.nextLine());
			if(input == 0)
				return;
			System.out.println(dp[input] + " " + dp_odd[input]);
		}
	}

	@SuppressWarnings("unchecked")
	public static void solve() {
		for(int i=1 ; i<1000001 ; i++) {
			dp[i] = i;
			dp_odd[i] = i;
		}

		for(int i=2 ; (i*(i+1)*(i+2)/6) < 1000000 ; i++) {
			int n = i*(i+1)*(i+2)/6;
			for(int j=n ; j < 1000000 ; j++) {
				dp[j] = Math.min(dp[j], dp[j-n]+1);
				if((n%2) != 0)
					dp_odd[j] = Math.min(dp_odd[j], dp_odd[j-n]+1);
			}
		}
	}
}