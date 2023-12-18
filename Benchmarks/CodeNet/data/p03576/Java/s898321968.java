import static java.lang.System.out;
import java.lang.Math;
import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.awt.Point;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    MyInput in = new MyInput();
    public void run() {
        int N = in.nextInt();
        int K = in.nextInt();
        Point[] ps = new Point[N];
        int[] sortx = new int[N];
        int[] sorty = new int[N];
        long minmen = -1;
        for(int i = 0; i < N; i++) {
            ps[i] = new Point(in.nextInt(), in.nextInt());
            sortx[i] =  ps[i].x;
            sorty[i] =  ps[i].y;
        }
        Arrays.sort(sortx);
        Arrays.sort(sorty);
        for(int i = N - 1; i >= 0 ;i--) {
            for(int j = N - 1 ; j >= 0 ;j--) {
                for(int k = 0; k < i ;k++) {
                    for(int l = 0; l < j ;l++) {
                        int count = 0;
                        for(int h = 0; h < N; h++) {
                            if(ps[h].x <= sortx[i] && ps[h].x >= sortx[k] && ps[h].y <= sorty[j] && ps[h].y >= sorty[l]) {
                                count++;
                            }
                        }
                        if(count >= K) {
                            long yoko = (sortx[i] - sortx[k]);
                            long tate = (sorty[j] - sorty[l]);
                            long tmp =  yoko * tate;
                            if(tmp < minmen || minmen == -1) {
                                minmen = tmp;
                            }
                        }
                    }
                }
            }
        }
        out.println(minmen);
    }
}

class MyInput {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr= 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if(ptr < buflen) {
            return true;
        }else {
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

    public int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <=126;
    }

    private void skipUnprintable() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true) {
        if('0' <= b && b <= '9') {
            n *= 10;
            n += b - '0';
        }else if(b == -1 || !isPrintableChar(b)) {
            return minus ? -n : n;
        }else {
            throw new NumberFormatException();
        }
            b = readByte();
        }
	}

    public int nextInt() {
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}