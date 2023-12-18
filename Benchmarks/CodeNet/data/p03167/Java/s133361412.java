import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main{
    static int M=(int)pow(10,9)+7;
    public static void task(InputReader in){
        //---------------------------------Solve here---------------------------------------------------------------------------------
        int h=in.nextInt();
        int w=in.nextInt();
        int g[][]=new int[h+1][w+1];
        for(int i=1;i<=h;i++)
        {
            char ch[]=in.nextString().toCharArray();
            for(int j=1;j<=w;j++)
            {
                if(ch[j-1]=='#')
                g[i][j]=1;
                else
                g[i][j]=0;
                //out.print(g[i][j]);
            }
            //out.println();
        }
        int dp[][]=new int[h+1][w+1];
        dp[1][1]=1;
        for(int i=2;i<=h;i++)
        {
            if(g[i-1][1]==1)
            {
                for(int j=i;j<=h;j++)
                    dp[j][1]=0;
                break;
            }
            else
            dp[i][1]=1;
        }
        for(int i=2;i<=w;i++)
        {
            if(g[1][i-1]==1)
            {
                for(int j=i;j<=w;j++)
                    dp[1][j]=0;
                break;
            }
            else
            dp[1][i]=1;
        }
        for(int i=2;i<=h;i++)
        {
            for(int j=2;j<=w;j++)
            {
                if(g[i-1][j]==1&&g[i][j-1]==1)
                dp[i][j]=0;
                else if(g[i-1][j]==1)
                dp[i][j]=dp[i][j-1];
                else if(g[i][j-1]==1)
                dp[i][j]=dp[i-1][j];
                else
                dp[i][j]=(dp[i-1][j]+dp[i][j-1])%M;
            }
        }
        out.println(dp[h][w]);
        //---------------------------------------------------------------------------------------------------------------------------- 
    }
    public static void main(String[] args)throws IOException {
        try{
            InputStream inputStream = System.in;
            InputReader in = new InputReader(inputStream);
            task(in);
            out.close();
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    public static class InputReader {
        /*
        String-nextString()
        int   -nextInt()
        double-nextDouble()
        long  -nextLong()
        char  -nextChar()
        line  -nextLine()
        */
		private InputStream stream;
		private byte[] buf = new byte[8192];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
		public int read() {
			if (numChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}
		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
		public String nextString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
		public double nextDouble() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			double res = 0;
			while (!isSpaceChar(c) && c != '.') {
				if (c == 'e' || c == 'E') {
					return res * Math.pow(10, nextInt());
				}
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			}
			if (c == '.') {
				c = read();
				double m = 1;
				while (!isSpaceChar(c)) {
					if (c == 'e' || c == 'E') {
						return res * Math.pow(10, nextInt());
					}
					if (c < '0' || c > '9') {
						throw new InputMismatchException();
					}
					m /= 10;
					res += (c - '0') * m;
					c = read();
				}
			}
			return res * sgn;
		}
		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
		public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }
        public char nextChar(){
            return nextString().charAt(0);
        }
		public boolean isSpaceChar(int c) {
			if (filter != null) {
				return filter.isSpaceChar(c);
			}
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
		public String next() {
			return nextString();
		}
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
		private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }
	}
}