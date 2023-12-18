import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	static PrintWriter pw = new PrintWriter(System.out);
	static int v, e, tmax, tlast;
	static int[][] dist;
	static List<Integer>[][] route;
	static List<List<Hen>> nextList;
	static List<List<Order>> infoList;
	static int t = 0;
	static long tmax2 = 0;
	static long K = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		v = Integer.parseInt(sa[0]);
		e = Integer.parseInt(sa[1]);
		dist = new int[v][v];
		route = new List[v][v];
		nextList = new ArrayList<>(v);
		for (int i = 0; i < v; i++) {
			nextList.add(new ArrayList<>());
		}
		for (int i = 0; i < e; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			nextList.get(a).add(new Hen(b, c));
			nextList.get(b).add(new Hen(a, c));
		}

		tmax = Integer.parseInt(br.readLine());
		tlast = (int) (tmax * 0.95);
		tmax2 = tmax * tmax;
		infoList = new ArrayList<>(tmax);
		for (int i = 0; i < tmax; i++) {
			int n = Integer.parseInt(br.readLine());
			List<Order> orderList = new ArrayList<>(n);
			for (int j = 0; j < n; j++) {
				sa = br.readLine().split(" ");
				Order o = new Order();
				o.id = Integer.parseInt(sa[0]);
				o.dst = Integer.parseInt(sa[1]) - 1;
				o.time = i;
				orderList.add(o);
			}
			infoList.add(orderList);
		}
		br.close();

		for (int i = 0; i < v; i++) {
			dijkstra(i);
		}

		int gotT = 0;
		int now = 0;
		int next = 0;
		boolean judged = false;
		Map<Integer, List<Order>> carMap = new HashMap<>();
		List<SimuInfo> baseInfoList = new ArrayList<>();
		label:
		while (t < tmax) {
			if (now == 0) {
				// 前回～時刻tの商品を積み込み
				for ( ; gotT <= t; gotT++) {
					for (Order o : infoList.get(gotT)) {
						List<Order> list = carMap.get(o.dst);
						if (list == null) {
							list = new ArrayList<>();
							carMap.put(o.dst, list);
						}
						list.add(o);
					}
				}
				// 荷物なしの場合は店で待機
				if (carMap.isEmpty()) {
					pw.println(-1);
					t++;
					continue label;
				}

				// 出発を待つか判定
				if (!judged) {
					Map<Integer, List<Order>> tempMap = makeClone(carMap);
					Map<Integer, List<Order>> tempMap2 = makeClone(tempMap);
					baseInfoList = simulateAll(tempMap2, gotT, t, 0);
					long maxVal = 0;
					for (SimuInfo info : baseInfoList) {
						maxVal += info.val;
					}
					int start = 0;
					int limit = Math.min(t + 2, tlast);
					for (int i = t; i <= limit; i++) {
						if (!getProduct(tempMap, i, i)) {
							continue;
						}
						tempMap2 = makeClone(tempMap);
						List<SimuInfo> simuList = simulateAll(tempMap2, gotT, i, 0);
						long val = 0;
						for (SimuInfo info : simuList) {
							val += info.val;
						}
						val -= (i - t) * K;
						if (val > maxVal) {
							maxVal = val;
							baseInfoList = simuList;
							start = i;
						}
					}
					while (t < start) {
						pw.println(-1);
						t++;
					}
					judged = true;
					continue label;
				}

			} else {
				// 荷物がなくなった場合は店に戻る
				if (carMap.isEmpty()) {
					moveAll(now, 0);
					now = 0;
					continue label;
				}
				// 配達続けるか即座に店に戻るか判定
				Map<Integer, List<Order>> tempMap = makeClone(carMap);
				// 全部配達した場合
				SimuInfo info0 = baseInfoList.get(0);
				long val0 = info0.val;
				int t0 = info0.tt + dist[info0.goal][0];
				val0 -= dist[info0.goal][0] * K;

				// 店に戻った場合
				SimuInfo info1 = returnShop(tempMap, t, now);
				long val1 = info1.val;
				int t1 = info1.tt;
				getProduct(tempMap, gotT, t1);
				SimuInfo info = simulate(tempMap, t1, 0, false);
				val1 += info.val;
				t1 = info.tt;

				// 全部配達した場合の続き
				tempMap.clear();
				getProduct(tempMap, gotT, t0);
				info = simulate(tempMap, t0, 0, false);
				val0 += info.val;
				t0 = info.tt;

				val1 += Math.max(t0 - t1, 0) * K;
				if (val0 < val1) {
					for (Integer o : route[now][0]) {
						carMap.remove(o);
					}
					moveAll(now, 0);
					now = 0;
					continue label;
				}
			}

			judged = false;
			SimuInfo baseInfo0 = baseInfoList.get(0);
			next = baseInfo0.his.get(baseInfo0.hisIdx++);
			baseInfo0.val += dist[now][next] * K;
			moveAll(now, next);
			for (Order o : carMap.get(next)) {
				int w = t - o.time;
				baseInfo0.val -= tmax2 - w * w;
			}
			carMap.remove(next);
			now = next;
		}
		pw.flush();
	}

	/**
	 * 商品積み込み
	 * @param carMap 荷物
	 * @param gotT 前回積み込み済み時刻+1
	 * @param tt 現在時刻
	 * @return 1つ以上積み込んだ場合true
	 */
	static boolean getProduct(Map<Integer, List<Order>> carMap, int gotT, int tt) {
		int limit = Math.min(tt, tlast);
		boolean flg = false;
		for (int i = gotT; i <= limit; i++) {
			for (Order o : infoList.get(i)) {
				flg = true;
				List<Order> list = carMap.get(o.dst);
				if (list == null) {
					list = new ArrayList<>();
					carMap.put(o.dst, list);
				}
				list.add(o);
			}
		}
		return flg;
	}

	static Map<Integer, List<Order>> makeClone(Map<Integer, List<Order>> carMap) {
		Map<Integer, List<Order>> tempMap = new HashMap<>();
		for (Integer key : carMap.keySet()) {
			List<Order> list = carMap.get(key);
			List<Order> list2 = new ArrayList<>(list.size());
			list2.addAll(list);
			tempMap.put(key, list2);
		}
		return tempMap;
	}

	/**
	 * 引数の荷物を持って出発した場合の最終的な評価を計算
	 * 引数の荷物を配り終えた以降貪欲
	 * @param tempMap 荷物のコピー
	 * @param gotT 前回積み込み済み時刻+1
	 * @param tt 出発時刻
	 * @param now 出発地点
	 * @return 結果
	 */
	static List<SimuInfo> simulateAll(Map<Integer, List<Order>> tempMap, int gotT, int tt, int now) {
		List<SimuInfo> simuList = new ArrayList<>();
		SimuInfo info0 = simulate(tempMap, tt, now, true);
		simuList.add(info0);
		tt = info0.tt;
		while (tt < tmax) {
			SimuInfo info = simulate(tempMap, tt, 0, false);
			simuList.add(info);
			tt = info.tt;
			tt += dist[info.goal][0];
			getProduct(tempMap, gotT, tt);
			gotT = tt + 1;
		}
		return simuList;
	}

	/**
	 * 引数の荷物を持って出発した場合の評価を計算
	 * @param carMap 荷物（変更は加わらない）
	 * @param tt 出発時刻
	 * @param now 出発地点
	 * @paaram doSA falseの場合貪欲のみ
	 * @return 結果
	 */
	static SimuInfo simulate(Map<Integer, List<Order>> carMap, int tt, int now, boolean doSA) {
		SimuInfo info = new SimuInfo();
		info.tt = tt;
		info.goal = now;
		Set<Integer> set = new HashSet<>();
		set.addAll(carMap.keySet());
		info.his = new ArrayList<>(set.size());
		if (set.isEmpty()) {
			return info;
		}
		int from = now;
		while (!set.isEmpty()) {
			int minD = Integer.MAX_VALUE;
			for (int o : set) {
				int d = dist[from][o];
				if (d < minD) {
					minD = d;
					info.goal = o;
				}
			}
			set.remove(info.goal);
			info.his.add(info.goal);
			info.tt += dist[from][info.goal];
			if (info.tt > tmax) {
				break;
			}
			for (Order o : carMap.get(info.goal)) {
				int w = info.tt - o.time;
				info.val += tmax2 - w * w;
			}
			from = info.goal;
		}
		info.val -= (Math.min(info.tt, tmax) - tt) * K;

		if (doSA) {
			info = simulatedAnnealing(info, carMap, tt, now);
		}
		return info;
	}

	/**
	 * 焼きなまし法でより良い配達順を探索
	 */
	static SimuInfo simulatedAnnealing(SimuInfo info0, Map<Integer, List<Order>> carMap, int tt, int now) {
		int time = 50000000; // 50ミリ秒
		Instant limit = Instant.now().plusNanos(time);
		Instant ins = Instant.now();
		SimuInfo temp = info0;
		SimuInfo ret = info0;
		int size = temp.his.size();
		int cmp = 0;
		while (ins.compareTo(limit) < 0) {
			SimuInfo info = new SimuInfo();
			info.tt = tt;
			info.goal = now;
			info.his = new ArrayList<>(size);
			info.his.addAll(temp.his);
			int i1 = (int) (Math.random() * (size - 1));
			int i2 = i1 + 1;
			if (cmp % 2 == 0) {
				i2 = (int) (Math.random() * size);
			}
			Collections.swap(info.his, i1, i2);
			for (int e : info.his) {
				info.goal = e;
				info.tt += dist[now][info.goal];
				if (info.tt > tmax) {
					break;
				}
				for (Order o : carMap.get(info.goal)) {
					int w = info.tt - o.time;
					info.val += tmax2 - w * w;
				}
				now = info.goal;
			}

			info.val -= (Math.min(info.tt, tmax) - tt) * K;
			ins = Instant.now();
			cmp = Long.compare(ins.getEpochSecond(), limit.getEpochSecond());
			if (cmp != 0) {
				cmp = 1000000000;
			}
			cmp += limit.getNano() - ins.getNano();
			if (info.val > temp.val || (int) (Math.random() * time) < cmp) {
				temp = info;
			}
			if (info.val > ret.val) {
				ret = info;
			}
		}
		if (temp.val > ret.val) {
			ret = temp;
		}
		return ret;
	}

	/**
	 * 引数の荷物を持って店に戻る途中で得た評価を計算
	 * @param carMap 荷物（途中で配達できたものは削除する）
	 * @param tt 出発時刻
	 * @param now 出発地点
	 * @return 結果
	 */
	static SimuInfo returnShop(Map<Integer, List<Order>> carMap, int tt, int now) {
		SimuInfo info = new SimuInfo();
		info.tt = tt;
		List<Integer> list = route[now][0];
		int valid = 0;
		for (int i = 1; i < list.size(); i++) {
			int next = list.get(i);
			info.tt += dist[list.get(i - 1)][next];
			if (info.tt > tmax) {
				break;
			}
			if (carMap.containsKey(next)) {
				valid += dist[list.get(i - 1)][next];
				for (Order o : carMap.get(next)) {
					int w = info.tt - o.time;
					info.val += tmax2 - w * w;
				}
				carMap.remove(next);
			}
		}
		info.val -= (Math.min(info.tt - valid, tmax) - tt) * K;
		return info;
	}

	/**
	 * 出発地点から最終目的地まで移動
	 */
	static void moveAll(int from, int to) throws Exception {
		List<Integer> list = route[from][to];
		for (int i = 1; i < list.size(); i++) {
			int d = move(list.get(i - 1), list.get(i));
			t += d;
		}
	}

	/**
	 * 地点から次の地点まで移動
	 */
	static int move(int from, int to) {
		int d = dist[from][to];
		d = Math.min(d, tmax - t);
		int to1 = to + 1;
		for (int i = 0; i < d; i++) {
			pw.println(to1);
		}
		return d;
	}

	static void dijkstra(int s) {
		Arrays.fill(dist[s], Integer.MAX_VALUE);
		dist[s][s] = 0;
		for (int i = 0; i < v; i++) {
			route[s][i] = new ArrayList<>();
		}
		route[s][s].add(s);
		PriorityQueue<Node> que = new PriorityQueue<Node>();
		Node first = new Node(s, 0);
		que.add(first);

		while (!que.isEmpty()) {
			Node cur = que.poll();
			for (Hen hen : nextList.get(cur.v)) {
				int alt = dist[s][cur.v] + hen.c;
				if (alt < dist[s][hen.v]) {
					dist[s][hen.v] = alt;
					route[s][hen.v].clear();
					route[s][hen.v].addAll(route[s][cur.v]);
					route[s][hen.v].add(hen.v);
					Node next = new Node(hen.v, alt);
					que.add(next);
				}
			}
		}
	}

	static class Hen {
		int v, c;

		public Hen(int v, int c) {
			this.v = v;
			this.c = c;
		}
	}

	static class Node implements Comparable<Node> {
		int v, d;

		public Node(int v, int d) {
			this.v = v;
			this.d = d;
		}

		public int compareTo(Node o) {
			return d - o.d;
		}
	}

	static class Order {
		int id, dst, time;
	}

	static class SimuInfo {
		long val;
		int tt, goal, hisIdx;
		List<Integer> his;
	}
}
