import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		StdIn in = new StdIn();
		int h=in.nextInt(), w=in.nextInt(), d=in.nextInt();
		char[][] mat = new char[h][w];
		/*if(d%2==1) {
			for(int i=0; i<h; i+=2) {
				for(int j=0; j<w; j+=2) {
					mat[i][j]='R';
					if(i+1<h)
						mat[i+1][j]='Y';
					if(j+1<w)
						mat[i][j+1]='G';
					if(i+1<h&&j+1<w)
						mat[i+1][j+1]='B';
				}
			}
		} else {
			d/=2;
			for(int j=0; j<w; j+=d) {
				char c;
				switch(j/d%4) {
				case 0:
					c='R';
					break;
				case 1:
					c='Y';
					break;
				case 2:
					c='G';
					break;
				default:
					c='B';
					break;
				}
				for(int i=0; i<h; i+=2*d) {
					mat[i][j]=c;
					if(j+1<w) {
						if(i>0)
							mat[i-1][j+1]=c;
						if(i+1<h)
							mat[i+1][j+1]=c;
						if(j+2<w)
							mat[i][j+2]=c;
					}
				}
				for(int i=-d; i<h; i+=2*d) {
					if(j+d<w) {
						if(i>=0)
							mat[i][j+d]=c;
						if(j+d+1<w) {
							if(i>0)
								mat[i-1][j+d+1]=c;
							if(i+1>=0&&i+1<h)
								mat[i+1][j+d+1]=c;
							if(i+1>=0&&j+d+2<w)
								mat[i][j+d+2]=c;
						}
					}
				}
			}
		}*/
		for(int i=0; i<h; ++i) {
			for(int j=0; j<w; ++j) {
				if((i+j)/d%2==0) {
					if((i-j+500*d)/d%2==0)
						mat[i][j]='R';
					else
						mat[i][j]='Y';
					
				} else {
					if((i-j+500*d)/d%2==0)
						mat[i][j]='G';
					else
						mat[i][j]='B';
				}
			}
			System.out.println(mat[i]);
		}
	}
	
	interface Input {
		public String next();
		public String nextLine();
		public int nextInt();
		public long nextLong();
		public double nextDouble();
	}
	static class StdIn implements Input {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public StdIn() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public StdIn(String filename) {
			try{
				din = new DataInputStream(new FileInputStream(filename));
			} catch(Exception e) {
				throw new RuntimeException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
		
		public String next() {
			int c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			StringBuilder s = new StringBuilder();
			while (c != -1)
			{
				if (c == ' ' || c == '\n'||c=='\r')
					break;
				s.append((char)c);
				c=read();
			}
			return s.toString();
		}

		public String nextLine() {
			int c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			StringBuilder s = new StringBuilder();
			while (c != -1)
			{
				if (c == '\n'||c=='\r')
					break;
				s.append((char)c);
				c = read();
			}
			return s.toString();
		}

		public int nextInt() {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
			{
				ret = ret * 10 + c - '0';
			}  while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}
		
		public int[] readIntArray(int n) {
			int[] ar = new int[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextInt();
			return ar;
		}

		public long nextLong() {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			}
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}
		
		public long[] readLongArray(int n) {
			long[] ar = new long[n];
			for(int i=0; i<n; ++i)
				ar[i]=nextLong();
			return ar;
		}

		public double nextDouble() {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			}
			while ((c = read()) >= '0' && c <= '9');

			if (c == '.')
			{
				while ((c = read()) >= '0' && c <= '9')
				{
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() {
			try{
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			} catch(IOException e) {
				throw new RuntimeException();
			}
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}