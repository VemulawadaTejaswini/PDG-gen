import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	static int dp[] = new int[100100];
	static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
	static ArrayList<Integer> list = new ArrayList<>();

	static ArrayList<Integer> ans = new ArrayList<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		for (int i = 0; i < N; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			edge.get(x).add(y);
		}

		for (int i = 0; i < N; i++) {
			visit(i);
		}
		for (int i : ans) {
			System.out.println(i);
		}
	}

	static void visit(int now) {
		if (list.indexOf(now) == -1) {
			list.add(now);
			for (int i : edge.get(now)) {
				visit(i);
			}
			ans.add(0, now);
		}
	}
}

