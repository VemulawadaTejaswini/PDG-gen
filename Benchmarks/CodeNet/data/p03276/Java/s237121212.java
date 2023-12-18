import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int[] r = new int[N];
		for(int i = 0;i < N;i++) {
			r[i] = scn.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i <=N-K;i++ ) {
			if(r[i+K-1] <0) {
				ans = Math.min(ans, -r[i]);
			}else if(r[i] <0 ) {
				ans = Math.min(ans, Math.abs(r[i+K-1]-2*r[i]));
				ans = Math.min(ans, Math.abs(2*r[i+K-1]-r[i]));
			}else {
				ans = Math.min(ans, r[i+K-1]);
			}

		}
		System.out.println(ans);
		scn.close();
	}
}