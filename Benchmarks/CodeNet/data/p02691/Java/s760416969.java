import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean[] VL = new boolean[200001];
		boolean[] VR = new boolean[200001];
		long[] Lcnt = new long[200001];
		long[] Rcnt = new long[200001];
		long cnt = 0;
		for (int i = 1; i <= N; i++) {
			int x = input.nextInt();
			int L = x+i;
			int R = i-x;
			if (L<200000) {
				VL[L]=true;
				Lcnt[L]++;
			} 
			if (R>0) {
				VR[R]=true;
				Rcnt[R]++;
			} 
			if (L<200000&&R>0) {
				if (VL[R]) cnt+=Lcnt[R];
				if (VR[L]) cnt+=Rcnt[L];
			}
		}
		System.out.println(cnt);
	}
}