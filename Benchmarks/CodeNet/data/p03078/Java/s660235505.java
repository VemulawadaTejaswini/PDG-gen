import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    int X,Y,Z,K;
    ArrayList<Long> A,B,C;

    private void solve() {
        X = nextInt();
        Y = nextInt();
        Z = nextInt();
        K = nextInt();

        A = new ArrayList<>();
        B = new ArrayList<>();
        C = new ArrayList<>();

        for(int i = 0;i < X;i++) {
            A.add(nextLong());
        }

        for(int i= 0;i < Y;i++) {
            B.add(nextLong());
        }

        for(int i = 0;i < Z;i++) {
            C.add(nextLong());
        }

        ArrayList<Long> AB = new ArrayList<>();
        for(int i = 0;i < X;i++) {
            for(int j = 0;j < Y;j++) {
                AB.add(A.get(i) + B.get(j));
            }
        }
        Collections.sort(AB);
        Collections.reverse(AB);

        int size = Math.min(K, AB.size());
        ArrayList<Long> ABC = new ArrayList<>();
        for(int i = 0;i < size;i++) {
            for(int j = 0;j < Z;j++) {
                ABC.add(AB.get(i) + C.get(j));
            }
        }
        Collections.sort(ABC);
        Collections.reverse(ABC);

        for(int i = 0;i < K;i++) {
            out.println(ABC.get(i));
        }
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
