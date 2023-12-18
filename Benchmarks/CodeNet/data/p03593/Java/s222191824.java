import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {

   int H,W;
   int[] a;

   private class P implements Comparable<P> {
       private int i,j;
       public P(int i,int j) {
           this.i = i;
           this.j = j;
       }

       public int compareTo(P p) {
           if (this.i == p.i) {
               return Integer.compare(this.j,p.j);
           }
           return Integer.compare(this.i,p.i);
       }
   }

    public void solve() {
        H = nextInt();
        W = nextInt();

        a = new int[26];
        for(int i = 0;i < H;i++) {
            char[] ch = next().toCharArray();
            for(int j = 0;j < W;j++) {
                a[ch[j]- 'a']++;
            }
        }

        for(int i = 0;i < H;i++) {
            for(int j = 0;j < W;j++) {

                TreeSet<P> list = new TreeSet<>();
                list.add(new P(i,j));
                list.add(new P(i,W - j - 1));
                list.add(new P(H - i - 1,j));
                list.add(new P(H - i - 1,W - j - 1));

                for(int k = 0;k < 26;k++) {
                    if(a[k] >= list.size()) {
                        a[k] -= list.size();
                        break;
                    }
                }
            }
        }

        for(int i = 0;i < 26;i++) {
            if (a[i] != 0) {
                out.println("No");
                return;
            }
        }

        out.println("Yes");
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
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