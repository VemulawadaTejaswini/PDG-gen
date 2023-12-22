import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;
 
public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
 
        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
 
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
 
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
        public int nextInt() {
            int c = read();
 
            while (isSpaceChar(c))
                c = read();
 
            int sgn = 1;
 
            if (c == '-') {
                sgn = -1;
                c = read();
            }
 
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
 
            return res * sgn;
        }
 
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
 
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
 
        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));
 
            return res.toString();
        }
 
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
        public String next() {
            return readString();
        }
 
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
 
    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }
 
    long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }
 
    long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }
 
 
 
    PrintWriter out;
    InputReader sc;
 
    public void run() {
        sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        out = new PrintWriter(System.out);
 
 		int n=sc.nextInt();
		int q=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		tree=new TreeSet[4*n];
		build(0,0,n-1);
		while(q-->0) {
			int l=sc.nextInt()-1;
			int r=sc.nextInt()-1;
			out.println(query(0,0,n-1,l,r).size());
		}
 
 
        out.close();
    }
  
  static TreeSet<Integer> tree[];
	static int a[];
	static void build(int cur,int l,int r) {
		if(l==r) {
			tree[cur]=new TreeSet<>();
			tree[cur].add(a[l]);
			return;
		}
		int mid=(l+(r-l)/2);
		build(2*cur+1,l,mid);
		build(2*cur+2,mid+1,r);
		tree[cur]=merge(tree[2*cur+1],tree[2*cur+2]);
	}
	static TreeSet<Integer> merge(TreeSet<Integer> o1,TreeSet<Integer> o2){
		TreeSet<Integer> ts=new TreeSet<>();
		for(int x:o1) {
			ts.add(x);
		}
		for(int x:o2) {
			ts.add(x);
		}
		return ts;
	}
	static TreeSet<Integer> query(int cur,int l,int r,int start,int end) {
		if(r<start || l>end)return new TreeSet<>();
		if(l>=start && r<=end)return tree[cur];
		int mid=(l+r)>>1;
		TreeSet<Integer> p1=query(2*cur+1,l,mid,start,end);
		TreeSet<Integer> p2=query(2*cur+2,mid+1,r,start,end);
		return merge(p1,p2);
	}
 
}