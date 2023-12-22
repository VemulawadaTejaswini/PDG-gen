
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2805 Tournament
 *    2018/02/11
 */
public class Main {


	// メイン return falseでおしまい
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int N = ir[0];
		int M = ir[1];

		log.printf("N,M = %d, %d\n", N, M);

		int[] a = new int[N];
		for(int i = 0; i < M; i++) {
	        ir = readIntArray();
            a[ir[0]] = 1;
	        log.printf("a = %d\n", ir[0]);
		}
		int cnt = 0;
		for(int n = N; n > 0; n /= 2) {
		    for(int i = 0; i + 1 < n; i += 2) {
		        if (a[i] == 0 && a[i + 1] == 0) {
		            cnt++;
		        }
		        int t = 0;
                if (a[i] != 0 && a[i + 1] != 0) {
                    t = 1;
                }
		        a[i / 2] = t;
		    }
		}

		result.printf("%d\n", cnt);

		return true; // 正常終了 次へ
	}



	static long time0;
	private final static boolean DEBUG = false; // release

    PrintStream log;
    PrintStream result;
    BufferedReader systemin;
    PrintStream DEVNULL = new PrintStream(new OutputStream() { public void write(int b) {} } );

    static Main instance = new Main();

    Main() {
        log = DEVNULL;
        systemin = new BufferedReader(new InputStreamReader(System.in)); // コンソールから
        result = System.out;
    }

	public static void main(String[] args) throws IOException {

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

//		for(int i = 0; i < N; i++) {
			boolean b = instance.main();
//			if (!b)
//				break;
//		}

        instance.systemin.close();
	}


	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = systemin.readLine();
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // 突然空行を読むことがある。読み飛ばすとうまくいくらしい。。。。
				break;
		}

		String[] sp = s.split("[ ,]"); // 区切り文字はスペースかカンマ
		int[] a = new int[sp.length];
		for(int i = 0; i < sp.length; i++) {
			a[i] = Integer.parseInt(sp[i]);
		}
		return a;
	}

}




