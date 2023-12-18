
import java.util.*;
import java.io.*;
class Po {
    int x, y;
    public Po(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int D = sc.nextInt();
        int A = sc.nextInt();
        Po[] monster = new Po[N];
        int[] neighbor = new int[N];
        long[] sum = new long[N];
        long ans = 0;
        for(int i = 0; i<N; i++) {
            monster[i] = new Po(sc.nextInt(),(int)Math.ceil(sc.nextInt()/A));
            pe(monster[i].y);
        }
        Arrays.sort(monster, (ac,bc)->(ac.x-bc.x));
        for(int i = 1; i<N; i++) {
            for(int j = i-1; j>=0; j--) {
                if(monster[i].x-monster[j].x <= 2*D) neighbor[i]++;
                else break;
            }
            pe("neighbor = "+i+" "+neighbor[i]);
        }
        
        for(int i = 0; i<N; i++) {
            if(neighbor[i] == 0) {
                sum[i] = monster[i].y;
                ans += sum[i];
            }else {
                long pre = 0;
                for(int j = 1; j<=neighbor[i]; j++) {
                    pre += sum[i-j];
                }
                pe("pre "+pre);
                sum[i] = Math.max(monster[i].y - pre, 0);
                ans += sum[i];
            }
            pe("sum = "+i+" "+sum[i]);
        }
        p(ans);

    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pe(T element) {
        System.err.println(element);
        }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
        return max;
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
        } else {
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
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}