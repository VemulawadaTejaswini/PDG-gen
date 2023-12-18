import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		String s = sc.next();
		boolean flag = false;
		
		int len = s.length();
		while (len > 0) {
			if (len > 7) {
				if (s.substring(len - 7, len).equals("dreamer")) {
					len -= 7;
				} else if (s.substring(len - 6, len).equals("eraser")) {
					len -= 6;
				} else {
					String ss = s.substring(len - 5, len);
					if (ss.equals("erase") || ss.equals("dream")) {
						len -= 5;
					} else {
						break;
					}
				}
			} else if (len == 7) {
				if (s.substring(0, len).equals("dreamer")) {
					flag = true;
				}
				break;
			} else if (len == 6) {
				if (s.substring(0, len).equals("eraser")) {
					flag = true;
				}
				break;
			} else if (len == 5) {
				String ss = s.substring(0, len);
				if (ss.equals("dream") || ss.equals("erase")) {
					flag = true;
				}
				break;
			} else if (len < 5) {
				break;
			}
		}
		
		out.println(flag ? "YES" : "NO");
		out.flush();
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
		} else {
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
	
	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	
	private boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}
	
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
	
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
}