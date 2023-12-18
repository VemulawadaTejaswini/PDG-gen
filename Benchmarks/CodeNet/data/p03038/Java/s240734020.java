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
    MapCounter mc = new MapCounter(true);
    HashMap<Integer, Integer> map = new HashMap<>();
    public void solve() {
    	int N = Integer.parseInt(sc.next());
    	int M = Integer.parseInt(sc.next());
    	int a;
    	for (int i = 0; i < N; i++) {
    		a = Integer.parseInt(sc.next());
    		mc.add(a);
		}
    	int b, c;
    	for (int i = 0; i < M; i++) {
    		b = Integer.parseInt(sc.next());
    		c = Integer.parseInt(sc.next());
			mc.add(c, b);
		}
    	long ans = 0, wk;
		for(int key : mc.getKey()) {
			wk = mc.getCount(key);
//			out.println("N = " + N + "  値 = " + key + "  数　= " + wk);
			do {
				ans += (long)key;
				N--; wk--;
			} while(N > 0 && wk > 0);
			if(N <= 0)	break;
		}
    	out.println(ans);
    }
    class MapCounter {
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
   }
    class PP{
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

