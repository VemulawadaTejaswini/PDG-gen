import static java.lang.System.out;
import java.lang.Math;
import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    MyInput in = new MyInput();
    public void run() {
        int N = in.nextInt();
        int M = in.nextInt();
        boolean[][] map = new boolean[N][N];
        int a,b;
        for(int i = 0; i < M; i++) {
            a = in.nextInt() - 1;
            b = in.nextInt() - 1;
            map[a][b] = true;
            map[b][a] = true;
        }
        int count = 0;
        int tmp;
        int ti = 0;
        int tj = 0;

        for(int i = 0; i < N; i++) {
            tmp = 0;
            for(int j = 0; j < N; j++) {
                if(map[i][j]) {
                    tmp++;
                    ti = i;
                    tj = j;
                }
            }
            if(tmp == 1) {
                count++;
                map[tj][ti] = false;
            }
        }
        out.println(count);
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

