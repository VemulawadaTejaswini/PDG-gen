import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Main().new Scanner();
        int num = Integer.parseInt(in.next());
        int[] amount = new int[num];
        long amountTotal = 0L;
        for(int i = 0; i < num; i++) {
        	amount[i] = Integer.parseInt(in.next());
        	amountTotal += amount[i];
        }
        int[] precipitation = new int[num];
        long precipitationTotal = 0L;
        for (int i = 0; i < num - 1; i++) {
        	precipitationTotal += 2 * amount[i] - precipitation[i];
        	precipitation[i + 1] = 2 * amount[i] - precipitation[i];
        }
        if (precipitationTotal != amountTotal) {
        	long diff = amountTotal - precipitationTotal;
        	for(int i = 0; i < num; i++) {
        		if ((i & 1) == 0) {
        			precipitation[i] += diff;
        		} else {
        			precipitation[i] -= diff;
        		}
        	}
        }
    	StringBuilder sb = new StringBuilder(num * 10);
        for(int a : precipitation) {
    		sb.append(a);
    		sb.append(" ");
    	}
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
        
    }

    class Scanner {
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
        private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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
}