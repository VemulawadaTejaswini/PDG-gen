import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int H, W;
	int cH, cW, dH, dW;
	List<String> lines;
	boolean[][] map;
	Tuple[] nodes;
	boolean enable = false;

	static class Tuple {
		int id, h, w, hop;
		Map<Integer, Integer> conns;
		Map<Integer, Integer> warps;

		Tuple(int id, int h, int w, int hop) {
			this.id = id;
			this.h = h;
			this.w = w;
			this.hop = hop;
			this.conns = new HashMap<>();
			this.warps = new HashMap<>();
		}
	}

	static class Next {
		int h, w, dist;

		Next(int h, int w, int dist) {
			this.h = h;
			this.w = w;
			this.dist = dist;
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		cH = Integer.parseInt(tokens[0]) - 1;
		cW = Integer.parseInt(tokens[1]) - 1;
		tokens = in.readLine().split(" ");
		dH = Integer.parseInt(tokens[0]) - 1;
		dW = Integer.parseInt(tokens[1]) - 1;
		lines = new ArrayList<>(H);
		for (int i = 0; i < H; ++i) {
			lines.add(in.readLine());
		}
		map = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			String line = lines.get(i);
			for (int j = 0; j < W; ++j) {
				map[i][j] = (line.charAt(j) == '.') ? true : false;
			}
		}

		nodes = new Tuple[H * W];
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				nodes[h * W + w] = new Tuple(h * W + w, h, w, Integer.MAX_VALUE / 2);
			}
		}
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				int i = h * W + w;
				for (int y = h; y <= Math.min(h + 2, H - 1); ++y) {
					for (int x = Math.max(0, w - 2); x <= Math.min(w + 2, W - 1); ++x) {
						if (x != w || y != h) {
							if (map[h][w] && map[y][x]) {
								int conn = y * W + x;
								nodes[i].warps.put(conn, 1);
								nodes[conn].warps.put(i, 1);
							}
						}
					}
				}
				if (map[h][w]) {
					if (w + 1 < W) {
						if (map[h][w + 1]) {
							int conn = h * W + (w + 1);
							nodes[i].conns.put(conn, 0);
							nodes[conn].conns.put(i, 0);
						}
					}
					if (w - 1 >= 0) {
						if (map[h][w - 1]) {
							int conn = h * W + (w - 1);
							nodes[i].conns.put(conn, 0);
							nodes[conn].conns.put(i, 0);
						}
					}
					if (h + 1 < H) {
						if (map[h + 1][w]) {
							int conn = (h + 1) * W + w;
							nodes[i].conns.put(conn, 0);
							nodes[conn].conns.put(i, 0);
						}
					}
					if (h - 1 >= 0) {
						if (map[h - 1][w]) {
							int conn = (h - 1) * W + w;
							nodes[i].conns.put(conn, 0);
							nodes[conn].conns.put(i, 0);
						}
					}
				}
			}
		}
		nodes[cH * W + cW].hop = 0;

	}

	Set<Next> getNexts(int h, int w, int cdist) {
		Set<Next> set = new HashSet<>();
		for (Integer next : nodes[h * W + w].conns.keySet()) {
			int n = next;
			int nh = n / W;
			int nw = n % W;
			int dist = nodes[h * W + w].conns.get(next);
			set.add(new Next(nh, nw, cdist + dist));
		}
		Set<Integer> nextKeys = new HashSet<>();
		nextKeys.addAll(nodes[h * W + w].conns.keySet());
		int key = h * W + w;
		for (Integer nextKey : nextKeys) {
			nodes[nextKey].conns.remove(key);
		}
		nodes[key].conns.clear();

		return set;
	}
	
	Set<Next> getWarps(int h, int w, int cdist){
		Set<Next> set = new HashSet<>();
		for (Integer next : nodes[h * W + w].warps.keySet()) {
			int n = next;
			int nh = n / W;
			int nw = n % W;
			int dist = nodes[h * W + w].warps.get(next);
			set.add(new Next(nh, nw, cdist + dist));
		}
		Set<Integer> warpKeys = new HashSet<>();
		warpKeys.addAll(nodes[h * W + w].warps.keySet());
		int key = h * W + w;
		for (Integer warpKey : warpKeys) {
			nodes[warpKey].warps.remove(key);
		}
		nodes[key].warps.clear();

		return set;		
	}

	void calc() {
		Deque<Next> que = new LinkedList<>();
		que.addAll(getNexts(cH, cW, 0));
		que.addAll(getWarps(cH, cW, 0));
		while (!que.isEmpty()) {
			Next next = que.poll();
			int nextIndex = next.h * W + next.w;
			// System.out.println(" " + (next.h + 1) + " " + (next.w + 1) + " " + next.dist);
			nodes[nextIndex].hop = next.dist;
			if (next.h == dH && next.w == dW) {
				enable = true;
				break;
			}
			for(Next n: getNexts(next.h, next.w, next.dist)) {
				que.addFirst(n);
				
			}
			for(Next w: getWarps(next.h, next.w, next.dist)) {
				que.addLast(w);
			}
		}
	}

	void showResult() {
		if (enable) {
			System.out.println(nodes[dH * W + dW].hop);
		} else {
			System.out.println("-1");
		}
	}
}
