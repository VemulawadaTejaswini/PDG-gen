import java.util.*;

public class Main {
	static ArrayList<Integer>[] lists;
	static int n;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		lists = new ArrayList[n + 1];
		for (int i = 1; i <= n; i ++) {
			lists[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			lists[a].add(b);
			lists[b].add(a);
		}
		int count = search(1, new boolean[n + 1]);
		System.out.println(count);
	}
	
	static int search(int idx, boolean[] arr) {
		arr[idx] = true;
		boolean flag = true;
		for (int i = 1; i <= n; i++) {
			if (!arr[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return 1;
		}
		int ret = 0;
		for (int x : lists[idx]) {
			if (!arr[x]) {
				ret += search(x, arr.clone());
			}
		}
		return ret;
	}
}
