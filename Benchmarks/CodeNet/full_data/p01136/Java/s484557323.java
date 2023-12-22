import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
	int N,M;
	ArrayList<Integer>[] list;
	@SuppressWarnings("unchecked")
	public void solve() {
		while(true){

			N = nextInt();
			if(N == 0)break;

			list = new ArrayList[30];
			for(int i = 0;i < 30;i++){
				list[i] = new ArrayList<Integer>();
			}

			for(int i = 0;i < N;i++){
				M = nextInt();
				for(int j = 0;j < M;j++){
					int day = nextInt() - 1;
					list[day].add(i);
				}
			}

			long[][] max = new long[30 + 1][N];
			for(int i = 0;i < N;i++){
				max[0][i] = (1L << i);
			}

			for(int i = 0;i < 30;i++){
				long sum = 0L;
				for(int n : list[i]){
					sum |= max[i][n];
				}
				for(int n : list[i]){
					max[i][n] |= sum;
				}

				long ans = 0L;

				for(int j = 0;j < N;j++){
					max[i + 1][j] = max[i][j];
				}

				for(int n : list[i]){
					ans |= max[i + 1][n];
				}

				if(ans == (1L << N) - 1){
					out.println(i + 1);
					return;
				}
			}
			out.println(-1);

		}
	}

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}