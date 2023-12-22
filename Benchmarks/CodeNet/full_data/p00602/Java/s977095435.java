import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (sc.hasNext()) {
			int V = sc.nextInt();
			int d = sc.nextInt();
			int N = 1001;
			boolean[] has = new boolean[N];
			int cur = 2;
			int prev = 1;
			for (int i = 0; i < V; ++i) {
				has[cur] = true;
				int tmp = cur;
				cur = (cur + prev) % N;
				prev = tmp;
			}
			int ans = 0;
			int back = -10000;
			for (int i = 0; i < N; ++i) {
				if (!has[i]) continue;
				if (i - back >= d) ++ans;
				back = i;
			}
			System.out.println(ans);
		}
	}

}