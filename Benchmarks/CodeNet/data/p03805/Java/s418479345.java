import java.util.*;
import java.lang.*;


public class Main {
	static int n;
	static int m;
	static int[] a;
	static int[] b;
	static boolean[] visited;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[m];
		b = new int[m];
		visited = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		search(1);
		System.out.println(count);
	}
	static void search(int number) {
		visited[number] = true;
		if (comp()) {
			count++;
			visited[number] = false;
			return;
		}
		for (int i = 0; i < m; i++) {
			if (a[i] == number && !visited[b[i]]) {
				search(b[i]);
			}
		}
		for (int i = 0; i < m; i++) {
			if (b[i] == number && !visited[a[i]]) {
				search(a[i]);
			}
		}
		visited[number] = false;
		return;
	}
	static boolean comp() {
		boolean bre = false;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				bre = true;
				break;
			}
		}
		if (!bre) {
			return true;
		} else {
			return false;
		}
	}
}