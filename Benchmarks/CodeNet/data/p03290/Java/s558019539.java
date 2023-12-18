import java.io.BufferedReader;

import static java.util.Comparator.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
	// 入力　：　1 <= D <= 10 : 問題の種類の数　　100 < G : 目標の点数
	//       1 <= pi <= 100  : 100 * i 点の問題数( 1 <= i <= D )
	//       1 <= ci <= 10^6 : i 番の問題を全部解いた時のボーナス
	//
	// 目標点数を超えるには最低何問解く必要があるか？
	// 
	// 最大１０種類なので、問題を全部解く／解かないを　１０ビットの　０／１　に対応させる。
	// 選択した全部解くの合計で足りない場合は、残りの中で一番大きな点数のものを解いていき
	// 足りなければ、問題を全部解くの選択が間違っているので、次へ進む
    static class Solver {

    	int[] p = null;		// 問題数
		int[] c = null;		// ボーナス点
		int[] sub = null;	// 各ランクの全完の点数

    	public void solve(int testNumber, MyInput in, PrintWriter out) {
			int ans = 999999;
			int D = in.nextInt();
			int G = in.nextInt();
			p = new int[D];
			c = new int[D];
			sub = new int[D];
			for(int i=0; i < D; i++){
				p[i] = in.nextInt();
				c[i] = in.nextInt();
				sub[i] = (i+1) * 100 * p[i] + c[i];
			}
			
			int total = 0;
			int cnt = 0;
			int b_cnt = 0;
			int wk = 0;
			for(int i = 0; i < (1 << D); i++) {		// シフト数　繰り返す
//			    out.println("i = " + i);
				total = 0;
				cnt = 0;
				b_cnt = -1;							// 合計していない中の最上位ランクを設定する
				for(int j=0; j < D; j++) {
					if((i & (1 << j)) != 0) {		// ビットが立っていれば、ランクの点数を足す
						total += sub[j];
						cnt += p[j];
//					    out.println("j = " + j + "  total = " + total + "  cnt = " + cnt);
					} else {
						b_cnt = j;					// ビットが立っていないので保存する（大きい値が残る）
					}
				}
				if(total >= G) {					// 足りていれば　解いた問題数を比較する
					ans = Math.min(ans, cnt);
				} else if(b_cnt != -1) {			// 空いている最上位ランクがあれば
//				    out.println("  b_cnt = " + b_cnt + "  (G - total) = " + (G - total) + "  p[" + b_cnt + "] = " + p[b_cnt]);
                    // for(int k=0; k < p[b_cnt]; k++) {
                    //     total += (b_cnt + 1)  * 100;
                    //     if(total >= G) {
                    //         ans = Math.min(ans, cnt + k + 1);
                    //         break;
                    //     }
                    // }
					if((G - total) <= ((b_cnt + 1) * p[b_cnt] * 100) ) {
					    wk = (G - total)/((b_cnt + 1) * 100);
					    if((G - total) > (wk * (b_cnt + 1) * 100)) {
					        wk++;
					    }
						ans = Math.min(ans, cnt + wk);
					}
				}
//				out.println("ans = " + ans);
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
        public String getString() {
            return "[" + getKey() + "] [" + getValue() + "]";
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
