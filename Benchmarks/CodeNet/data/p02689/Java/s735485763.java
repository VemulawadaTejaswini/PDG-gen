import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] val = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			val[i] = sc.nextInt();
		}

		List<Integer>[] edgeList = new ArrayList[N + 1]; //各nodeが持つedgeを集約する

		for (int i = 0; i < edgeList.length; i++) {
			edgeList[i] = new ArrayList<Integer>();
		}

		//辺をノードごとに集約
		for (int i = 0; i < M; i++) {
			int edge_a = sc.nextInt();
			int edge_b = sc.nextInt();
			if (edgeList[edge_a].contains(edge_b) == false) {
				edgeList[edge_a].add(edge_b);
			}
			if (edgeList[edge_b].contains(edge_a) == false) {
				edgeList[edge_b].add(edge_a);
			}
		}

		int ans = 0;

		//比較
		for (int i = 1; i <= N; i++) {
			int let = 0;
			for (int j = 0; j < edgeList[i].size(); j++) {
				let = (int)Math.max(let, val[edgeList[i].get(j)]);
			}
			if (let - val[i] < 0) {
				ans++;
			}
		}

		System.out.println(ans);


	}
}