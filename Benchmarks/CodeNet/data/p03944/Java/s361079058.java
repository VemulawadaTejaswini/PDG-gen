import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args){
		FastScanner sc = new FastScanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		Point[] points = new Point[2];
		points[0] = new Point(0,0);
		points[1] = new Point(W,H);
		for (int i=0;i<N;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			switch (a) {
			case 1:
				if (x > points[0].x) {
					points[0].translate(x - points[0].x, 0);
				}
				break;
			case 2:
				if (x < points[1].x) {
					points[1].translate(x - points[1].x, 0);
				}
				break;
			case 3:
				if (y > points[0].y) {
					points[0].translate(0, y - points[0].y);
				}
				break;
			case 4:
				if (y < points[1].y) {
					points[1].translate(0, y - points[1].y);
				}
			default:
				break;
			}
		}
		int ans = (points[1].x -points[0].x)*(points[1].y-points[0].y);
		System.out.println(ans >= 0 ? ans : 0);
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