import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static final double ALLOWABLE_ERROR = 0.00000001;
	static final double HOSEI = 0.0000000000000001;

	public static void main(String[] args) {
		double x0 = sc.nextDouble();
		double y0 = sc.nextDouble();
		double x1 = sc.nextDouble() + HOSEI;
		double y1 = sc.nextDouble() + HOSEI;
		
		double a = (y1 - y0) / (x1 - x0);
		double b = y1 - a * x1;
		
		int q = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<q; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if(Math.abs(y - (a * x + b)) < ALLOWABLE_ERROR) {
				if((x0 <= x && x <= x1) || (x1 <= x && x <= x0)) {
					ans.append("ON_SEGMENT");
				} else if(distance(x0, y0, x, y) < distance(x1, y1, x, y)) {
					ans.append("ONLINE_BACK");
				} else {
					ans.append("ONLINE_FRONT");
				}
			} else if((a > 0 && y - (a * x + b) > 0) || (a < 0 && y - (a * x + b) < 0)) {
				ans.append("COUNTER_CLOCKWISE");
			} else {
				ans.append("CLOCKWISE");
			}
			
			ans.append("\n");
		}
		
		System.out.print(ans);
	}
	
	static double distance(double x1, double y1, double x2, double y2) {
		return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
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