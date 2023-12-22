import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	int N,M;
	boolean[][] use,used;
	ArrayList<Integer>[] list;

	private class P implements Comparable<P>{
		long used;
		int n,f;
		public P(int n,int f,long used){
			this.n = n;
			this.f = f;
			this.used = used;
		}

		public int compareTo(P p){
			return this.f - p.f;
		}
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		while(true){

			N = nextInt();

			if(N == 0)break;
			use = new boolean[N][30];
			list = new ArrayList[N];
			for(int i = 0;i < N;i++){
				list[i] = new ArrayList<Integer>();
			}
			Queue<P> q = new ArrayDeque<P>();
			for(int i = 0;i < N;i++){
				M = nextInt();
				for(int j = 0;j < M;j++){
					int day = nextInt() - 1;
					use[i][day] = true;
					list[i].add(day);
				}
			}

			int ans = Integer.MAX_VALUE;
			used = new boolean[N][30];
			q.add(new P(0,0,1L));
			while(q.size() > 0){

				P p = q.poll();

				if(p.used == (1L << N) - 1){
					ans = Math.min(ans, p.f);
					break;
				}

				if(p.f == 29)continue;
				for(int i = 0;i < list[p.n].size();i++){
					int f = list[p.n].get(i);
					if(f <= p.f)continue;
					q.add(new P(p.n,list[p.n].get(i),p.used));
					break;
				}

				for(int i = 0;i < N;i++){
					if(!use[i][p.f])continue;
					if((p.used >> i & 1) == 1)continue;
					q.add(new P(i,p.f,p.used | (1L << i)));
				}
			}

			if(ans == Integer.MAX_VALUE){
				out.println(-1);
			}else{
				out.println(ans + 1);
			}
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