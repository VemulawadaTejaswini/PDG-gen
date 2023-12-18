import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// 初期化
		FastScanner sc = new FastScanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String moji_data = sc.next();
		for(int i=0;i<q;i++) {
			// 開始位置、終了位置の取得
			int start = sc.nextInt();
			int end = sc.nextInt();
			// 切り出し文字の取得
			String moji_substr = moji_data.substring(start-1,end);
			// 入力文字
			int moji_size=moji_substr.length();
			// 置換文字
			int replace_size=moji_substr.replace("AC", "").length();
			
			// 文字の件数の取得
			int taisyou_moji_num = (moji_size-replace_size)/"AC".length();
			
	        printWriter.printf("%d\n", taisyou_moji_num);
		}
        printWriter.close();
	}
	
	static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
             return Double.parseDouble(next());
         }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        } 
    }
}
