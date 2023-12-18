import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int[] r = new int[N];
		int plus = 0;
		boolean trig = true;
		for(int i = 0;i < N;i++) {
			r[i] = scn.nextInt();
			if(r[i] >0 && trig) {
				plus = i;
				trig = false;
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i <N-K;i++ ) {
			if(i + K-1 < plus) {
				ans = Math.min(ans, -r[i]);
			}else if(i < plus) {
				ans = Math.min(ans, Math.abs(r[i+K-1]-2*r[i]));
				ans = Math.min(ans, Math.abs(2*r[i+K-1]-r[i]));
			}else {
				ans = Math.min(ans, r[i+K-1]);
			}

		}
		if(N == 1)ans = Math.abs(r[0]);
		System.out.println(ans);
		scn.close();
	}
}
