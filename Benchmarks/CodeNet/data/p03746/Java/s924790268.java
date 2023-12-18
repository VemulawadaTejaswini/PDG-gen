import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	private static void core() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		LinkedHashSet<Integer>[] edge = new LinkedHashSet[N];
		for (int i = 0; i < N; i++) {
			edge[i] = new LinkedHashSet<>();
		}
		for (int i = 0; i < M; i++) {
			int a, b;
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			edge[a].add(b);
			edge[b].add(a);
		}
		ArrayList<Integer> path = new ArrayList<>();
		path.add(0);
		l: while (true) {
			for (Integer node : edge[path.get(path.size() - 1)]) {
				if (!path.contains(node)) {
					path.add(node);
					continue l;
				}
			}
			break;
		}
		//
		System.out.println(path.size());
		for(Integer node : path){
			System.out.print(node + 1);
			System.out.print(' ');
		}
	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 */

	public static void main(String[] args) {
		core();
	}

}
