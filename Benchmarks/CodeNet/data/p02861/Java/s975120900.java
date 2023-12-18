import java.util.*;

public class Main {

	static long[] x, y;
	static long cnt = 0;
	static int [] perm; 
	public static double solve(int idx, int mask) {

		if(idx == perm.length) {
			double sum =0;
			for(int i=0;i<perm.length-1;i++) {
				sum += dist(perm[i], perm[i+1]);
			}
			cnt++;
			return sum;
		}
		double sum = 0;
		boolean b = false;
		for (int i = 0; i < x.length; i++) {
			if ((mask & (1 << i)) == 0) {
				perm[idx]=i;
				sum += solve(idx+1, mask | (1 << i));
				b = true;
			}
		}
		
		
		return sum;
	}

	public static double dist(int i, int j) {
		if (i == -1)
			return 0;
		long dx = x[i]-x[j];
		long dy = y[i]-y[j];
		return Math.sqrt(dx*dx + dy*dy);
	}
//	8
//	-406 10
//	512 859
//	494 362
//	-955 -475
//	128 553
//	-986 -885
//	763 77
//	449 310

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		x = new long[n];
		y = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		perm = new int [n];
		double solve = solve(0, 0);
//		System.out.println(solve);
//		for(int i=1;i<=n;i++)
//			solve/=i;

		System.out.println(solve / cnt);
		
	}

}
