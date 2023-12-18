import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		String[] line = sc.nextLine().split(" ",0);
		int H = Integer.parseInt(line[0]);
		int W = Integer.parseInt(line[1]);
		int N = Integer.parseInt(line[2]);
		int[][] f = new int[H][W];
		String[] input;
		int a,b;
		int[] count = new int[10];
		int sum = 0;
		for (int i=0;i<N;i++) {
			input = sc.nextLine().split(" ",0);
			a = Integer.parseInt(input[0])-1;
			b = Integer.parseInt(input[1])-1;
			f[a][b] = 1;
		}
		for (int i=0;i<H-2;i++) {
			for (int j=0;j<W-2;j++) {
				sum = f[i][j] + f[i][j+1] + f[i][j+2] + f[i+1][j] + f[i+1][j+1] + f[i+1][j+2] + f[i+2][j] + f[i+2][j+1] + f[i+2][j+2];
				count[sum]++;
			}
		}
		for(int i: count) {
			System.out.println(i);
		}
	}

}

class FastScanner {
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