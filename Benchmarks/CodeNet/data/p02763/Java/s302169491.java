import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
        main.out.close();
    }
    // ======================================================================
    TreeSet<Integer>[] setD = new TreeSet[(int)('z'-'a' + 1)];
    public void solve() {
    	int N = ni();
    	char[] S = ns().toCharArray();
    	for (int i = 0; i < setD.length; i++) {
			setD[i] = new TreeSet<Integer>();
		}
    	for (int i = 0; i < N; i++) {
			setD[(int)(S[i]-'a')].add(i);
		}
    	int Q = ni();
    	int cmd, no, wk,  l, r, ans;
    	Integer ll, rr;
    	char c;
    	for (int i = 0; i < Q; i++) {
			cmd = ni();
			if(cmd == 1) {
				no = ni() - 1;
				c = ns().charAt(0);
				wk = (int)(S[no] - 'a');	// 元の文字を削除する
				setD[wk].remove(no);
//				out.println("削除した　　[" + no + "]["+ S[no] + "]  -->  " + setD[wk].toString());
				wk = (int)(c - 'a');		// 新しい文字を登録する
				setD[wk].add(no);
				S[no] = c;
//				out.println("追加した　　[" + no + "][" + S[no] + "]  -->  " + setD[wk].toString());
			} else {
				l = ni() - 1;
				r = ni() - 1;
				ans = 0;
				for (int j = 0; j < setD.length; j++) {
					ll = setD[j].ceiling(l);	// l 以上の最小値
					rr = setD[j].floor(r);		// r 以下の最大値
					if(ll == null || rr == null)	continue;
					if(ll > r || rr < l)			continue;
					ans++;
//					out.println("[" + String.valueOf((char)('a' + j)) 
//							+ "]  (l = " + l + ") <= (ll = " + ll 
//							+ ")  (rr = " + rr + ") <= (r = " + r + ")");
				}
				out.println(ans);
			}
		}
    }
    // --------------------------------------
    // Integer のキーに対して、Integer のリストを管理する
    class MapList {
    	private HashMap<Integer, List<Integer>> map;
    	// 昇順のマップ
    	public MapList() {
    		map = new HashMap<>();
    	}
    	// 初期化
    	public void clear() {
    		map.clear();
    	}
    	// 値の追加
    	public void add(Integer key, Integer val) {
    		List<Integer> list = map.get(key);
    		if(list == null) {
    			list = new ArrayList<>();
    			map.put(key, list);
    		}
    		list.add(val);
    	}
    	// 値の削除
    	public void del(Integer key, Integer val) {
    		List<Integer> list = map.get(key);
    		if(list == null)	return;
    		list.remove(val);
    		if(list.isEmpty())	map.remove(key);
    	}
    	// データが空か？
    	public boolean isEmpty() {
    		return map.isEmpty();
    	}
    	// キーセットを返す
    	public Set<Integer> keySet() {
    		return map.keySet();
    	}
    	// キーの要素があれば　true を返す
    	public boolean contains(Integer key) {
    		if(map.get(key) == null)	return false;
    		else						return true;
    	}
    	// リストの取得（なければ　null を返す）
    	public List<Integer> getList(Integer key) {
    		return map.get(key);
    	}
    	// ダンプ
    	public void dump() {
    		List<Integer> list;
    		out.println("------------ dump start -------------");
    		for(int key : map.keySet()){
    			list = map.get(key);
    			out.println("key = " + key);
    			for (int val : list) {
					out.print(" " + val);
				}
    			out.println("");
    		}
    		out.println("------------ dump end -------------");
    	}
    }
	class UnionFind {
		int[] par;	    			// [子番号] = 親番号(親の場合、メンバ数のマイナス値)
									// [1]=3 [2]=-1 [3]=-2  なら　１　と　３　は　同じグループ
		public UnionFind(int n) {
			par = new int[n];
			Arrays.fill(par, -1);	// 全部が親で、メンバ数を　１　とする
		}
		// 親の番号を返す（この中で親に直接つなぎ変えている）
		int root(int x) {			
			if(par[x] < 0)     	return x;	// 親の場合はマイナスが入っている
			else                return par[x] = root(par[x]);
		}
		// 同じグループなら true を返す
		boolean same(int x, int y) {	
			return root(x) == root(y);
		}
		// グループ数を返す
		int groupCnt() {
			int ans = 0;
			for(int i = 0; i < par.length; i++) {
				if(par[i] < 0)	ans++;
			}
			return ans;
		}
		// メンバ数を返す
		int size(int x) {
			return -par[root(x)];
		}
		// メンバのリストを返す
		List<Integer> member(int x) {
			List<Integer> ans = new ArrayList<>();
			int root = root(x);
			for (int i = 0; i < par.length; i++) {
				if(root(i) == root) {
					ans.add(i);
				}
			}
			return ans;
		}
		// 同じ親につなげる
		void connect(int x, int y) {	
			x = root(x);			// 親を取得する
			y = root(y);			// 親を取得する
			if(x == y)  return;		// 同じなので処理しない
			if(size(x) > size(y)) {	// メンバ数が多い方にくっつける
				par[x] += par[y];	//   メンバ数を更新する
				par[y] = x;			//   親番号を設定する
			} else {
				par[y] += par[x];
				par[x] = y;
			}
		}
		void dump(PrintWriter out) {
			for(int i = 0; i < par.length; i++) {
			    out.println("par[" + i + "] = " + par[i]);
			}
			out.println("");
		}
	}
    // ------------------------------------------
    // ライブラリ
    // ------------------------------------------
    // Print
	private PrintWriter out = new PrintWriter(System.out);

    // Scanner
    private FastScanner scan = new FastScanner();
    int ni(){ return scan.nextInt();}
    int[] ni(int n){int[] a = new int[n]; for(int i = 0; i < n; i++){a[i] = ni();} return a;}
    int[][] ni(int y, int x){int[][] a = new int[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ni();}} return a;}
    long nl(){return scan.nextLong();}
    long[] nl(int n){long[] a = new long[n]; for(int i = 0; i < n; i++){a[i] = nl();} return a;}
    long[][] nl(int y, int x){long[][] a = new long[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = nl();}} return a;}
    String ns(){return scan.next();}
    String[] ns(int n){String[] a = new String[n]; for(int i = 0; i < n; i++){a[i] = ns();} return a;}
    String[][] ns(int y, int x){String[][] a = new String[y][x];
        for(int i = 0; i < y; i++){for(int j = 0; j < x; j++){a[i][j] = ns();}} return a;}
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
