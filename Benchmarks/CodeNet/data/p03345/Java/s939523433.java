import java.util.*;
import java.io.*;

	
class wangji {
	static long gcd(long x, long y) {return x == 0?y:gcd(y%x, x);}
	public static void main(String[] args) throws IOException {
		InputReader cin = new InputReader(System.in);
	    PrintWriter cout = new PrintWriter(System.out);
		long a, b, c, k;
		a = cin.nextLong();
		b = cin.nextLong();
		c = cin.nextLong();
		k = cin.nextLong();
		if(k%2 == 0)cout.println(a-b);
		else cout.println(b-a);
		cout.flush();
		cout.close();
	}
}
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
}
