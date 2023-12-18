import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
 
import static java.util.Comparator.*;
 
public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Solver solver = new Solver(System.in, out);
        solver.solve();
        out.close();
    }
}
class Solver {
	Scanner sc;
	PrintWriter out;
    public Solver(InputStream in, PrintWriter out) {
    	sc = new Scanner(in);
    	this.out = out;
    }
    // ==================================================================
    Graph G = new Graph();
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int T = Integer.parseInt(sc.next()) - 1;
    	int A = Integer.parseInt(sc.next()) - 1;
    	int a, b;
    	for (int i = 0; i < N - 1; i++) {
			a = Integer.parseInt(sc.next()) - 1;
			b = Integer.parseInt(sc.next()) - 1;
			G.add(a, b);
			G.add(b, a);
    	}
        int[] DA = G.distV(A);
        int[] DT = G.distV(T);
        int max = 0;
        for (int i = 0; i < N; i++) {
			if(DA[i] > DT[i]) {
				max = Math.max(max, DA[i]);
			}
		}
        out.println(max - 1);
    }
    // -----------------------------------------
    // 重みなし　グラフのリンクリスト
    class Graph {
    	// 頂点に紐づく頂点のリスト
        private Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();
//        // 全ての頂点のセット
//        private Set<Integer> point = new TreeSet<>();
        // 頂点と頂点の繋がりを追加する
        void add(int from, int to) {
        	List<Integer> list = data.get(from);
        	if(list == null) {
        		list = new ArrayList<Integer>();
        		data.put(from, list);
        	}
        	list.add(to);
//        	point.add(from);
//        	point.add(to);
        }
        // 始点から終点が繋がっていれば切る
        void del(int from, int to) {
        	List<Integer> list = data.get(from);
        	if(list == null) {
        		return;
        	}
        	if(list.contains(to)) {
        		list.remove((Object)to);
        	}
        }
        // 指定された頂点に紐づく、頂点のリストを返す
        List<Integer> get(int key) {
        	return data.get(key);
        }
        // 頂点 key が登録されているか？
        boolean contains(int key) {
        	return data.containsKey(key);
        }
        
        //　頂点のセットを返す
        Set<Integer> keySet() {
        	return data.keySet();
        }
        // 頂点　key_1 と 頂点　key_2 がつながっていれば　true を返す
        boolean isConnect(int key_1, int key_2) {
        	List<Integer> list = data.get(key_1);
        	if(list == null)	return false;
        	else 				return list.contains(key_2);
        }
        // 指定された頂点から、すべての頂点への距離を返す(DFS O(N)）　→　返り値が　終点と距離のペア　のリスト
        List<PP> distList(int key) {
        	List<PP> dist = new ArrayList<>();		// 頂点と距離のペアのリスト
        	Set<Integer> mark = new HashSet<>();	// 処理したら入れる
			Stack<PP> stack = new Stack<>();		// スタックの宣言
			stack.push(new PP(key, 0));				// スタートをスタックに保存
			while(!stack.isEmpty()) {
				PP wk = stack.pop();				// スタックから次の頂点を取得
				int pp = wk.getKey();
				int dd = wk.getVal();
				mark.add(pp);						// 通過マーク
    			dist.add(new PP(pp, dd));			// 距離を登録
				List<Integer> list = get(pp);		// つながっている頂点のリストを取得
				for(int next : list) {
					if(mark.contains(next))	continue;
					stack.push(new PP(next, dd + 1));
				}
			}
			return dist;
        }
        // 指定された頂点から、すべての頂点への距離を返す(DFS O(N)）	→　返り値は配列
        int[] distV(int key) {
        	int[] dist = new int[data.keySet().size()+1];		// [頂点] = 距離
        	Arrays.fill(dist, -1);					// 届かない場合　-1
        	Set<Integer> mark = new HashSet<>();	// 処理したら入れる
			Stack<PP> stack = new Stack<>();		// スタックの宣言
			stack.push(new PP(key, 0));				// スタートをスタックに保存
			while(!stack.isEmpty()) {
				PP wk = stack.pop();				// スタックから次の頂点を取得
				int pp = wk.getKey();
				int dd = wk.getVal();
				mark.add(pp);						// 通過マーク
				dist[pp] = dd;						// 距離を登録
				List<Integer> list = get(pp);		// つながっている頂点のリストを取得
				for(int next : list) {
					if(mark.contains(next))	continue;
					stack.push(new PP(next, dd + 1));
				}
			}
			return dist;
        }
    	Map<Integer, Integer> mapCnt = new HashMap<>();		// 項番（何番目に訪れたか）
    	Map<Integer, Integer> mapLow = new HashMap<>();		// 初期値は項番、つながっている先の項番が小さければコピーする
															// mapCnt > mapLow なら閉路に含まれる頂点
    	Set<Integer> mark = new HashSet<>();				// 処理したら入れる
    	int number;
    	// mapCnt, mapLow を設定する
        int bridgeDfs(int now, int pre) {
//        	prn("bridgeDfs  now = " + now + " number = " + number);
        	mark.add(now);
        	mapCnt.put(now, number);
        	mapLow.put(now, number);
        	int low;
        	for(int next : get(now)) {
        		if(next == pre)		continue;
        		if(mark.contains(next)) {
        			if(mapLow.get(now) > mapLow.get(next)) {
//        				prn("  mapLow[" + now + "] = " + mapLow.get(now) 
//        						+ " > mapLow[" + next + "] = " + mapLow.get(next));
        				mapLow.put(now, mapLow.get(next));
        			}
        			continue;
        		}
        		number++;
        		low = bridgeDfs(next, now);
    			if(mapLow.get(now) > low) {
    				mapLow.put(now, low);
    			}
        	}
        	return mapLow.get(now);
        }
        // 橋の数を返す  先頭の頂点番号を引数とする
        int bridgeCnt(int start) {
        	mapCnt.clear();
        	mapLow.clear();
        	mark.clear();
        	number = 0;
        	bridgeDfs(start, start);
        	int ans = 0;
        	for(int key : mapCnt.keySet()) {
        		if(mapCnt.get(key) == mapLow.get(key)) {
        			ans++;
        		}
        	}
        	return ans - 1;
        }
        // ダンプ
        void dump(PrintWriter out) {
        	for(int key : data.keySet()) {
        		out.print(key + " : ");
        		for(int val : data.get(key)) {
        			out.print(val + " ");
        		}
        		out.println("");
        	}
        }
    }
    // Set に入れるなら　PPKEY　を使う！
    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
    }
}