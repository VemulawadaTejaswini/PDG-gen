import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static Point[] p;
	static int n;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		p = new Point[n];
		for(int i=0; i<n; i++) {
			p[i] = new Point(sc.nextDouble(), sc.nextDouble());
		}
		
		Arrays.sort(p, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				if(p1.x < p2.x) {
					return -1;
				} else if(p1.x > p2.x) {
					return 1;
				} else {
					if(p1.y < p2.y) {
						return -1;
					} else {
						return 1;
					}
				}
			}
		});
		double d = closestPair(0, n);
		DecimalFormat df = new DecimalFormat("#######0.0########");
		System.out.println(df.format(d));
	}
	
	static double closestPair(int l, int r) {
		if(r - l <= 1) {
			return Integer.MAX_VALUE;
		}
		
		int m = (l + r) / 2;
		double x = p[m].x;
		double d = Math.min(closestPair(l, m), closestPair(m, r));
		merge(l, m, r);
		
		ArrayList<Point> pa = new ArrayList<>();
//		System.out.println(l + " " + r + " " + d + " " + x);
		for(int i=l; i<r; i++) {
			if(Math.abs(p[i].x - x) >= d/2) {
				continue;
			}
			for(int j=pa.size()-1; j>=0; j--) {
				double dx = p[i].x - pa.get(j).x;
				double dy = p[i].y - pa.get(j).y;
				if(dy >= d) {
					break;
				}
				d = Math.min(d, Math.sqrt(dx*dx + dy*dy));
//				System.out.println("i=" + i + " j=" + j + " " + d);
			}
			pa.add(p[i]);
		}
		
		
		return d;
	}
	
	static class Point {
		double x;
		double y;
		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static void merge(int l, int m, int r) {
		Point[] ptemp = Arrays.copyOf(p, n);
		int i = l;
		int j = m;
		int k = l;
		while(k != r) {
			if(j == r || i != m && p[i].y < p[j].y) {
				ptemp[k] = p[i];
				i++;
				k++;
			} else {
				ptemp[k] = p[j];
				j++;
				k++;
			}
		}
		
		p = ptemp;
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