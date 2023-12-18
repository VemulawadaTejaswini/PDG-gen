
import java.util.Scanner;

public class Main {

	public static int[] tree;
	public static int[] dep;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		tree = new int[n];
		dep = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
			tree[i] = i;
			dep[i] = 0;
		}
		for(int i = 0; i < m; i++) {
			union(sc.nextInt() - 1, sc.nextInt() - 1);
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(root(p[i]) == root(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	public static int root(int i) {
		if(tree[i] == i) {
			return i;
		} else {
			return root(tree[i]);
		}
	}

	public static void union(int i, int j) {
		int iroot = root(i);
		int jroot = root(j);
		if(dep[iroot] <= dep[jroot]) {
			tree[iroot] = jroot;
			dep[jroot]++;
		} else {
			tree[jroot] = iroot;
			dep[iroot]++;
		}
	}

}
