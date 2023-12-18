import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K;
	Long[] H;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		this.N = Integer.parseInt(tokens[0]);
		this.K = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		this.H = new Long[N];

		for (int i = 0; i < N; ++i) {
			H[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(H, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
	}

	void calc() {
		Queue<Long> que = new ArrayDeque<>(N);
		for (int i = 0; i < N; ++i) {
			que.add(H[i]);
		}
		// まず必殺技を可能な限りかける
		for (int i = 0; i < K; ++i) {
			que.poll();
			if (que.isEmpty()) {
				break;
			}
		}
		// のこりをたす
		while (!que.isEmpty()) {
			result += que.poll();
		}

	}

	void showResult() {
		System.out.println(result);
	}
}
