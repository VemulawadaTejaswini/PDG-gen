import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
import java.util.Queue;
import java.util.Set;
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
    // 縦 H, 横 W の表が　黒　と　白　で塗られている
    // 一回の操作で　黒の上下左右は黒くなる
    // 全てが黒くなるには　何回操作する必要があるか？
    //
    // 複数ある　黒　を起点に、並行に処理を一回づつ行っていき
    // すべてが黒くなれば終わり　→　複数起点の幅優先探索となる（by けんちょん)
    
    static class Solver {
    	int[] dx = {1, 0, -1, 0};
    	int[] dy = {0, 1, 0, -1};
    	
    	int H, W;
    	char[][] c = null;											// 地図
    	int[][] f = null;											// 何番目かを保存（通ったかどうかのフラグも兼ねる）
    	Queue<Pair<Integer, Integer>> que = new ArrayDeque<>();		// キュー
    	
    	// f[][] に　黒からの競をを設定する　幅優先探索処理
    	public void calc(PrintWriter out) {
    		int y=0, x=0;
    		Pair<Integer, Integer> p = null;
    		int nx, ny;
    		while(que.peek() != null) {
    			p = que.poll(); y = p.getKey();	x = p.getValue();
//    			out.println("  y = " + y + "  x = " + x);

    			// 現在位置の上下左右で、通っていなければ　キューに入れる
    	        for (int dir = 0; dir < 4; ++dir) {
    	            nx = x + dx[dir]; ny = y + dy[dir];
    	            if (nx < 0 || nx >= W || ny < 0 || ny >= H) continue;
    	            if(f[ny][nx] == -1) {
    	                f[ny][nx] = f[y][x] + 1;		// 最初にたどりついた回数が　答え（書き換えることはない）
    	                que.add(new Pair(ny, nx));
//    	                out.println("distance[" + ny + "][" + nx + "] = " + f[ny][nx]);
    	            }
    	        }
    		}
    	}
        
    	public void solve(int testNumber, MyInput in, PrintWriter out) {
    		H = in.nextInt();
    		W = in.nextInt();
    		c = new char[H][W];
    		f = new int[H][W];
    		String s;
    		for(int i=0; i < H; i++) {
       			s = in.nextString();
           		for(int j=0; j < W; j++) {
           			c[i][j] = s.charAt(j);
        			if(c[i][j] == '#') {				// 黒を開始位置とする
        				f[i][j] = 0;					// 開始位置の回数は　０
        	   			que.add(new Pair(i, j));		// スタートをキューに入れる
//        	   			out.println("black [" + i + "][" + j + "]");
        			} else {
        				f[i][j] = -1;
        			}
           		}
    		}
    		calc(out);			// 幅優先探索
    		
    		int ans = 0;
    		for(int i=0; i < H; i++) {
           		for(int j=0; j < W; j++) {
           			ans = Math.max(ans,  f[i][j]);
           		}
    		}
    		out.println(ans);
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
