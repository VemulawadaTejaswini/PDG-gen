import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	int N;
	char[] ch;
	boolean[] used;

	public int dfs(int n,int d){
		//System.out.println(n + " " + d);
		int depth = d + 1;
		int add = 1;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		while(depth > d){
			if(ch[n + add] == '['){
				used[n + add] = true;
				pq.add(dfs(n + add,depth));
				while(used[n + add]){
					add++;
				}
			}else if(ch[n + add] == ']'){
				//System.out.println((n + add) + " " + d);
				used[n + add] = true;
				depth--;
			}else{
				StringBuilder sb = new StringBuilder();
				while(ch[n + add] != ']'){
					used[n + add] = true;
					sb.append(ch[n + add]);
					add++;
				}
				used[n + add] = true;
				depth--;
				add++;
				pq.add(Integer.parseInt(sb.toString()) / 2 + 1);
			}
		}
		int size = pq.size() / 2 + 1;
		int sum = 0;
		for(int j = 0;j < size;j++){
			sum += pq.poll();
		}
		return sum;
	}

	public void solve() {
		N = nextInt();
		while(N-- > 0){
			ch = next().toCharArray();
			used = new boolean[ch.length];
			used[0] = true;
			out.println(dfs(0,0));
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