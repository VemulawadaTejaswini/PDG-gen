// ABC112

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;


/** C */
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();

		double[] A = new double[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextDouble();
		}
		Arrays.sort(A);
		ArrayDeque<Double> deq = new ArrayDeque<>();
		ArrayDeque<Double> deq2 = new ArrayDeque<>();
		for(int i = 0; i < N; i++) {
			deq.offerLast(A[i]);
			deq2.offerLast(A[i]);
		}

		double [] X = new double[N];
		double sum1 = 0;

		// 真中が最小パタン
		// kisu
		if(N % 2 == 1) {
			int cen = (N / 2); // center (0 origin)
			X[cen] = deq.pollFirst();

			for(int i = 0; i < (N / 2); i++) {
				if(i % 2 == 0) {
					X[cen + 1 + i] = deq.pollLast();
					X[cen - 1 - i] = deq.pollLast();
				}else{
					X[cen + 1 + i] = deq.pollFirst();
					X[cen - 1 - i] = deq.pollFirst();
				}

				sum1 += Math.abs(X[cen - 1 - i] - X[cen - i]) + Math.abs(X[cen + 1 + i] - X[cen + i]);
			}

		}else {
			// gusu
			int cen = (N/2) -1;
			X[cen] = deq.pollFirst();
			for(int i = 0; i < (N / 2) -1; i++) {
				if(i % 2 == 0) {
					X[cen + 1 + i] = deq.pollLast();
					X[cen - 1 - i] = deq.pollLast();
				}else{
					X[cen + 1 + i] = deq.pollFirst();
					X[cen - 1 - i] = deq.pollFirst();
				}

				sum1 += Math.abs(X[cen - 1 - i] - X[cen - i]) + Math.abs(X[cen + 1 + i] - X[cen + i]);
			}
			double tmp = deq.pollLast();
			if(Math.abs(tmp - X[0]) > Math.abs(tmp - X[N-2])) {
				sum1 += Math.abs(tmp - X[0]);
			}else{
				sum1 += Math.abs(tmp - X[N-2]);
			}
		}

		// 真ん中が最大パタン
		double [] Y = new double[N];
		double sum2 = 0;
		// kisu
		if(N % 2 == 1) {
			int cen = (N / 2); // center (0 origin)
			Y[cen] = deq2.pollLast();

			for(int i = 0; i < (N / 2); i++) {
				if(i % 2 == 1) {
					Y[cen + 1 + i] = deq2.pollLast();
					Y[cen - 1 - i] = deq2.pollLast();
				}else{
					Y[cen + 1 + i] = deq2.pollFirst();
					Y[cen - 1 - i] = deq2.pollFirst();
				}

				sum2 += Math.abs(Y[cen - 1 - i] - Y[cen - i]) + Math.abs(Y[cen + 1 + i] - Y[cen + i]);
			}

		}else {
			// gusu
			int cen = (N/2) -1;
			Y[cen] = deq2.pollLast();
			for(int i = 0; i < (N / 2) -1; i++) {
				if(i % 2 == 1) {
					Y[cen + 1 + i] = deq2.pollLast();
					Y[cen - 1 - i] = deq2.pollLast();
				}else{
					Y[cen + 1 + i] = deq2.pollFirst();
					Y[cen - 1 - i] = deq2.pollFirst();
				}

				sum2 += Math.abs(Y[cen - 1 - i] - Y[cen - i]) + Math.abs(Y[cen + 1 + i] - Y[cen + i]);
			}
			double tmp = deq2.pollFirst();
			if(Math.abs(tmp - Y[0]) > Math.abs(tmp - Y[N-2])) {
				sum2 += Math.abs(tmp - Y[0]);
			}else{
				sum2 += Math.abs(tmp - Y[N-2]);
			}
		}



		//************************************/
		// ここから出力処理
		//************************************/
		PrintWriter out = new PrintWriter(System.out);

		double ans;
		if(sum1 > sum2) {
			ans = sum1;
		}else {
			ans = sum2;
		}
		String ansString = String.format(BigDecimal.valueOf(ans).toPlainString());

		out.println(ansString.substring(0, ansString.length() - 2));

		// 最後に必ずFlush
		out.flush();
	}
}


///** B */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int K = sc.nextInt();
//
//
//		for(int i = 0; i < K; i++){
//			if(i % 2 == 0) {
//				// takahashi
//				if(A % 2 == 1){
//					A--;
//				}
//				B =  B + (A/2);
//				A /= 2;
//			}else {
//				// aoki
//				if(B % 2 == 1){
//					B--;
//				}
//				A += (B/2);
//				B /= 2;
//			}
//		}
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println(A + " " + B);
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

// prm A
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		String S = sc.next();
//
//
////		int N = sc.nextInt();
////		int M =  sc.nextInt();
////
////		int[] ary = new int[N];
////		for(int i = 0; i < N; i++) {
////			ary[i] = sc.nextInt();
////		}
//
//
////		Queue<Integer> q = new ArrayDeque<>();
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//		if(S.length() == 2) {
//			out.println(S);
//		}else {
//			StringBuffer sb = new StringBuffer(S);
//			out.println(sb.reverse().toString());
//		}
//
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}


///** テンプレート */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//		int M =  sc.nextInt();
//
//		int[] ary = new int[N];
//		for(int i = 0; i < N; i++) {
//			ary[i] = sc.nextInt();
//		}
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println("hoge");
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

/** スキャン用 */
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    /** クラス内部用だよ */
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

    /** クラス内部用だよ */
    private int readByte() {
    	if (hasNextByte()) {
    		return buffer[ptr++];
    	}else {
    		return -1;
    	}
    }

    /**
     * クラス内部用だよ
     * ASCII の文字の内、表示用の文字を返す関数
     *
     * @return 改行とか制御文字じゃない、表示用文字ならtrue
     * */
    private static boolean isPrintableChar(int c) {
    	return 33 <= c && c <= 126;
    }

    /**
     * @return 改行文字とか空白以外を除いた、次の文字があればtrue
     * */
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr])) {
    		ptr++;
    	}
    	return hasNextByte();
    }

    /**
     *
     * @return 次の文字列
     */
    public String next() {
        if (!hasNext()) {
        	throw new NoSuchElementException();
        }

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    /**
     *
     * @return 次のLong
     */
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

    /**
     *
     * @return 次のInt
     */
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    /**
     *
     * @return 次のDouble
     */
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

