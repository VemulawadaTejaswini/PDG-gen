import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> o2 - o1);
		for (int i = 0; i < n; i++) {
			que.add(Integer.parseInt(sa[i]));
		}
		br.close();

		for (int i = 0; i < m; i++) {
			int o = que.poll();
			que.add(o / 2);
		}

		long ans = 0;
		for (int o : que) {
			ans += o;
		}
		System.out.println(ans);
	}
}
