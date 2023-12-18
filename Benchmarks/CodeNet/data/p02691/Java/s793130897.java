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
			long x = input.nextLong();
			long L = x+i;
			long R = i-x;
			if (L<200000) {
				VL[(int)L]=true;
				Lcnt[(int)L]++;
			} 
			if (R>=0) {
				VR[(int)R]=true;
				Rcnt[(int)R]++;
			} 
			if (L<200000&&R>=0) {
				if (VL[(int)R]) cnt+=Lcnt[(int)R];
				if (VR[(int)L]) cnt+=Rcnt[(int)L];
			}
		}
		System.out.println(cnt);
	}
}