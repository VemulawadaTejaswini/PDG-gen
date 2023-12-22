//package abc176;

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
		int m=sc.nextInt();
		int sx=sc.nextInt()-1;
		int sy=sc.nextInt()-1;
		int ex=sc.nextInt()-1;
		int ey=sc.nextInt()-1;
		
		
		char a[][]=new char[n][m];
		for(int i=0;i<n;i++) {
			a[i]=sc.next().toCharArray();
		}
		
		
		Node queue[]=new Node[1000_000_00];
		queue[0]=new Node(sx, sy,0);
		int s=0,e=1;
		int ans[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			Arrays.fill(ans[i], Integer.MAX_VALUE/2);
		}
		ans[sx][sy]=0;
		int dx[]= {1,-1,0,0};
		int dy[]= {0,0,1,-1};
		while(s<e) {
			Node vertex=queue[s];
			if(vertex.w>ans[vertex.x][vertex.y]) {
				s++;
				continue;
			}
			for(int i=0;i<4;i++) {
				int nx=vertex.x+dx[i];
				int ny=vertex.y+dy[i];
				if(ok(nx,ny,n,m) && a[nx][ny]=='.' && ans[nx][ny]>ans[vertex.x][vertex.y]) {
					ans[nx][ny]=ans[vertex.x][vertex.y];
					queue[e++]=new Node(nx, ny,ans[nx][ny]);
				}
			}
			for(int i=-2;i<=2;i++) {
				for(int j=-2;j<=2;j++) {
					int nx=vertex.x+i;
					int ny=vertex.y+j;
					if(ok(nx,ny,n,m) && a[nx][ny]=='.' && ans[nx][ny]>ans[vertex.x][vertex.y]+1) {
						ans[nx][ny]=ans[vertex.x][vertex.y]+1;
						queue[e++]=new Node(nx, ny,ans[nx][ny]);
					}
				}
			}
			s++;
		}
		
		if(ans[ex][ey]==Integer.MAX_VALUE/2) {
			out.println(-1);
		}
		else {
			out.println(ans[ex][ey]);
		}
		
        
        out.close();
    }
 

static boolean ok(int x,int y,int n,int m) {
	if(x>=0 && x<n && y>=0 && y<m)return true;
	return false;
}
static class Node{
	int x,y,w;
	Node(int a,int b,int c){
		x=a;
		y=b;
		w=c;
	}
}
}