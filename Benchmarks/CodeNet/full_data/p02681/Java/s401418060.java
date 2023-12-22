import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		String S = sc.next();
		String T = sc.next();

		if(S.equals(T.substring(0,T.length() - 1)) && isHalfUpperAlphanumeric(T.substring(T.length() - 1))) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

	}

    public static boolean isHalfUpperAlphanumeric(String str) {
        return Pattern.matches("^[a-z]+$", str);
    }

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		}else{
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
}