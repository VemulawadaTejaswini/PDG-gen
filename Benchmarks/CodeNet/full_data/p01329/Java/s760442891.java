import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DR = { -1, 0, 1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int N, M;
	static char[][] f;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			M = sc.nextInt();
			f = new char[N + 2][M + 2];
			int startR = 0;
			int startC = 0;
			Arrays.fill(f[0], '#');
			Arrays.fill(f[N + 1], '#');
			for (int i = 0; i < N; ++i) {
				String row = sc.next();
				f[i + 1][0] = f[i + 1][M + 1] = '#';
				for (int j = 0; j < M; ++j) {
					char c = row.charAt(j);
					if (c == 'S') {
						startR = i + 1;
						startC = j + 1;
						c = '.';
					}
					f[i + 1][j + 1] = c;
				}
			}
			System.out.println(solve(startR, startC));
		}
	}

	static int solve(int startR, int startC) {
		int P = sc.nextInt();
		String[] pat = new String[P];
		for (int i = 0; i < P; ++i) {
			pat[i] = sc.next();
		}
		Automaton automaton = new Automaton(pat);
		boolean[][][] visited = new boolean[N + 2][M + 2][automaton.nodes.size()];
		State initial = new State(startR, startC, 0);
		ArrayList<State> cur = new ArrayList<State>();
		cur.add(initial);
		visited[startR][startC][0] = true;
		int turn = 1;
		while (!cur.isEmpty()) {
//			System.err.println("turn:" + turn);
			ArrayList<State> next = new ArrayList<State>();
			for (State st : cur) {
				for (int i = 0; i < 4; ++i) {
					int nr = st.r + DR[i];
					int nc = st.c + DC[i];
					if (f[nr][nc] == '#') continue;
					Node n = automaton.nodes.get(st.i).next[i];
					if (n == Automaton.terminal) continue;
					if (visited[nr][nc][n.idx]) continue;
					if (f[nr][nc] == 'G') return turn;
					visited[nr][nc][n.idx] = true;
					next.add(new State(nr, nc, n.idx));
//					System.err.println("nr:" + nr + " nc:" + nc + " idx:" + n.idx);
				}
			}
			cur = next;
			++turn;
		}
		return -1;
	}

	static class State {
		int r, c, i;

		public State(int r, int c, int i) {
			this.r = r;
			this.c = c;
			this.i = i;
		}
	}

	static class Automaton {
		static final Node terminal = new Node(0L);
		Node root = new Node(0L);
		HashMap<Long, Node> map = new HashMap<Long, Node>();
		ArrayList<Node> nodes = new ArrayList<Node>();
		int[][] pattern;

		Automaton(String[] patStr) {
			pattern = new int[patStr.length][];
			for (int i = 0; i < patStr.length; ++i) {
				pattern[i] = new int[patStr[i].length()];
				for (int j = 0; j < pattern[i].length; ++j) {
					switch (patStr[i].charAt(j)) {
					case 'U':
						pattern[i][j] = 0;
						break;
					case 'R':
						pattern[i][j] = 1;
						break;
					case 'D':
						pattern[i][j] = 2;
						break;
					case 'L':
						pattern[i][j] = 3;
						break;
					}
				}
			}
			build(root);
		}

		void build(Node parent) {
			parent.idx = nodes.size();
			nodes.add(parent);
			map.put(parent.pos, parent);
			for (int i = 0; i < 4; ++i) {
				long nextPos = 0;
				for (int j = 0; j < pattern.length; ++j) {
					int curElemPos = (int) ((parent.pos >> (j * 4)) & 0xF);
					long nextElemPos;
					if (pattern[j][curElemPos] == i) {
						nextElemPos = curElemPos + 1;
					} else {
						nextElemPos = 0;
						for (int k = curElemPos; k >= 0; --k) {
							if (pattern[j][k] != i) continue;
							boolean ok = true;
							for (int l = 1; l <= k; ++l) {
								if (pattern[j][curElemPos - l] != pattern[j][k - l]) {
									ok = false;
									break;
								}
							}
							if (ok) {
								nextElemPos = k + 1;
								break;
							}
						}
					}
					if (nextElemPos == pattern[j].length) {
						parent.next[i] = terminal;
						break;
					} else {
						nextPos += nextElemPos << (j * 4);
					}
				}
				if (parent.next[i] == null) {
					Node child = map.get(nextPos);
					if (child == null) {
						child = new Node(nextPos);
						build(child);
					}
					parent.next[i] = child;
				}
			}
		}
	}

	static class Node {
		Node[] next = new Node[4];
		long pos;
		int idx;

		Node(long pos) {
			this.pos = pos;
		}
	}

}