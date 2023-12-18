import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	long X = sc.nextLong();
    	Test[] test = new Test[N];
    	long bsum = 0;
    	for(int i=0; i<N; i++) {
    		test[i] = new Test(sc.nextLong(), sc.nextLong(), sc.nextLong());
    		test[i].maxDim = test[i].u * X - (test[i].u - test[i].l) * test[i].b;
    		bsum += test[i].l * test[i].b;
    	}
    	Arrays.sort(test, (a, b) -> b.maxDim - a.maxDim > 0 ? 1 : -1);
    	long ans = 0;
    	for(int i=0; i<N; i++) {
    		if(test[i].maxDim <= bsum) {
    			bsum -= test[i].maxDim;
    			ans += X;
    		} else {
    			long mintime = X;
    			for(int j=i; j<N; j++) {
    				if(test[j].maxDim < bsum) break;
    				long t1 = (long)Math.ceil((double)bsum / (double)test[j].l);
    				if(t1 < mintime) {
    					mintime = t1;
    				}
    				long t2 = (long)Math.ceil((double)(bsum + (test[j].u - test[j].l) * test[j].b) / (double)test[j].u);
    				if(t2 < mintime) {
    					mintime = t2;
    				}
    			}
    			ans += mintime;
    			break;
    		}

    		if(bsum == 0) break;
    	}

    	System.out.println(ans);
    }

    static class Test {
    	long b;
    	long l;
    	long u;
    	long maxDim;
		public Test(long b, long l, long u) {
			this.b = b;
			this.l = l;
			this.u = u;
		}

    }

    static void debug(long... args) {
    	if(!DEBUG_FLG) return;
    	boolean flg = false;
    	for(long s : args) {
    		if(flg) System.out.print(" ");
    		flg = true;
    		System.out.print(s);
    	}
    	System.out.println();
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
