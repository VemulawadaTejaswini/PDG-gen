import java.util.*;

class Main {
	static Scanner sc;
	static int n, m;
	static ArrayList<Integer>[] targets;
	static int[] constraints;
	static Boolean[] states;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		targets = new ArrayList[m];
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			ArrayList<Integer> target = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				target.add(sc.nextInt() - 1);
			}
			targets[i] = target;
		}
		constraints = new int[m];
		for (int i = 0; i < m; i++) {
			constraints[i] = sc.nextInt();
		}

		states = new Boolean[n];
		int ans = dfs(0);
		System.out.println(ans);
	}

	public static int dfs(int index) {
		if (index == n) {
			if (check()) {
				return 1;
			} else {
				return 0;
			}
		}

		int sum = 0;
		states[index] = false;
		sum += dfs(index + 1);
		states[index] = true;
		sum += dfs(index + 1);
		return sum;
	}

	public static Boolean check() {
		for (int i = 0; i < m; i++) {
			int count = 0;
			for (int j = 0; j < targets[i].size(); j++) {
				if (states[targets[i].get(j)]) {
					count++;
				}
			}
			if (count % 2 != constraints[i]) {
				return false;
			}
		}
		return true;
	}
}
