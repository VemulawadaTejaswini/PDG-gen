import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
public class Main implements Runnable{
	int a,b;
    public void solve() {
    	a = nextInt();
    	b = nextInt();

    	double low = 0;
    	double high = 360;
    	double m = 0;
    	for(int i = 0;i < 1000;i++){

    		m = (high+low) / 2;
    		if(a + 2 * m >  b){
    			high = m;
    		}else if (a + 2 * m < b){
    			low = m;
    		}
    	}
    	if(b-a >= 180)out.println(a+m-180);
    	else out.println(a+m);
    }

    public static void main(String[] args) {
        new Thread(null,new Main(),"",64 * 1024 * 1024).start();
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

    @Override
    public void run() {
        out.flush();
        new Main().solve();
        out.close();

    }
}