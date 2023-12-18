import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	int N;
	int[] T,A;
	public long gcd(long x,long y){
		return y == 0 ? x : gcd(y,x%y);
	}
	public long lcm(long x,long y){
		return x * y / gcd(x,y);
	}
	public void solve() {
		N = nextInt();
		T = new int[N];
		A = new int[N];
		for(int i = 0;i < N;i++){
			T[i] = nextInt();
			A[i] = nextInt();
		}

		long a = T[0];
		long b = A[0];

		for(int i = 1;i < N;i++){
			for(int x = 1;;x++){
				if(a <= T[i] * x && b <= A[i] * x){
					a = x * T[i];
					b = x * A[i];
					break;
				}
			}
		}
		out.println(a + b);
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