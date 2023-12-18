import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int Q = sc.nextInt();
    	long sum = 0;
    	int mida = 0;
    	PriorityQueue<Integer> lefta = new PriorityQueue<>(Collections.reverseOrder());
    	PriorityQueue<Integer> righta = new PriorityQueue<>();
    	int leftasize = 0;
    	int rightasize = 0;
    	for(int i=0; i<Q; i++) {
    		int befmida = mida;
    		int query = sc.nextInt();
    		if(query == 1) {
    			int a = sc.nextInt();
    			long b = sc.nextLong();
    			sum += b;
    			if(i == 0) {
    				mida = a;
    			} else {
    				if(a < mida) {
    					lefta.add(a);
    					leftasize++;
    					if((leftasize + rightasize + 1) % 2 == 0) {
        					int x = lefta.poll();
        					leftasize--;
        					righta.add(mida);
        					rightasize++;
        					mida = x;
        					sum += Math.abs((long)befmida - (long)a);
        				} else {
        					sum += Math.abs((long)befmida - (long)a);
        				}
    				} else {
    					righta.add(a);
    					rightasize++;
    					if((leftasize + rightasize + 1) % 2 != 0) {
    						int x = righta.poll();
    						rightasize--;
    						lefta.add(mida);
    						leftasize++;
    						mida = x;
    						sum += Math.abs((long)mida - (long)a);
    					} else {
    						sum += Math.abs((long)befmida - (long)a);
    					}
    				}
    			}
    		} else {
    			System.out.println(mida + " " + sum);
    		}
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
