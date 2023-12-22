import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	char[] c;
    char[] apple = {'a','p','p','l','e'};
    char[] peach = {'p','e','a','c','h'};
    Scanner cin;
    public void solve() {
        cin = new Scanner(System.in);
        c = cin.nextLine().toCharArray();
        for(int i = 0;i < c.length;i++){
             
            if(i + 4 < c.length){
                 
                boolean isApple = true;
                boolean isPeach = true;
                 
                for(int j = 0;j < apple.length;j++){
                    if(apple[j] != c[i + j]){
                        isApple = false;
                    }
                }
                 
                for(int j = 0;j < peach.length;j++){
                    if(peach[j] != c[i + j]){
                        isPeach = false;
                    }
                }
                 
                if(isApple){
                    for(int j = 0;j < peach.length;j++){
                        c[i + j] = peach[j];
                    }
                }else if(isPeach){
                    for(int j = 0;j < apple.length;j++){
                        c[i + j] = apple[j];
                    }
                }
                 
            }
        }
        out.println(String.valueOf(c));
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