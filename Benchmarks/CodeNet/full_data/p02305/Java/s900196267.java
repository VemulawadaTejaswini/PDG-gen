import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	private static double ALLOWABLE_ERROR = 0.0000001;
	
	public static void main(String[] args) {
		Circle c1 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		Circle c2 = new Circle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		
		double dist = distance(c1, c2);
		
		if(Math.abs(dist + c2.r - c1.r) < ALLOWABLE_ERROR || Math.abs(dist + c1.r - c2.r) < ALLOWABLE_ERROR) {
			System.out.println(1);
		} else if(dist + c2.r < c1.r + ALLOWABLE_ERROR || dist + c1.r < c2.r + ALLOWABLE_ERROR) {
			System.out.println(0);
		} else if(Math.abs(dist - c2.r - c1.r) < ALLOWABLE_ERROR) {
			System.out.println(3);
		} else if(dist < c1.r + c2.r + ALLOWABLE_ERROR) {
			System.out.println(2);
		} else {
			System.out.println(4);
		}
	}

	static double distance(Circle p1, Circle p2) {
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	
	static class Circle {
		double x;
		double y;
		double r;
		Circle(double x, double y, double r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}