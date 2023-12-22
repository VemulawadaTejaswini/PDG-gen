import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
		int[] value = new int[n];
		int[][] skill = new int[n][m];
		for(int i = 0; i < n; i++) {
			value[i] = sc.nextInt();
			for(int j = 0; j < m; j++) {
				skill[i][j] = sc.nextInt();
			}
		}
 		int ans = Integer.MAX_VALUE;
 		int[][] list = makeList(n);
		for(int r = 0; r < (int)Math.pow(2, n); r++) {
			int[] buy = list[r];
			int[] totalS = new int[m];
			int money = 0;
			for(int i = 0; i < n; i++) {
				money += buy[i]*value[i];
				for(int j = 0; j < m; j++) {
					totalS[j] += buy[i]*skill[i][j];
				}
			}
			boolean check = true;
			for(int i = 0; i < m; i++) {
				if(totalS[i] < x) {
					check = false;
					break;
				}
			}
			if(check && ans > money) {
				ans = money;
			}
		}
		if(ans == Integer.MAX_VALUE)ans = -1;
		System.out.println(ans);
	}
	
	static int[][] makeList(int n) {
		int all = (int)Math.pow(2, n);
		int[][] list01 = new int[all][n];
		for(int i = 0; i < all; i++) {
			Arrays.fill(list01[i], 0);
			int x = 0;
			int num = i;
			while(num >= 2) {
				list01[i][x] = num%2;
				x++;
				num = num/2;
			}
			list01[i][x] = num;
			x++;
		}
		return list01;
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
