import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		long water_sum = 0L;
		long odd_sum = 0L;
		long ans[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
			water_sum += A[i];
			if (i%2==0 && i!=N-1) {
				odd_sum += A[i];
			}
		}
		ans[N-1] = (water_sum-odd_sum*2);
		for (int i=N-2;i>=0;i--) {
			ans[i] = (A[i]-ans[i+1]/2)*2;
		}
		for (int i=0;i<N;i++) {
			System.out.print(ans[i] + " ");
		}
	}
}