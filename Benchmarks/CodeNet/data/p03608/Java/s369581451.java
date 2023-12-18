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

    static class Solver {
    	//return new distance matrix O(logV^3)
        public static int[][] warshallFloyd(int[][] distance, PrintWriter out){
            int node_number = distance.length;
            int[][] min_distance = new int[node_number][node_number];
            for(int i=0;i<node_number;i++) {
                for(int j=0;j<node_number;j++) {
                    min_distance[i][j] = distance[i][j];
                }
            }
            for(int via=0;via<node_number;via++) {
                for(int from=0;from<node_number;from++) {
                    for(int to=0;to<node_number;to++) {
//                    	out.println("min[" + from + "][" + to + "] = " + min_distance[from][to]);
//                    	out.println("min[" + from + "][" + via + "] = " + min_distance[from][via]);
//                    	out.println("min[" + via + "][" + to + "] = " + min_distance[via][to]);
                        min_distance[from][to] = Math.min(min_distance[from][to], min_distance[from][via]+min_distance[via][to]);
//                    	out.println("  -->  min[" + from + "][" + to + "] = " + min_distance[from][to]);
                    }
                }
            }
            return min_distance;
        }

        int[][] minDist;					// 頂点と頂点の最短距離
        int R;
		int[] r;
        boolean[] used = null;				// 使用済みのマーク
        int[] data = null;					// 作成中の順列の１つ
      						
        // 順列の作成　　　now : 現在の値　　depth : 現在の深さ						
        public int permutation(int now, int depth, PrintWriter out) {						
//        	out.println("start  now = " + now + "  depth = " + depth );					
        	if(depth == R) {				// できた順列の１つに対する処理	
//        	    for(int i = 0; i < R; i++)     out.print("[" + data[i] + "]");
//        	    out.println("");
        	    int wk = 0, sv = 0;
        		for(int i=0; i < R-1; i++) {
        			wk = minDist[data[i]-1][data[i+1]-1];
        			sv += wk;
//        			out.println("(data[" + i + "] -1 = " + (data[i]-1) + ") --> (data[" 
//           					+ (i+1) + "] - 1 = " + (data[i+1]-1) + ") = " + wk + "  ==>  sv = " + sv);
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
    		for(int i=0; i < R; i++) {
    			r[i] = in.nextInt();
    		}
    		int u, v, l;
    		int[][] dist = new int[N][N];
    		for(int i=0; i < M; i++) {
    			u = in.nextInt() - 1;
    			v = in.nextInt() - 1;
    			l = in.nextInt();
    			dist[u][v] = l;
    			dist[v][u] = l;
    		}
    		// ワーシャルフロイト
    		minDist = warshallFloyd(dist, out);
    		// 順列計算
    		used = new boolean[R];
    		data = new int[R];
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
