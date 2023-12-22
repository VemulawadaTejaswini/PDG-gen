import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	String s;
	public void solve() {
		s = next();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0;i < 10;i++){
			char[] ch = s.toCharArray();
			for(int j = 0;j < 12;j++)
				if(ch[j] == '?')
					ch[j] = (char)(i + '0');
			int digit = 0;
			for(int j = 11;j >= 1;j--){
				int Q = j >= 7 ? j - 5 : j + 1;
				digit += (ch[(11-j)]-'0') * Q;
			}
			digit %= 11;
			if(digit <= 1)digit = 0;
			else digit = 11 - digit;

			if(digit+'0' == ch[11])list.add(i);
		}

		if(list.size() > 1)out.println("MULTIPLE");
		else out.println(list.get(0));
	}

	public static void main(String[] args) {
		new Thread(null,new Main(),"",32 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}