
import java.io.*;

/**
 * AIZU ONLINE JUDGE
 * 2711 Nearly Cyclic String
 *    2018/02/16
 */
public class Main {

	boolean main() throws IOException {

	    String S = systemin.readLine();
		int[] ir = readIntArray();
		int Q = ir[0];

		for(int q = 0; q < Q; q++) {

            ir = readIntArray();
            int l = ir[0];
            int r = ir[1];
            int t = ir[2];
            if (r - l + 1 -1 <= t) {
                result.printf("Yes\n");
            }
            else {
            //log.printf("%s %d %d %d\n", S, l, r, t);

            int dcnt = 0; // 変更が必要な文字数 1ならYes
            loop:for(int i = 0; i < t; i++) {
                int cnt2 = 0; // 2文字以上の文字の数
                
                // 初回
                int k = i + l;
                int ch = S.charAt(k - 1);
                int ac = 1; // 登録した文字の種類の数
                int ch0 = ch;
                int cnt0 = 1;
                int ch1 = 0;
                int cnt1 = 0;

                for(int j = 1;; j++) {
                    k = j * t + i + l;
                    if (k > r)
                        break;
                    ch = S.charAt(k - 1);
                    //log.printf("i=%d j = %d index = %d '%c'\n", i, j, k, ch);
                    if (/*ac > 0 &&*/ ch0 == ch) {
                        if (++cnt0 == 2) {
                            if (++cnt2 >= 2) {
                                dcnt = 99;
                                break loop;
                            }
                        }
                    }
                    else if (/*ac > 1 &&*/ ch1 == ch) {
                        if (++cnt1 == 2) {
                            if (++cnt2 >= 2) {
                                dcnt = 99;
                                break loop;
                            }
                        }
                    }
                    else if (ac == 2) {
                        dcnt = 99;
                        break loop;
                    }
                    else { // ac == 1
                        if (dcnt >= 1) {
                            dcnt = 99;
                            break loop;
                        }
                        ac = 2;
                        ch1 = ch;
                        cnt1 = 1;
                    }
                }
                if (ac == 2) {
                    if (++dcnt >= 2)
                        break loop;
                }
            } // loop
            //log.printf("dcnt = %d\n", dcnt);
            if (dcnt <= 1)
                result.printf("Yes\n");
            else
                result.printf("No\n");
            }
		}
        //return true; // 正常終了 次へ
		return false;
	}

	static long time0;

    PrintStream log;
    PrintStream result;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        result = System.out;
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

	public static void main(String[] args) throws IOException {

		int N = Integer.MAX_VALUE;
		//int N = readIntArray()[0];

		for(int i = 0; i < N; i++) {
			boolean b = instance.main();
			if (!b)
				break;
		}

        instance.systemin.close();
	}

	// 標準入力より1行分の区切り文字区切りでの整数値を読む
	// EOFの場合はnullを返す
	private int[] readIntArray() throws IOException {

		String s = null;
		for(;;) {
			s = systemin.readLine();
			if (s == null)
				return null;
			s = s.trim();
			if (s.length() != 0) // 突然空行を読むことがある。読み飛ばすとうまくいくらしい
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


