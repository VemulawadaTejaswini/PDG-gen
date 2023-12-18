import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int n;
	static List<List<Integer>> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) list.add(new ArrayList<>());
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		int[] list1 = dfs(0, -1, new int[n]);
		int[] list2 = dfs(n - 1, -1, new int[n]);
		int a = 0, b = 0;
		for(int i = 0; i < n; i++) {
			if(list1[i] <= list2[i]) a++;
			else b++;
		}
		if(a > b) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
//		System.out.println(Arrays.toString(list1));
//		System.out.println(Arrays.toString(list2));
//	}

	static int[] dfs(int s, int p, int[] ret) {
		List<Integer> edge = list.get(s);
		for(int v : edge) {
			if(p != v) {
				ret[v] += ret[s] + 1;
				dfs(v, s, ret);
			}
		}
		return ret;
	}
}
