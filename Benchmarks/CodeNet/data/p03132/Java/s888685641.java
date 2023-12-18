import java.util.Scanner;

public class Main {
	int L;
	long[] Ai = null;

	long[] totalLeftAi = null;
	long[] totalLeftAi1 = null;
	long[] totalLeftAi2 = null;
	
	long[] totalRightAi = null;
	long[] totalRightAi1 = null;
	long[] totalRightAi2 = null;
	
	private void prepare() {
		Scanner in = new Scanner(System.in);
		L = in.nextInt();
		Ai = new long[L+1];
		for (int i=1; i<=L; i++) {
			Ai[i] = in.nextInt();
		}
		in.close();

		totalLeftAi = new long[L+1];
		totalLeftAi1 = new long[L+1];
		totalLeftAi2 = new long[L+1];
		totalLeftAi[0] = 0;
		totalLeftAi1[0] = 0;
		totalLeftAi2[0] = 0;
		for (int i=1; i<=L; i++) {
			totalLeftAi[i] = totalLeftAi[i-1] + Ai[i];
			if (Ai[i] < 1) {
				totalLeftAi1[i] = totalLeftAi1[i-1] + (1 - Ai[i]);
			} else {
				totalLeftAi1[i] = totalLeftAi1[i-1] + (Ai[i] + 1) % 2;
			}
			if (Ai[i] < 2) {
				totalLeftAi2[i] = totalLeftAi2[i-1] + (2 - Ai[i]);
			} else {
				totalLeftAi2[i] = totalLeftAi2[i-1] + (Ai[i] % 2);
			}
			if (totalLeftAi2[i] > totalLeftAi[i]) {
				totalLeftAi2[i] = totalLeftAi[i];
			}
		}
		
		totalRightAi = new long[L+2];
		totalRightAi1 = new long[L+2];
		totalRightAi2 = new long[L+2];
		totalRightAi[L+1] = 0;
		totalRightAi1[L+1] = 0;
		totalRightAi2[L+1] = 0;
		for (int i=L; i>=1; i--) {
			totalRightAi[i] = totalRightAi[i+1] + Ai[i];
			if (Ai[i] < 1) {
				totalRightAi1[i] = totalRightAi1[i+1] + (1 - Ai[i]);
			} else {
				totalRightAi1[i] = totalRightAi1[i+1] + (Ai[i] + 1) % 2;
			}
			if (Ai[i] < 2) {
				totalRightAi2[i] = totalRightAi2[i+1] + (2 - Ai[i]);
			} else {
				totalRightAi2[i] = totalRightAi2[i+1] + (Ai[i] % 2);
			}
			if (totalRightAi2[i] > totalRightAi[i]) {
				totalRightAi2[i] = totalRightAi[i];
			}
		}
		
	}
	
	public long getCount(int left, int right) {
		return totalLeftAi2[left-1]
				+ totalLeftAi1[right]
				- totalLeftAi1[left]
				+ totalRightAi2[right+1];
	}
	
	public long solve() {
		prepare();
		long min = Long.MAX_VALUE;
		int left=-1, right=-1;
		
		for (int i=1; i<=L; i++) {
			for (int j=i; j<=L; j++) {
				long count = getCount(i, j);
				if (min > count) {
					min = count;
					left=i;
					right=j;
					
					//System.out.println(left + "," + right + " : " + count);
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.solve());
	}
}