import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;
	int[] s, c;
	int[] buf;
	boolean enable = true;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		s = new int[M];
		c = new int[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			s[i] = Integer.parseInt(tokens[0]) - 1;
			c[i] = Integer.parseInt(tokens[1]);
		}
		this.buf = new int[N];
		Arrays.fill(buf, -1);
	}

	void calc() {
		for (int i = 0; i < M; ++i) {
			if (buf[s[i]] == -1) {
				// 未初期化，埋められる
				buf[s[i]] = c[i];
			} else if (buf[s[i]] != c[i]) {
				// 同じの場合OK
				enable = false;
				break;
			}
		}
		if (!enable) {
			return;
		}
		// 残りを埋める
		if (buf[0] == 0) {
			if (N != 1) {
				enable = false;
			}
			return;
		}
		buf[0] = buf[0] < 0 ? 1 : buf[0];
		for (int i = 1; i < M; ++i) {
			if (buf[i] < 0) {
				buf[i] = 0;
			}
		}
	}

	void showResult() {
		if (enable) {
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < N; ++i) {
				strBuilder.append(Integer.toString(buf[i]));
			}
			System.out.println(strBuilder.toString());
		} else {
			System.out.println(-1);
		}
	}

}
