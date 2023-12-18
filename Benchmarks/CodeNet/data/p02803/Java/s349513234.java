import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
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
	boolean[][] c = new boolean[50][50];						// データ(true が壁）
	Queue<PP> que = new ArrayDeque<>();							// キュー
	int[][] f = new int[50][50];								// 何番目かを保存（通ったかどうかのフラグも兼ねる）
	int H, W;
	
	// スタートとゴールの位置を受け取る
	public int calc(int sy, int sx, int gy, int gx) {
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				f[i][j] = -1;
			}
		}
		int y, x;
		PP p = null;
		f[sy][sx] = 0;								// スタートの位置が　０
		que.clear();
		que.add(new PP(sy, sx));					// スタートをキューに入れる
		while(que.peek() != null) {
			p = que.poll();
			y = p.getKey();
			x = p.getVal();
			if(y == gy && x == gx) {				// ゴールかの判定
				break;
			}
			
			if(y > 0 && !c[y-1][x] && f[y-1][x] < 0) {		// 現在位置の上下左右が道で、通っていなければ　キューに入れる
				que.add(new PP(y-1, x));
				f[y-1][x] = f[y][x] + 1;			// 何番目を設定する
			}
			if(x > 0 && !c[y][x-1] && f[y][x-1] < 0) {
				que.add(new PP(y, x-1));
				f[y][x-1] = f[y][x] + 1;
			}
			if(x < W-1 && !c[y][x+1] && f[y][x+1] < 0) {
				que.add(new PP(y, x+1));
				f[y][x+1] = f[y][x] + 1;
			}
			if(y < H-1 && !c[y+1][x] && f[y+1][x] < 0) {
				que.add(new PP(y+1, x));
				f[y+1][x] = f[y][x] + 1;
			}
		}
		return f[gy][gx];							// ゴールが何番目を返す
	}
    public void solve() {
    	H = ni();
    	W = ni();
    	String s;
    	for (int i = 0; i < H; i++) {
    		s = ns();
    		for(int j=0; j < W; j++) {
    			if(s.charAt(j) == '#') {
    				c[i][j] = true;		// 壁
    			}
    		}
		}
    	int ans = 0;
    	for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				for (int i2 = 0; i2 < H; i2++) {
					for (int j2 = 0; j2 < W; j2++) {
						if(c[i][j] && c[i2][j2])	continue;
						ans = Math.max(ans, calc(i, j, i2, j2));
					}
				}
			}
		}
		out.println(ans);
	}
    // -----------------------------------------
    // Integer のキーに対して、Integer のカウントを管理する（カウントを足したり、引いたりする）
    // キーの最大、最小の取得、データの追加、削除も O(long(N)) で処理できる
    //
    static class MapCounter {
    	private TreeMap<Integer, Integer> map;
    	// 昇順のマップ
    	public MapCounter() {
    		map = new TreeMap<>();
    	}
    	// reverse = tree なら降順のマップ
    	public MapCounter(boolean reverse) {
    		if(reverse) {
    			map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
    		} else {
        		map = new TreeMap<>();
    		}
    	}
    	// キーの存在チェック
		public boolean containsKey(Integer key) {
			return map.containsKey(key);
		}
   		// キーを追加する（キーが存在すれば、カウントに１足す）
    	public void add(Integer key) {
    		add(key, 1);
    	}
       	public void add(Integer key, int cnt) {
       		Integer val = map.get(key);
    		if(val == null) {
    			map.put(key, cnt);
    		} else {
    			map.put(key,  val + cnt);
    		}
    	}
    	// キーを消す（キーが存在すれば、カウントを１減らす）
    	public void remove(Integer key) {
    		sub(key, 1, false);
    	}
       	// キーのカウントを減らす
    	public void sub(Integer key) {
    		sub(key, 1);
    	}
    	// キーのカウントから値を引く（マイナスのカウントを許す）
    	public void sub(Integer key, int cnt) {
    		sub(key, cnt, true);
    	}
    	// キーのカウントから値を引く
    	//  →　マイナスを許可しない場合で、カウントがマイナスになったら消す
       	public void sub(Integer key, int cnt, boolean minus) {
    		Integer val = map.get(key);
    		if(val == null) {
    			if(minus) {
    				map.put(key, -cnt);				// カウントのマイナスを許す
    			}
    		} else if(val > cnt || minus){
   				map.put(key, val - cnt);
    		} else {
    			map.remove(key);
    		}
    	}
       	// キーのカウントを設定する
       	public void set(Integer key, int cnt) {
			map.put(key, cnt);
    	}
       	// キーのカウントを取得する（なければ　ＮＵＬＬを返す）
    	public Integer getCountwithNull(Integer key) {
    		return map.get(key);
    	}
    	// キーのカウントを取得する（なければ　０　を返す）
    	public Integer getCount(Integer key) {
    		Integer val = map.get(key);
    		if(val == null)		return 0;
    		else 				return val;
    	}
    	public Set<Integer> getKey() {
    		return map.keySet();
    	}
    	// 登録されているキーの数を返す
    	public int getKeyCount() {
    		return map.keySet().size();
    	}
    	// 先頭キーを返す
    	public Integer getFirstKey() {
    		return map.firstKey();
    	}
    	// 最終キーを返す
    	public Integer getLastKey() {
    		return map.lastKey();
    	}
    	// マップの初期化
    	public void clear() {
    		map.clear();
    	}
    	public TreeMap<Integer, Integer> getMap() {
    		return map;
    	}
    	// マップのコピー
    	public void copyFrom(MapCounter src) {
    		TreeMap<Integer, Integer> srcMap = src.getMap();
    		this.map.clear();
    		int val;
    		for (int key : srcMap.keySet()) {
    			val = srcMap.get(key);
    			this.map.put(key, val);
			}
    	}
   	}
    class PP {
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

    // ------------------------------------------
    // 入力
    // ------------------------------------------
    public int ni() {
    	return sc.nextInt();
    }
    public long nl() {
    	return sc.nextLong();
    }
    public String ns() {
    	return sc.next();
    }
    public char[] nc() {
    	return sc.next().toCharArray();
    }
    public int[] ndi(int N) {
    	int[] ans = new int[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ni();
		}
    	return ans;
    }
    public long[] ndl(int N) {
    	long[] ans = new long[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = nl();
		}
    	return ans;
    }
    public String[] nds(int N) {
    	String[] ans = new String[N];
    	for (int i = 0; i < N; i++) {
			ans[i] = ns();
		}
    	return ans;
    }
    public char[][] ndc(int N) {
    	char[][] ans = new char[N][];
    	for (int i = 0; i < N; i++) {
			ans[i] = nc();
		}
    	return ans;
    }
    public int[][] nddi(int N, int S) {
    	int[][] ans = new int[N][S];
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < S; j++) {
				ans[i][j] = ni();
			}
		}
    	return ans;
    }
}
