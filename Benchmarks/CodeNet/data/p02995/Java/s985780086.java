import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		long a,b,c,d;
		a=in.nextLong();
		b=in.nextLong();
		c=in.nextLong();
		d=in.nextLong();
		long cka = (long)Math.floor(b/(double)c) - (long)Math.ceil(a/(double)c) + 1;
		long dka = (long)Math.floor(b/(double)d) - (long)Math.ceil(a/(double)d) + 1;
		BigInteger bigc = BigInteger.valueOf(c);
		BigInteger bigd = BigInteger.valueOf(d);
		long gc = (bigc.gcd(bigd)).intValue();
		long lc = (long)((double)(c*d)/gc);
		long dcka = (long)(Math.floor(b/(double)lc) - Math.ceil(a/(double)lc) + 1.0);
		out.println(b-a+1-cka-dka+dcka);
        out.close();
	}
    static class InputReader {
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

}