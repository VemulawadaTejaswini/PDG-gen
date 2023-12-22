import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        System.out.print(String.valueOf(a + (int)Math.pow(a,2) + (int)Math.pow(a,3)));
    }
    /**
	 * 循環の長さを返します。
	 *
	 * @param arr
	 *            数列
	 * @param startPos
	 *            循環の開始位置
	 *
	 * @return 循環の長さを返します。循環を検出できなかった場合は-1を返します。
	 */
	private static int getCycle(int[] arr, int startPos) {
		int cycle = 0;
		int a = startPos;
		int b = startPos;
		while (true) {
			cycle++;
			a += 2;
			b++;
			if (a >= arr.length) {
				return -1;
			}
			if (arr[a] == arr[b]) {
				break;
			}
		}
		return cycle;
	}
    /**
	 * 循環の開始位置を返します。
	 *
	 * @param arr
	 *            数列
	 *
	 * @return 循環開始位置。循環を検出できない場合は-1を返します。
	 */
	private static int getStartPosition(int[] arr) {
		int a = 0;
		int b = 0;
		while (true) {
			a += 2;
			b++;
			if (a >= arr.length) {
				return -1;
			}
			if (arr[a] == arr[b]) {
				break;
			}
		}
		a = 0;
		while (true) {
			a++;
			b++;
			if (b >= arr.length) {
				return -1;
			}
			if (arr[a] == arr[b]) {
				break;
			}
		}
		return a;
	}
    public static Double calculate(Double base, Double n) {
        return Math.pow(Math.E, Math.log(base)/n);
    }

    public static int[] toArray(List<Integer> target) {

        final int[] result = new int[target.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }
    public static boolean isMultiple (String s, int base, int m) {
	int temp = 0;
	for (int i=0; i<s.length(); i++) {
		temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	}
	if (temp==0) {return true;}
	return false;
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
