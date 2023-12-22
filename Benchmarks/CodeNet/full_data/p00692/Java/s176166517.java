import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		int N = sc.nextInt();
		while (N-- > 0) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < 20; i++) {
				list.add(sc.nextInt());
			}
			HashSet<String> hs = new HashSet<String>();
			Queue<ArrayList<Integer>> queue = new LinkedList<ArrayList<Integer>>();
			queue.add(list);
			hs.add(list.toString());
			int min = list.size();
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int I = 0; I < size; I++) {
					ArrayList<Integer> pollData = queue.poll();
					min = Math.min(min, pollData.size());
					for (int i = 0; i < pollData.size(); i++) {
						ArrayList<Integer> listNow = new ArrayList<Integer>(
								pollData);
						if (i % 4 != 3 && i + 1 < listNow.size()) {
							if (listNow.get(i) == listNow.get(i + 1)) {
								listNow.remove(i);
								listNow.remove(i);
								if (!hs.contains(listNow.toString())) {
									queue.add(listNow);
									hs.add(listNow.toString());
								}
							}
						}
					}
					for (int i = 0; i < pollData.size(); i++) {
						ArrayList<Integer> listNow = new ArrayList<Integer>(
								pollData);
						if (i + 4 < listNow.size()) {
							if (listNow.get(i) == listNow.get(i + 4)) {
								listNow.remove(i + 4);
								listNow.remove(i);
								if (!hs.contains(listNow.toString())) {
									queue.add(listNow);
									hs.add(listNow.toString());
								}
							}
						}
					}
					for (int i = 0; i < pollData.size(); i++) {
						ArrayList<Integer> listNow = new ArrayList<Integer>(
								pollData);
						if (i % 4 != 0 && i + 3 < listNow.size()) {
							if (listNow.get(i) == listNow.get(i + 3)) {
								listNow.remove(i + 3);
								listNow.remove(i);
								if (!hs.contains(listNow.toString())) {
									queue.add(listNow);
									hs.add(listNow.toString());
								}
							}
						}
					}
					for (int i = 0; i < pollData.size(); i++) {
						ArrayList<Integer> listNow = new ArrayList<Integer>(
								pollData);
						if (i % 4 != 3 && i + 5 < listNow.size()) {
							if (listNow.get(i) == listNow.get(i + 5)) {
								listNow.remove(i + 5);
								listNow.remove(i);
								if (!hs.contains(listNow.toString())) {
									queue.add(listNow);
									hs.add(listNow.toString());
								}
							}
						}
					}
				}
			}
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}