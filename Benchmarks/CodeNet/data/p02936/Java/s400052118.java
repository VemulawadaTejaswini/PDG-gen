import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer>[] list;

	static int[] counter;

	static boolean[] flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());

		list = new ArrayList[N + 1];
		for(int i = 1;i <= N;i++) {
			list[i] = new ArrayList<Integer>();
		}

		for(int i = 1;i <= N - 1;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			list[a].add(b);
			list[b].add(a);
		}

		counter = new int[N + 1];
		for(int i = 1;i <= Q;i++) {
			int p = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			counter[p] += x;
		}
		sc.close();

//		for(int i = 1;i <= N - 1;i++) {
//			System.out.println(list[i]);
//		}
//		for(int i = 1;i <= N;i++) {
//			System.out.println(counter[i]);
//		}

		flag = new boolean[N + 1];
		flag[1] = true;
		dfs(1);

		for(int i = 1;i <= N;i++) {
			System.out.println(counter[i]);
		}

	}

	private static void dfs(int x) {
		for(int y : list[x]) {
//			System.out.print(y);
//			System.out.println(flag[y]);
			if(!flag[y]) {
//				System.out.print(y);
//				System.out.println(counter[y]);
				counter[y] += counter[x];
				flag[y] = true;
				dfs(y);
			}
		}
	}
}