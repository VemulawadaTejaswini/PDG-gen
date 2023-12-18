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
		String[] moji_data = sc.next().split("");
		String moji="";
		int result_cnt=0;

		for(int i=0;i<q;i++) {
			// 開始位置、終了位置の取得
			int start = sc.nextInt();
			int end = sc.nextInt();
			for(int j=start-1;j<end;j++) {
				moji = moji_data[j];
				if(moji.equals("A") && j+1<end && moji_data[j+1].equals("C")) {
					result_cnt++;
					j=j+1;
				}
			}
	        printWriter.printf("%d\n", result_cnt);
            result_cnt=0;
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
