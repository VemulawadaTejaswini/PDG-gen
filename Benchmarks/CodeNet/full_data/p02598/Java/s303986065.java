import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[] A = new double[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		int lb = -1, ub = 1_000_000_000, mid;
		while(lb < ub) {
			mid = (ub+lb)/2;
			boolean ok = true;
			int c = 0;
			for(int i = 0; i < N; i++) {
				if(A[i] > c)
					c += (A[i] + mid - 1) / mid - 1;
				if(c > K) {
					ok = false;
					break;
				}
			}
			if(ok)
				ub = mid;
			else
				lb = mid+1;
		}
		System.out.println(lb);
	}

}