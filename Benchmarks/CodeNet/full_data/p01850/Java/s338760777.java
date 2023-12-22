
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2750 Hyakunin Isshu 百人一首
 *
 *    2018/02/08
 */
public class Main {


    //類似度
    int ruijido(String s0, String s1) {
        int i;
        for(i = 0;; i++) {
            if (i >= s0.length())
                break;
            if (i >= s1.length())
                break;
            if (s0.charAt(i) != s1.charAt(i))
                break;
        }
        return i;
    }
    
    //類似度の総和
    int sowa(String[] s) {
        int w = 0;
        for(int i = 0; i < s.length - 1; i++) {
            w += ruijido(s[i], s[i + 1]);
        }
        return w;
    }
    
    int sowa2(int[] a, String[] list) {
        int w = 0;
        for(int i = 0; i < a.length - 1; i++) {
            w += ruijido(list[a[i]], list[a[i + 1]]);
        }
        return w;
    }
    
    
	// メイン return falseでおしまい
	boolean main() throws IOException {

		int[] ir = readIntArray();
		int N = ir[0];
        if (N == 0)
            return false;
        log.printf("N = %d\n", N);

        String[] list = new String[N];
        
        for(int i = 0; i < N; i++) {
            list[i] = reader.readLine();
        }
        Arrays.sort(list);
        for(int i = 0; i < N; i++) {
           //log.printf("[%s]\n", list[i]);
        }

        int bestSowa = 999999999;
        int[] bestA = null;
        
        // 辞書順で全配列を作る
        boolean[] f = new boolean[N];
        int[] a = new int[N];
        
        int p = 0;
        int sowa2 = 0;
        boolean up = true;
        loop:for(;;) {
            int start;
            if (up) {
                start = 0;
            }
            else
                start = a[p] + 1;
                
            for(int i = start; i < N; i++) {
                if (!f[i]) {
                    f[i] = true;
                    a[p] = i;
                    if (p > 0)
                        sowa2 += ruijido(list[a[p-1]], list[a[p]]);
                    p++;
                    if (sowa2 >= bestSowa) {
                        break;
                    }
                    if (p >= N) {
                        int sowa = sowa2(a, list);
                        if (sowa < bestSowa) {
                            bestSowa = sowa;
                            bestA = Arrays.copyOf(a, a.length);
                            log.printf("best 完成 %s %d %d\n", Arrays.toString(a), sowa, sowa2);
                        }
                        break;
                    }
                    up = true;
                    continue loop;
                }
            }
            up = false;
            p--;
            if (p < 0)
                break;
            if (p > 0)
                sowa2 -= ruijido(list[a[p-1]], list[a[p]]);
            f[a[p]] = false;
        }

        // 表示
        for(int i = 0; i < a.length; i++) {
            System.out.printf("%s\n", list[bestA[i]]);
        }

		return true; // 正常終了 次へ
	}

	static long time0;
//	private final static boolean DEBUG = true;  // debug 　argsに何か書くとdebugになる
	private final static boolean DEBUG = false; // release

	public static void main(String[] args) throws IOException {

		if (DEBUG || args.length > 0) {
			log = System.out;

			String inputStr = "3:icpc:icfp:topcoder:"; // 1
			inputStr += "0:";

			inputStr = inputStr.replace(":", "\n");

//			reader = new BufferedReader(new StringReader(inputStr));
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("in17.txt")));
		}
		else {
			log = new PrintStream(new OutputStream() { public void write(int b) {} } ); // 書き捨て
//            log = System.out;
			reader = new BufferedReader(new InputStreamReader(System.in)); // コンソールから
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream("in.txt")));
		}

		time0 = System.currentTimeMillis();
		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = new Main().main();
			if (!b)
				break;
		}

        long time1 = System.currentTimeMillis();
        log.printf("end time = %.03fsec\n", (time1 - time0) / 1000.);
		reader.close();
	}


	static PrintStream log;
	static BufferedReader reader;


	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private static int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = reader.readLine();
//			log.printf("%s\n", s);
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // ※※※　どうも突然空行を読むことがある。読み飛ばすとうまくいくらしい。。。。
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



