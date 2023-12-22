
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	static Scanner stdIn = new Scanner(System.in);
	static FastScanner sc = new FastScanner();
	
	static int[] X1 = new int[] {32,30,32,31,31,32,32,31,32,31,32,32};
	static int[] X2 = new int[] {32,29,32,31,31,32,32,31,32,31,32,32};
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		FastScanner sc = new FastScanner();
		while(true) {
			int y1 = sc.nextInt();
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int y2 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			if(y1 < 0 || m1 < 0 || d1 < 0 || y2 < 0 || m2 < 0 || d2 < 0) {
				break;
			}
			
			int count = 0;
			while(true) {
				if(y1 == y2 && m1 == m2 && d1 == d2) break;
				if(y1 != y2 && m1 == 1 && d1 == 1) {
					if(is_uruu(y1)) {
						count += 366;
						y1++;
						continue;
					}
					else {
						count += 365;
						y1++;
						continue;
					}
				}
				count++;
				
				d1++;
				
				if(is_uruu(y1)) {
					if(d1 == X1[m1-1]) {
						d1 = 1;
						m1++;
					}
				}
				else {
					if(d1 == X2[m1-1]) {
						d1 = 1;
						m1++;
					}
				}
				
				if(m1 == 13) {
					m1 = 1;
					y1++;
				}
			}
			out.println(count);
		}
		out.flush();
		
		
	}
	static boolean is_uruu(int a) {
		return(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0));
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
     
    public int nextInt() {
        return (int)nextLong();
    }
     
    public double nextDouble() {
        return Double.parseDouble(next());
    }
     
 
}