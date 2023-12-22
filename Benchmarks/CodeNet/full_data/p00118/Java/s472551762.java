
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main implements Runnable {

	FastReader in = new FastReader();
	int h, w;
	char[][] field;
	int[][] pattern = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	//	static int[] dx = {0, 1,  0, -1};
	//    static int[] dy = {1, 0, -1,  0};

	public void run() {
		while (read()) {
			solve();
		}
	}

	public static void main(String[] args) {
		//		try {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start();
		//		} catch (InterruptedException e) {
		//			e.printStackTrace();
		//		}
	}

	public void solve() {
		int res = 0;
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				if (field[x][y] != '.') {
					dfs(x, y, field[x][y]);
					res++;
				}
			}
		}
		System.out.println(res);
	}

	public boolean read() {
		h = in.nextInt();
		w = in.nextInt();
		if (h == 0 && w == 0) {
			return false;
		}
	
		field = in.nextCharArray2D(h, w);
		return true;
	}

	public void dfs(int x, int y, char target) {
		//		if(x<0||y<0||x>=h||y>=w)return;
		field[x][y] = '.';
		//		for(int k = 0; k < 4; k++) {
		//            dfs(x + dx[k], y + dy[k], target);
		//        }
		for (int i = 0; i < 4; i++) {
			int dx = x + pattern[i][0];
			int dy = y + pattern[i][1];
			if (dx >= 0 && dx < w && dy >= 0 && dy < h && field[dx][dy] == target) {
				dfs(dx, dy, target);
			}
		}
	}
}

class FastReader {
    private InputStream in = System.in;
    private byte[] buf = new byte[1024];
    private int charNum;
    private int charLen;
    private StringBuilder sb = new StringBuilder();
 
    public int read() {
        if (charLen == -1)
            throw new InputMismatchException();
        if (charNum >= charLen) {
            charNum = 0;
            try {
                charLen = in.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (charLen <= 0)
                return -1;
        }
        return buf[charNum++];
    }
 
    public String next() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        sb.setLength(0);
        do {
            sb.appendCodePoint(c);
            c = read();
        } while (!isWhitespace(c));
        return sb.toString();
    }
 
    public char[] nextCharArray() {
        return next().toCharArray();
    }
 
    public char[][] nextCharArray2D(int h, int w) {
        char[][] array = new char[h][w];
        for(int i = 0; i < h; i++){
            array[i] = nextCharArray();
        }
        return array;
    }
 
    public int nextInt() {
        return (int) nextLong();
    }
 
    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();
        return array;
    }
  
    public int[][] nextIntArray2D(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++)
            array[i] = nextIntArray(m);
        return array;
    }
 
    public long nextLong() {
        int c = read();
        while (isWhitespace(c)) {
            c = read();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isWhitespace(c));
        return res * sgn;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
 
    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();
        return array;
    }
 
    public boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}