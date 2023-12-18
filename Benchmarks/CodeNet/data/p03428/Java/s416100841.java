import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
 
public class Main {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		double[] x = new double[N];
		double[] y = new double[N];
		double minx = 10000000;
		int minpos = -1;
		for(int i=0; i<N; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
			if(x[i] < minx) {
				minx = x[i];
				minpos = i;
			}
		}
		ArrayList<Integer> L = new ArrayList<>();
		int a = minpos;
		do {
			L.add(a);
			int b = 0;
			for(int i=1; i<N; i++) {
				int c = i;
				if(b == a) {
					b = c;
				} else {
					double v = (x[b] - x[a])*(y[c] - y[a]) - (x[c] - x[a])*(y[b] - y[a]);
					if(v > 0 || (v == 0 && (x[c] - x[a])*(x[c] - x[a]) + (y[c] - y[a])*(y[c] - y[a]) > (x[b] - x[a])*(x[b] - x[a]) + (y[b] - y[a])*(y[b] - y[a]))) {
						b = c;
					}
				}
			}
			a = b;
		} while(a != minpos);
		
		double[] p = new double[N];
		
		for(int i=0; i<L.size(); i++) {
			double ax = (x[L.get(i)] + x[L.get((i+1)%L.size())]) / 2;
			double ay = (y[L.get(i)] + y[L.get((i+1)%L.size())]) / 2;
			double bx = (x[L.get(i)] + x[L.get((i-1+L.size())%L.size())]) / 2;
			double by = (y[L.get(i)] + y[L.get((i-1+L.size())%L.size())]) / 2;
			double cos = ((ax - x[L.get(i)])*(bx - x[L.get(i)]) + (ay - y[L.get(i)])*(by - y[L.get(i)])) 
					/ Math.sqrt((ax - x[L.get(i)])*(ax - x[L.get(i)])+(ay - y[L.get(i)])*(ay - y[L.get(i)])) 
					/ Math.sqrt((bx - x[L.get(i)])*(bx - x[L.get(i)])+(by - y[L.get(i)])*(by - y[L.get(i)]));
			if(cos > 1) cos = 1;
			if(cos < -1) cos = -1;
			p[L.get(i)] = (1 - Math.acos(cos) / Math.PI)/2;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(p[i]);
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
