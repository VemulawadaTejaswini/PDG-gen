import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Integer[] A = new Integer[N];
		for (int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		List<Integer> A_list = Arrays.asList(A);
		Collections.reverse(A_list);
		Integer[] A_2 = (Integer[])A_list.toArray(new Integer[N]);
		// System.out.println(Arrays.toString(A_2));
		System.out.println(LIS(A_2));
		// System.out.println(LDS(A));
	}

	static int LIS (Integer[] A) {
		int N = A.length;
		Integer[] dp = new Integer[N];
		for (int i=0;i<N;i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		for (int i=0;i<N;i++) {
			int index = Arrays.binarySearch(dp, A[i], (x,y)->x.compareTo(y)>0?1:-1);
			if (index<0) {index = -index-2;}
			dp[index+1] = A[i];
		}
		int ans = 0;
		for (int i=0;i<N;i++) {
			if (dp[i] != Integer.MAX_VALUE) {
				ans++;
			}
		}
		return ans;
	}
	// static int LDS (Integer[] A) {
	// 	int N = A.length;
	// 	int[] dp = new int[N];
	// 	for (int i=0;i<N;i++) {
	// 		dp[i] = Integer.MAX_VALUE;
	// 	}
	// 	for (int i=0;i<N;i++) {
	// 		int index = Arrays.binarySearch(dp, A[i]);
	// 		if (index<0) {index = -index-2;}
	// 		dp[index+1] = A[i];
	// 	}
	// 	int ans = 0;
	// 	for (int i=0;i<N;i++) {
	// 		if (dp[i] != Integer.MAX_VALUE) {
	// 			ans++;
	// 		}
	// 	}
	// 	System.out.println(Arrays.toString(dp));
	// 	return ans;
	// }
}