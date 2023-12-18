import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Random;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	if(N==2) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		System.out.println(Math.max(a, b) - Math.min(a, b));
    		System.out.println(Math.max(a, b) + " " + Math.min(a, b));
    		return;
    	}

    	ArrayList<Integer> plus = new ArrayList<>();
    	ArrayList<Integer> minus = new ArrayList<>();
    	for(int i=0; i<N; i++) {
    		int x = sc.nextInt();
    		if(x >= 0) {
    			plus.add(x);
    		} else {
    			minus.add(x);
    		}
    	}
    	Collections.sort(plus);
    	Collections.sort(minus);

    	StringBuilder sb = new StringBuilder();

    	if(plus.size() == 0) {
    		sb.append(minus.get(minus.size()-1) + " " + minus.get(0) + "\n");
    		int tmp = minus.get(minus.size()-1) - minus.get(0);
    		plus.add(tmp);
    		minus.remove(minus.size()-1);
    		minus.remove(0);
    	} else if(minus.size() == 0) {
    		sb.append(plus.get(0) + " " +  plus.get(plus.size()-1) + "\n");
    		int tmp = plus.get(0) - plus.get(plus.size()-1);
    		minus.add(tmp);
    		plus.remove(plus.size()-1);
    		plus.remove(0);
    	}
    	long tmpplus = plus.get(plus.size()-1);
    	long tmpminus = minus.get(minus.size()-1);
    	plus.remove(plus.size()-1);
    	minus.remove(minus.size()-1);
    	for(int x : minus) {
    		sb.append(tmpplus + " " + x + "\n");
    		tmpplus -= x;
    	}
    	for(int x : plus) {
    		sb.append(tmpminus + " " + x + "\n");
    		tmpminus -= x;
    	}
    	sb.append(tmpplus + " " + tmpminus + "\n");
    	long ans = tmpplus - tmpminus;
    	System.out.println(ans);
    	System.out.print(sb);
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

    static void shuffleArray(long[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            long tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }
    }
}
