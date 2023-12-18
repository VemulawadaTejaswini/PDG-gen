import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.arraycopy;
import static java.lang.System.exit;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.fill;

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

	static IntList clues[];
	static int comp[], curComp;

	static void solve() throws Exception {
		int n = scanInt(), m = scanInt(), q = scanInt();
		clues = new IntList[n];
		for (int i = 0; i < n; i++) {
			clues[i] = new IntList();
		}
		for (int i = 0; i < q; i++) {
			int a = scanInt(), b = scanInt(), c = scanInt();
			if (c != 0 && m == n - 1) {
				out.print("No");
				return;
			}
			clues[a].push(b);
			clues[a].push(c);
			clues[b].push(a);
			clues[b].push(c);
		}
		if (m == n - 1) {
			out.print("Yes");
			return;
		}
		comp = new int[n];
		fill(comp, -1);
		curComp = 0;
		for (int i = 0; i < n; i++) {
			if (comp[i] < 0) {
				dfs(i);
				++curComp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < clues[i].size; j += 2) {
				if (clues[i].data[j + 1] == 1 && comp[i] == comp[clues[i].data[j]]) {
					out.print("No");
					return;
				}
			}
		}
		long maxEdges = n - curComp + (long) curComp * (curComp - 1) / 2;
		out.print(m <= maxEdges ? "Yes" : "No");
	}

	static IntList stack = new IntList();

	static void dfs(int cur) {
		comp[cur] = curComp;
		while (true) {
			IntList e = clues[cur];
			for (int i = 0; i < e.size; i += 2) {
				if (e.data[i + 1] == 0) {
					int next = e.data[i];
					if (comp[next] < 0) {
						comp[next] = curComp;
						stack.push(next);
					}
				}
			}
			if (stack.isEmpty()) {
				break;
			}
			cur = stack.pop();
		}
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