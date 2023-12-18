import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] L = new int[N];

		for(int i = 0;i < N;i++) {
			L[i] = scn.nextInt();
		}
		Arrays.sort(L);


		int ans = 0;
		for(int i = 0;i < N-1;i++) {
			for(int j = i+1;j < N;j++) {
				int l = L[i] + L[j];
				int lb = lowerbound(L,l);
				ans += lb - j - 1;
			}
		}

		System.out.println(ans);

	}



	public static int lowerbound(int[] A, int k) {//k<=Aiを満たす最小のi
		int lb = -1, ub = A.length;
		while(ub-lb > 1) {
			int mid = (lb + ub)/2;
			if(A[mid] >= k) {
				ub = mid;
			}else {
				lb = mid;
			}
		}
		return ub;
	}
}
