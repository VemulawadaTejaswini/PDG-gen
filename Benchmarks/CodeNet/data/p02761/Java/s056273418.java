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
			if (buf[s[i]] < 0 || buf[s[i]] == c[i]) {
				// 未初期化，埋められる
				buf[s[i]] = c[i];
			} else {
				// 既存と違う: NG
				enable = false;
				break;
			}
		}
		if (!enable) {
			return;
		}
		// 残りを埋める
		if (N == 1) {
			if (buf[0] < 0) {
				buf[0] = 0;
			}
			return;
		}
		if (buf[0] == 0) {
			if (N != 1) {
				enable = false;
			}
			return;
		}
		buf[0] = buf[0] < 0 ? 1 : buf[0];
		for (int i = 1; i < N; ++i) {
			if (buf[i] < 0) {
				buf[i] = 0;
			}
		}
	}

	void showBuf() {
		for (int i = 0; i < buf.length; ++i) {
			System.out.print(buf[i] + " ");
		}
		System.out.println();
	}

	void showResult() {
		// showBuf();
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
