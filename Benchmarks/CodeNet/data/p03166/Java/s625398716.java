import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static int dp[] = new int[100100];
	static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
	static boolean used[];

	static ArrayList<Integer> ans = new ArrayList<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		used = new boolean[N];

		for (int i = 0; i < N; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]) - 1;
			int y = Integer.parseInt(str[1]) - 1;
			edge.get(x).add(y);
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			visit(i, list);
			ans = Math.max(ans, list.size());
		}
		System.out.println(ans);
	}

	static void visit(int now, ArrayList<Integer> list) {
		if (!used[now]) {
			used[now] = true;
			for (int i : edge.get(now)) {
				visit(i, list);
			}
			list.add(0, now);
		}
	}
}
