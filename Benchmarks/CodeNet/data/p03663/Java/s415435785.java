import java.io.*;
import java.util.*;

public class Main {
	static String startDigs="";
	static StdIn in = new StdIn();

	public static void main(String[] args) {
		while(true) {
			findDigs();
		}
	}
	
	static void findDigs() {
		System.out.println("? "+(startDigs+(long)(5e10-1)).substring(0, 11));
		if(in.next().equals("Y")) {
			//starts with 0-4
			System.out.println("? "+(startDigs+(long)(3e10-1)).substring(0, 11));
			if(in.next().equals("Y")) {
				//starts with 0-2
				System.out.println("? "+(startDigs+(long)(2e10-1)).substring(0, 11));
				if(in.next().equals("Y")) {
					//0-1
					if(startDigs.length()==0)
						startDigs="1";
					else {
						System.out.println("? "+(startDigs+"0"+(long)(1e10-1)).substring(0, 11));
						if(in.next().equals("Y")) {
							//0
							startDigs+="0";
						} else {
							//1
							startDigs+="1";
						}
					}
				} else {
					//2
					startDigs+="2";
				}
			} else {
				//starts with 3-4
				System.out.println("? "+(startDigs+(long)(4e10-1)).substring(0, 11));
				if(in.next().equals("Y")) {
					//3
					startDigs+="3";
				} else {
					//4
					startDigs+="4";
				}
			}
		} else {
			//starts with 5-9
			System.out.println("? "+(startDigs+(long)(8e10-1)).substring(0, 11));
			if(in.next().equals("Y")) {
				//starts with 5-7
				System.out.println("? "+(startDigs+(long)(7e10-1)).substring(0, 11));
				if(in.next().equals("Y")) {
					//5-6
					System.out.println("? "+(startDigs+(long)(6e10-1)).substring(0, 11));
					if(in.next().equals("Y")) {
						//5
						startDigs+="5";
					} else {
						//6
						startDigs+="6";
					}
				} else {
					//7
					startDigs+="7";
				}
			} else {
				//starts with 8-9
				System.out.println("? "+(startDigs+(long)(9e10-1)).substring(0, 11));
				if(in.next().equals("Y")) {
					//3
					startDigs+="8";
				} else {
					//4
					startDigs+="9";
				}
			}
		}
		//test if startDigs is the number
		//System.out.println("? "+startDigs); //should be yes
		System.out.println("? "+(Long.parseLong(startDigs)+1));
		if(in.next().equals("Y")) {
			System.out.println("! "+startDigs);
			System.exit(0);
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
