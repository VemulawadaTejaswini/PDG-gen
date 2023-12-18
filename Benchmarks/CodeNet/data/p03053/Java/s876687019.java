import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	static char[][] field;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());

		field = new char[h][w];

		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				field[i][j] = s.charAt(j);
			}
		}

		int count = 0;
		
		if(h==1&&w==1) {
			System.out.println(0);
			return;
		}

		loop: while(true) {
			count++;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w;j++) {
					if(field[i][j] == '#') {
						try {
							if(field[i+1][j] == '.') field[i+1][j] = 't';
						}catch(Exception e) {

						}
						try {
							if(field[i-1][j] == '.') 	field[i-1][j] = 't';
						}catch(Exception e) {

						}
						try {
							if(field[i][j-1] == '.') 						field[i][j-1] = 't';
						}catch(Exception e) {

						}
						try {
							if(field[i][j+1] == '.') field[i][j+1] = 't';
						}catch(Exception e) {

						}

					}
				}
			}

			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w;j++) {
					if(field[i][j] == 't') field[i][j] = '#';
				}
			}

			if(isallblack()) break loop;

		}
		System.out.println(count);

	}

	public static boolean isallblack() {
		for(char[] c : field) {
			for(char ch : c) {
				if(ch != '#') {
					return false;
				}
			}
		}
		return true;
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
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
        if (!hasNext()) throw new NoSuchElementException();
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
}