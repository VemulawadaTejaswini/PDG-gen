
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static long[] ans;
	public static ArrayList<Integer>[] tree;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		tree = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			tree[i] = new ArrayList<>();
		}
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			tree[a].add(b);
			tree[b].add(a);
		}
		ans = new long[n];
		for(int i = 0; i < n; i++) {
			ans[i] = 0;
		}
		for(int i = 0; i < q; i++) {
			int p = sc.nextInt() - 1;
			long x = sc.nextLong();
			ans[p] += x;
		}
		Calc(0, 0, 0);
		for(int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}

	public static void Calc(int n, int from, long x) {
		ans[n] += x;
		for(Integer e : tree[n]) {
			if(e != from)
				Calc(e, n, ans[n]);
		}
	}

}
