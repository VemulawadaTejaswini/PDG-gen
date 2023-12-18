import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main implements Runnable {

	public static void main(String[] args) {

		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

	}

	@Override
	public void run() {
		exec();
	}

	private void exec() {

		FastScanner sc = new FastScanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[][] matrix = new int[h][w];

		if(h == 1 && b == 0) {
			for(int j = 0 ; j < a ; j++) {
				System.out.print(1);
			}
			for(int j = 0 ; j < w - a ; j++) {
				System.out.print(0);
			}
			System.exit(0);
		}
		int current = 0;
		// 1でやる
		if((a * h) % w == 0 && (a * h) / w == b) {
			for(int i = 0 ; i < h ; i++) {
				for(int j = 0 ; j < a ; j++) {
					matrix[i][current++] = 1;
					if(current == w) {
						current = 0;
					}
				}
			}
		}
		// 0でやる
		else if((w-a) * h % w == 0 && (w-a) * h / w == b) {
			for(int i = 0 ; i < h ; i++) {
				for(int j = 0 ; j < a ; j++) {
					matrix[i][current++] = 1;
					if(current == w - 1) {
						current = 0;
					}
				}
			}
		} else {
			System.out.println("No");
			System.exit(0);
		}

		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}

class FastScanner {

	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public FastScanner(InputStream in) {
		this.in = in;
	}

	private boolean hasNextByte() {
		if(ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if(hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while(hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

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

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

}
