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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

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
    // 2 <= H, W <= 50  : H = 行数　　W = 列数
    // C(y, x) :  . = 白（道）　　# = 黒（壁）
    //
    // (0,0) --> (H, W) に行く。白（道）を黒（壁）に最大いくつ変えられるか？
    // 元々たどり着けない場合は　-1 とする
    //
    // 最短経路を　幅優先探索(BFS)　で数えて、元の白（道）の数から引く
    //
    static class Solver {

    	int H, W, N;
    	char[][] c = null;											// 地図
    	int[][] f = null;											// 何番目かを保存（通ったかどうかのフラグも兼ねる）
    	int wcnt = 0;												// 最初の白の数
    	Queue<Pair<Integer, Integer>> que = new ArrayDeque<>();		// キュー
    	
    	// スタートとゴールの位置を受け取る
    	public int calc(int sy, int sx, int gy, int gx, PrintWriter out) {
    		int y, x;
    		Pair<Integer, Integer> p = null;
        	for(int i=0; i < H; i++) {		// 道の情報
        		for(int j=0; j < W; j++) {
        			f[i][j] = -1;
        		}
        	}
   			f[sy][sx] = 0;								// スタートの位置が　０

   			que.clear();
   			que.add(new Pair(sy, sx));					// スタートをキューに入れる
			while(que.peek() != null) {
				p = que.poll();
				y = p.getKey();
				x = p.getValue();
//				out.println(" y = " + y + "  x = " + x);
				if(y == gy && x == gx) {				// ゴールかの判定
//				    out.println(" goal  count = " + f[y][x]);
					break;
				}
														// 現在位置の上下左右が道で、通っていなければ　キューに入れる
    			if(y > 1 && c[y-1][x] != '#' && f[y-1][x] < 0) {
    				que.add(new Pair(y-1, x));
    				f[y-1][x] = f[y][x] + 1;			// 何番目を設定する
    			}
    			if(x > 1 && c[y][x-1] != '#' && f[y][x-1] < 0) {
    				que.add(new Pair(y, x-1));
    				f[y][x-1] = f[y][x] + 1;
    			}
    			if(x < W - 1 && c[y][x+1] != '#' && f[y][x+1] < 0) {
    				que.add(new Pair(y, x+1));
    				f[y][x+1] = f[y][x] + 1;
    			}
    			if(y < H - 1 && c[y+1][x] != '#' && f[y+1][x] < 0) {
    				que.add(new Pair(y+1, x));
    				f[y+1][x] = f[y][x] + 1;
    			}
			}
//			out.println("  -->  ans = " + f[gy][gx]);
    		return f[gy][gx];							// ゴールが何番目を返す
    	}
    	
    	public void solve(int testNumber, MyInput in, PrintWriter out) {
        	int ans = 0;
    		H = in.nextInt();				// 縦
    		W = in.nextInt();				// 横
        	c = new char[H][W];				// 地図
        	f = new int[H][W];				// 何番目かを保存（通ったかどうかのフラグも兼ねる）

        	String s = null;
        	for(int i=0; i < H; i++) {		// 道の情報
        		s = in.nextString();
        		for(int j=0; j < W; j++) {
        			c[i][j] = s.charAt(j);	// 地図を埋める
        			if(c[i][j] == '.') {	// 白（道）を数える
        				wcnt++;
        			}
        		}
        	}
//        	out.println("白 = " + wcnt);
        	ans = calc(0, 0, H-1, W-1, out);
        	if(ans != -1) {
        		ans = wcnt - 2 - (ans-1);   // 元の白の内２つはスタートとゴール、移動数にはゴールが含まれている
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
