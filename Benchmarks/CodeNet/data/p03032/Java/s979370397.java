import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	// 可能な限り返す
	public static int solve2(int step, int left, int right, long take) {
		int sum = 0;
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for (int i = 0; i < N; i++) {
			if ((take & 1 << i) != 0) {
				sum += V[i];
				if (V[i] < 0) {
					que.add(V[i]);
				}
			}
		}
		int nPop = Math.min(K - step, que.size());
		// for (int i = 0; i < step; i++) {
		// 	System.out.print("  ");
		// }
		// System.out.println("x = " + (K - step) + " y = " + que.size());
		while (nPop > 0) {
			nPop--;
			int v = que.poll();
			sum += -v;
		}
		// for (int i = 0; i < step; i++) {
		// 	System.out.print("  ");
		// }
		// System.out.println("step:" + step + ", sum:" + sum + ", nPop=" + nPop);
		return sum;
	}

	public static int sum(long take) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if ((take & 1 << i) != 0) {
				sum += V[i];
			}
		}
		return sum;
	}

	public static int solve(int step, int left, int right, long take) {
		// for (int i = 0; i < step; i++) {
		// 	System.out.print("  ");
		// }
		// System.out.println("step:" + step + ", take:" + Long.toBinaryString(take) + ", sum:" + sum(take));
		if (step >= K) {
			return sum(take);
		}
		int val3 = solve2(step, left, right, take); // 可能な限り返す
		// System.out.println(step + " " + val3 + " " + take + " 全部変えした");
		if (left + 1 == right) {
			return val3;
		}
		int val1 = solve(step + 1, left + 1, right, take | (1 << left));
		// System.out.println(step + " " + val1 + " " + (take | (1 << left)) + " ひだり");

		int val2 = solve(step + 1, left, right - 1, take | (1 << right));
		// System.out.println(step + " " + val2 + " " + (take | (1 << right)) + " みぎ");

		int max = Math.max(Math.max(val1, val2), val3);
		return max;
	}

	static int N, K, sumV;
	static int[] V, VL, VR;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		V = new int[N];
		int minus = 0;
		for (int i = 0; i < N; i++) {
			int v = sc.nextInt();
			V[i] = v;
			sumV += v;
			if (v < 0) {
				minus++;
			}
		}

		VL = new int[N+1];
		VL[0] = 0;
		for (int i = 1; i < N; i++) {
			VL[i] = VL[i-1] + V[i-1];
		}
		VR = new int[N+1];
		VR[N] = 0;
		for (int i = N-2; i >= 0; i--) {
			VR[i] = VR[i+1] + V[i+1];
		}

		int result = solve(0, 0, V.length - 1, 0);
		System.out.println(result);
	}
}
