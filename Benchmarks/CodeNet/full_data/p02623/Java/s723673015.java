import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> a = read(n, sc, k);
		List<Integer> b = read(m, sc, k);
		n = a.size();
		m = b.size();
		long[] S1 = prefixSum(a);
		long[] S2 = prefixSum(b);
		int max = n + m;
		boolean found = false;

		int k1 = 0, k2 = 0;
		for (int i = max; i >= 0; i--) {
			for (k1 = 0; k1 <= i; k1++) {
				k2 = i - k1;
				if (k1 > n || k2 > m) {
					continue;
				}
				// k1 on A, k2 on B
				if (S1[k1] + S2[k2] <= k) {
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		System.out.println(k1 + k2);
	}

	private static long[] prefixSum(List<Integer> list) {
		int n = list.size();
		long[] S = new long[n + 1];
		S[0] = 0;
		for (int i = 1; i <= n; i++) {
			S[i] = S[i - 1] + list.get(i - 1);
		}
		return S;
	}

	private static List<Integer> read(int n, Scanner sc, int k) {
		int sum = 0;
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			sum += t;
			if (sum > k) {
				sc.nextLine();
				break;
			}
			a.add(t);
		}
		return a;
	}

	private static void print(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

}
