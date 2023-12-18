import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.min;
import static java.lang.System.arraycopy;
import static java.lang.System.exit;
import static java.util.Arrays.copyOf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

	static class IntList {

		int data[] = new int[3];
		int size = 0;

		boolean isEmpty() {
			return size == 0;
		}

		int size() {
			return size;
		}

		int get(int index) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			return data[index];
		}

		void clear() {
			size = 0;
		}

		void set(int index, int value) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			data[index] = value;
		}

		void expand() {
			if (size >= data.length) {
				data = copyOf(data, (data.length << 1) + 1);
			}
		}

		void insert(int index, int value) {
			if (index < 0 || index > size) {
				throw new IndexOutOfBoundsException();
			}
			expand();
			arraycopy(data, index, data, index + 1, size++ - index);
			data[index] = value;
		}

		int delete(int index) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			int value = data[index];
			arraycopy(data, index + 1, data, index, --size - index);
			return value;
		}

		void push(int value) {
			expand();
			data[size++] = value;
		}

		int pop() {
			if (size == 0) {
				throw new NoSuchElementException();
			}
			return data[--size];
		}

		void unshift(int value) {
			expand();
			arraycopy(data, 0, data, 1, size++);
			data[0] = value;
		}

		int shift() {
			if (size == 0) {
				throw new NoSuchElementException();
			}
			int value = data[0];
			arraycopy(data, 1, data, 0, --size);
			return value;
		}
	}

	static String s;
	static IntList edges[];

	static void solve() throws Exception {
		int n = scanInt();
		s = scanString();
		edges = new IntList[n];
		for (int i = 0; i < n; i++) {
			edges[i] = new IntList();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = scanInt() - 1, b = scanInt() - 1;
			edges[a].push(b);
			edges[b].push(a);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			dfs(i, -1);
			if (retMin == 0) {
				ans = min(ans, retMax / 2);
			}
		}
		out.print(ans == Integer.MAX_VALUE ? -1 : ans);
	}

	static int retMin, retMax, retCnt;
	static void dfs(int cur, int prev) {
		int cMin = 0, cMax = 0, cCnt = 0;
		IntList e = edges[cur];
		for (int i = 0; i < e.size; i++) {
			int next = e.data[i];
			if (next == prev) {
				continue;
			}
			dfs(next, cur);
			retMin += retCnt;
			retMax += retCnt;
			cCnt += retCnt;
			if (retMin > cMax) {
				cMin = retMin - cMax;
			} else if (cMin > retMax) {
				cMin = cMin - retMax;
			} else {
				cMin = (cMin ^ retMin) & 1;
			}
			cMax += retMax;
		}
		if (s.charAt(cur) == '1') {
			++cCnt;
		}
		retMin = cMin;
		retMax = cMax;
		retCnt = cCnt;
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}