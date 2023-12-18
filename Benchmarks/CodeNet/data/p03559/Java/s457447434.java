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
    //
    static class Solver {
    	
    	// ソートされている必要がある
    	int[] A = null;
    	int[] B = null;
    	int[] C = null;
    	
    	// index が条件を満たすかどうか	
    	boolean isOK(int index, int key, int[] a) {	
    	    if (a[index] >= key)	return true;		// upper_bound() との違いは　等号の有無　だけ
    	    else 					return false;	
    	}
    	// 汎用的な二分探索のテンプレ
    	// この場合、key 以上　で　一番左のインデックスを返す
    	int lower_bound(int key, int[] a, PrintWriter out) {
//    	    out.println("start lower_bound : key = " + key);
    	    int ng = -1; 				//「index = 0」が条件を満たすこともあるので、初期値は -1	
    	    int ok = (int)a.length; 	// 「index = a.length-1」が条件を満たさないこともあるので、初期値は a.length()	
    		
    	    /* ok と ng のどちらが大きいかわからないことを考慮 */	
    	    while (Math.abs(ok - ng) > 1) {	
    	        int mid = (ok + ng) / 2;	
    		
    	        if (isOK(mid, key, a)) 	ok = mid;	
    	        else 					ng = mid;
//    	        out.println("  ok = " + ok + "  ng = " + ng);
    	    }	
    	    return ok;	
    	}
    	
    	// index が条件を満たすかどうか	
    	boolean isOK2(int index, int key, int[] a) {	
    	    if (a[index] > key)	return true;		// upper_bound() との違いは　等号の有無　だけ
    	    else 					return false;	
    	}
    	// 汎用的な二分探索のテンプレ
    	// この場合、key 以上　で　一番左のインデックスを返す
    	int upper_bound(int key, int[] a, PrintWriter out) {
//    	    out.println("start lower_bound : key = " + key);
    	    int ng = -1; 				//「index = 0」が条件を満たすこともあるので、初期値は -1	
    	    int ok = (int)a.length; 	// 「index = a.length-1」が条件を満たさないこともあるので、初期値は a.length()	
    		
    	    /* ok と ng のどちらが大きいかわからないことを考慮 */	
    	    while (Math.abs(ok - ng) > 1) {	
    	        int mid = (ok + ng) / 2;	
    		
    	        if (isOK2(mid, key, a)) 	ok = mid;	
    	        else 					ng = mid;
//    	        out.println("  ok = " + ok + "  ng = " + ng);
    	    }	
    	    return ok;	
    	}
    	
    	public void solve(int testNumber, MyInput in, PrintWriter out) {
    		int N = in.nextInt();
    		A = new int[N];
    		B = new int[N];
    		C = new int[N];
    		for(int i=0; i < N; i++)	A[i] = in.nextInt();
    		for(int i=0; i < N; i++)	B[i] = in.nextInt();
    		for(int i=0; i < N; i++)	C[i] = in.nextInt();
    		Arrays.sort(A);
    		Arrays.sort(C);
    		
    		int cntA = 0;
    		int cntC = 0;
    		int ans = 0;
    		for(int i=0; i < N; i++) {
    			cntA = lower_bound(B[i], A, out);
    			cntC = upper_bound(B[i], C, out);
//       			out.println("1  key = " + B[i] + "  -->  cntA = " + cntA + " cntC = " + cntC);
       			ans += cntA * (N - cntC);
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
