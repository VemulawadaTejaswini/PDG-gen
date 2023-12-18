import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;				

public class Main {
	
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Solver solver = new Solver();
        solver.solve(1, in, out);
        
        out.close();
    }
    
    // ======================================================================

    // ダイクストラのアルゴリズム　→　重み付き有効グラフの単一始点最短経路
    static class DijkstraMatrix {
    	int[][] a;
    	boolean[] b;
    	PriorityQueue<int[]> q;

    	// 頂点の数を引数に初期化
    	public DijkstraMatrix(int n) {
    		a = new int[n + 1][n + 1];
    		b = new boolean[n + 1];
    		q = new PriorityQueue<int[]>(n + 1, new Comparator<int[]>() {
    			@Override
    			public int compare(int[] o1, int[] o2) {
    				return o1[1] - o2[1];
    			}
    		});
    	}
    	// 辺の登録
    	public void set(int i, int j, int cost) {
    		a[i][j] = cost;
    	}
    	// コスト計算
    	public int getCost(int s, int e) {
    		Arrays.fill(b, false);
    		q.clear();
    		b[s] = true;
    		for (int i = 1; i < a.length; ++i)
    			if (a[s][i] > 0)
    				q.add(new int[] { i, a[s][i] });
    		int c = 0;
    		while (!q.isEmpty()) {
    			int[] t = q.poll();
    			if (t[0] == e) {
    				c = t[1];
    				break;
    			}
    			b[t[0]] = true;
    			for (int i = 1; i < a.length; ++i)
    				if (!b[i] && a[t[0]][i] > 0)
    					q.add(new int[] { i, t[1] + a[t[0]][i] });
    		}
    		return c;
    	}
    }

    static class Solver {
		int R;
		int[] r;
        boolean[] used = null;				// 使用済みのマーク
        int[] data = null;					// 作成中の順列の１つ
		DijkstraMatrix dijkst;
      						
        // 順列の作成　　　now : 現在の値　　depth : 現在の深さ						
        public int permutation(int now, int depth, PrintWriter out) {						
//        	out.println("start  now = " + now + "  depth = " + depth );					
        	if(depth == R) {				// できた順列の１つに対する処理	
//        	    for(int i = 0; i < R; i++)     out.print("[" + data[i] + "]");
//        	    out.println("");
        	    int wk = 0, sv = 0;
        		for(int i=0; i < R-1; i++) {
        			wk = dijkst.getCost(data[i], data[i+1]);
//        			out.println("(data[" + i + "] = " + data[i] + ") --> (data[" 
//       					+ (i+1) + "] = " + data[i+1] + ") = " + wk + "  ==>  sv = " + sv);
        			sv += wk;
        		}
//        		out.println("  return sv = " + sv);
        		return sv;
        	}
        	int ans = 999999999;					
        	for(int i=0; i < R; i++) {
        		if(!used[i]) {				
        			used[i] = true;				//　使用済みとする
        			data[depth] = r[i];
        			ans = Math.min(ans, permutation(i, depth + 1, out));			
        			used[i] = false;			// 戻す
        		}				
        	}					
//        	out.println("end  now = " + now + "  depth = " + depth + "  ans = " + ans);					
        	return ans;					
        }						

    	
        public void solve(int testNumber, MyInput in, PrintWriter out) {
    		int N = in.nextInt();
    		int M = in.nextInt();
    		R = in.nextInt();
    		r = new int[R];
    		used = new boolean[R];
    		data = new int[R];
    		for(int i=0; i < R; i++) {
    			r[i] = in.nextInt();
    		}
    		// ダイクストラの初期化
    		dijkst = new DijkstraMatrix(N);
    		int u, v, l;
    		for(int i=0; i < M; i++) {
    			u = in.nextInt();
    			v = in.nextInt();
    			l = in.nextInt();
    			dijkst.set(u, v, l);
    			dijkst.set(v, u, l);
    		}
    		int ans = permutation(0, 0, out);			// 呼び出し			
    		out.println(ans);
        }
    }

    static class PPP {
    	public int key, val;
    	public PPP(int key, int val) {
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
    // ======================================================================
    static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }
     }    
    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];
 
        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }
 
        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }
 
        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }
 
        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }
 
        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0L;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }
 
       public String nextString() {
        	String ret = new String(nextDChar()).trim();
            return ret;
        }
 
        public char[] nextDChar() {
            int len = 0;
            len = reads(len, isSpace);
            char[] ret = new char[len + 1];
            for (int i=0; i < len; i++)		ret[i] = str[i];
            ret[len] = 0x00;
            return ret;
        }
 
        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }
 
        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }
 
        static class EndOfFileRuntimeException extends RuntimeException {
        }
    }
}
