import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> list = new ArrayList<>();
	static int n;
	static int[] a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		dfs(0, 0);
		Collections.sort(list);
		System.out.println(list.get(list.size() / 2));
	}

	public static void dfs(int pos, int sum) {
		if(pos == n) {
			list.add(sum);
			return;
		}
		dfs(pos + 1, sum);
		dfs(pos + 1, sum + a[pos]);
		return;
	}

}
