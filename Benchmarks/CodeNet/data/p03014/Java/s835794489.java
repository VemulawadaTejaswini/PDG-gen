import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class DJava {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        final int h = sc.nextInt();
        final int w = sc.nextInt();

        final short[] highest = new short[w];
        final short[] streak = new short[w];
        for (int i = 0; i < w; i++) streak[i] = -1;
        int max = 0;

        for (int height = 0; height < h; height++) {
            int lastWall = -1;
            int width = 0;
            for (; width < w; width++) {
                if (sc.readByte() != '.') {
                    if (lastWall != width - 1) {
                        final short len = (short) (width - lastWall - 1);
                        for (int i = lastWall + 1; i < width; i++) if (len > highest[i]) highest[i] = len;
                    }

                    final int res = highest[width] + height - streak[width];
                    if (res > max) max = res;

                    highest[width] = 0;
                    streak[width] = (short) height;
                    lastWall = width;
                }
            }

            sc.readByte();
            if (lastWall != width - 1) {
                final short len = (short) (width - lastWall - 1);
                for (int i = lastWall + 1; i < width; i++) {
                    final short current = highest[i];
                    if (len > current) highest[i] = len;
                }
            }
        }

        for (int width = 0; width < w; width++) {
            if (streak[width] != 0) {
                final int res = highest[width] + h - streak[width];
                if (res > max) max = res;
            }
        }

        System.out.println(max - 2);
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
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException ignored) {}
            return buflen > 0;
        }
    }
    int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        int n = 0;
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
