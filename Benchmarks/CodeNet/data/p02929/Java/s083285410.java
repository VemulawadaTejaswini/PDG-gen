import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		final int MOD = 1000000007;

		scn.nextLine();
		char[] S = scn.nextLine().toCharArray();
		long[] num = new long[S.length];
		for(int i = 1;i <= 2*N;i++) {
			int nn = Math.min(i, 2*N-i+1);

			if(S[i-1] == 'W') {
				if(nn%2==0) {
					num[i-1] = nn;
				}else {
					num[i-1] = nn-1;
				}
			}else {
				if(nn%2==0) {
					num[i-1] = nn-1;
				}else {
					num[i-1] = nn;
				}
			}
		}

		long ans = 1;
		for(int i = 0;i < 2*N;i++) {
			ans *= num[i];
			ans %= MOD;
		}
		System.out.println(ans);
	}

}
