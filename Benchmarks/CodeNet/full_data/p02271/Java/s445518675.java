import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, q;
		
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			m = sc.nextInt();
			if (dfs(a, m, 0)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	
	static boolean dfs(int[] a, int m, int current) {
		if (m == 0) {
			return true;
		}
		if (m < 0 || current == a.length) {
			return false;
		}
		
		if (dfs(a, m, current+1) || dfs(a, m - a[current], current+1)) {
			return true;
		}
		return false;
	}
}