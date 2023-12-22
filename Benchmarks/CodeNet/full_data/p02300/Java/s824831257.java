import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
	private static FastScanner sc = new FastScanner();
	static final double ALLOWABLE_ERROR = 0.00000001;

	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<Point> p = new ArrayList<>();
		for(int i=0; i<n; i++) {
			p.add(new Point(sc.nextDouble(), sc.nextDouble()));
		}
		
		for(int i=1; i<n; i++) {
			if((p.get(i).y < p.get(0).y) || (p.get(i).y == p.get(0).y && p.get(i).x < p.get(0).x)) {
				Point temp = p.get(i);
				p.set(i, p.get(0));
				p.set(0, temp);
			}
		}
		
		for(int i=1; i<n; i++) {
			if(p.get(i).x == p.get(0).x) {
				p.get(i).ang = Math.PI / 2;
			} else if(p.get(i).x > p.get(0).x) {
				p.get(i).ang = Math.atan((p.get(i).y - p.get(0).y) / (p.get(i).x - p.get(0).x));
			} else {
				p.get(i).ang = Math.atan((p.get(i).y - p.get(0).y) / (p.get(i).x - p.get(0).x)) + Math.PI;
			}
		}
		
		Collections.sort(p, new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				if(o1.ang < o2.ang) {
					return -1;
				} else if(o1.ang > o2.ang){
					return 1;
				} else {
					if(distance(p.get(0), o1) < distance(p.get(0), o2)) {
						return -1;
					} else {
						return 1;
					}
				}
			}
		});
		
		int i = 1;
		while(i < p.size()) {
			if(checkCounterClockwise(p.get(i-1), p.get(i), p.get((i+1)%p.size()))) {
				i++;
			} else {
				p.remove(i);
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int j=0; j<p.size(); j++) {
			ans.append(p.get(j).x);
			ans.append(" ");
			ans.append(p.get(j).y);
			ans.append("\n");
		}
		
		System.out.print(ans);
	}
	
	static double distance(Point p1, Point p2) {
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	
	static boolean checkCounterClockwise(Point p1, Point p2, Point p3) {
		double a = (p2.y - p1.y) / (p2.x - p1.x);
		double b = p2.y - a * p2.x;
		if(p1.x == p2.x) {
			if(p3.x == p1.x) {
				return true;
			} else if((p1.y < p2.y && p3.x < p1.x) || (p1.y > p2.y && p3.x > p1.x)) {
				return true;
			} else {
				return false;
			}	
			
		} else {
			if(Math.abs(p3.y - (a * p3.x + b)) < ALLOWABLE_ERROR) {
				return true;
			} else if((p1.x < p2.x && p3.y - (a * p3.x + b) > 0) || (p1.x > p2.x && p3.y - (a * p3.x + b) < 0)) {
				return true;
			} else {
				return false;
			}				
		}
	}

	static class Point {
		double x;
		double y;
		double ang;
		Point(double x, double y) {
			this.x = x;
			this.y = y;
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