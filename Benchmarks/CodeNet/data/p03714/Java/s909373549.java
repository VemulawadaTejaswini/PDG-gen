import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		long[] nums = new long[3 * N];
		
		for (int i = 0; i < 3 * N; i++) {
			nums[i] = in.nextLong();
		}
		
		// Store the maximum sum by picking N from left array
		long[] maxLeft = new long[3 * N];
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		long sum = 0;
		
		for (int i = 0; i < N; i++) {
			pq.add(nums[i]);
			sum += nums[i];
		}
		
		maxLeft[N] = sum;
		
		for (int i = N; i < 2 * N; i++) {
			pq.add(nums[i]);
			sum += nums[i];
			sum -= pq.poll();
			maxLeft[i + 1] = sum;
		}
		
		// Store the minimum sum by picking N from right array
		long[] minRight = new long[3 * N];
		pq = new PriorityQueue<Long>(Collections.reverseOrder());
		
		sum = 0;
		for (int i = 3 * N - 1; i >= 2 * N; i--) {
			pq.add(nums[i]);
			sum += nums[i];
		}
		
		minRight[2 * N - 1] = sum;
		for (int i = 2 * N - 1; i >= N; i--) {
			pq.add(nums[i]);
			sum += nums[i];
			sum -= pq.poll();
			minRight[i] = sum;
		}
		
		for (int i = 0; i < 3 * N; i++) {
			System.out.printf("%3d ", maxLeft[i]);
		}
		System.out.println();
		for (int i = 0; i < 3 * N; i++) {
			System.out.printf("%3d ", minRight[i]);
		}
		System.out.println();
		
		// Determine the answer
		long answer = Long.MIN_VALUE;
		for (int i = N; i <= 2 * N; i++) {
			answer = Math.max(answer, maxLeft[i] - minRight[i]);
		}
		
		System.out.println(answer);
	}
}