import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;
public class Main implements Runnable{

	int N;
	String[] s;
	HashSet<String> hash;

	public String dfs(int n,int m,String a){
		if(n == m){
			if(hash.contains(a))return null;
			return a;
		}

		for(int i = 0;i < 26;i++){
			String t = (a +(char)('a'+i));
			String res = dfs(n+1,m,t);
			if(res != null){
				return res;
			}
		}
		return null;
	}

    public void solve() {
    	N = nextInt();
    	s = new String[N];
    	hash = new HashSet<String>();
    	for(int i = 0;i < N;i++)s[i] = next();
    	for(int i = 0;i < N;i++){
    		for(int j = 0;j < s[i].length();j++){
	    		for(int k = 1;k <= 4;k++){
	    			hash.add(s[i].substring(j,Math.min(s[i].length(),j+k)));
	    		}
    		}
    	}

    	for(int i = 1;i <= 4;i++){
    		String ans = dfs(0,i,"");
    		if(ans != null){
    			out.println(ans);
    			break;
    		}
    	}
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