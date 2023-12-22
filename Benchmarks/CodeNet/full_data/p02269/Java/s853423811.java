import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>();
		
		int n = nextInt();
		
		for (int i = 0; i < n; i ++) {
			next();
			if (nextbuf[0] == 'i') {
				next();
				dictionary.add(new String(nextbuf, 0, nextlen));
			} else {
				next();
				if (dictionary.contains(new String(nextbuf, 0, nextlen))) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
	
	private static byte[] buf = new byte[1 << 20];
	private static int len = 0;
	private static int ptr = 0;
	
	private static byte read() {
		if (ptr >= len) {
			try {
				len = System.in.read(buf);
			} catch (Exception e) {
			}
			ptr = 0;
		}
		
		return buf[ptr++];
	}
	
	private static int nextInt() {
		int num = 0;
		
		byte b = read();
		while(!Character.isDigit(b)) b = read();
		while(Character.isDigit(b)) {
			num *= 10;
			num += b - '0';
			b = read();
		}
		
		return num;
	}
	
	private static byte[] nextbuf = new byte[11];
	private static int nextlen;
	
	private static void next() {
		nextlen = 0;
		
		byte b = read();
		while(!Character.isAlphabetic(b) && !Character.isDigit(b)) b = read();
		while(Character.isAlphabetic(b) || Character.isDigit(b)) {
			nextbuf[nextlen++] = b;
			b = read();
		}
	}
}

