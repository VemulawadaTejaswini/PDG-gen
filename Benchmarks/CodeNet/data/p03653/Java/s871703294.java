import java.io.*;
import java.util.*;

public class Main {
	static int iy, iz;
	static int[] chosenBy, xAr, yAr, zAr;
	static List<Pair> yPairs, zPairs;

	public static void main(String[] args) {
		Input in = new StdIn();
		int x=in.nextInt(), y=in.nextInt(), z=in.nextInt();
		xAr=new int[x+y+z];
		yAr=new int[x+y+z];
		zAr=new int[x+y+z];
		yPairs = new ArrayList<Pair>();
		zPairs = new ArrayList<Pair>();
		for(int i=0; i<x+y+z; ++i) {
			xAr[i]=in.nextInt();
			yAr[i]=in.nextInt();
			zAr[i]=in.nextInt();
			yPairs.add(new Pair(i, yAr[i]-xAr[i]));
			zPairs.add(new Pair(i, zAr[i]-xAr[i]));
		}
		Collections.sort(yPairs);
		Collections.sort(zPairs);
		chosenBy = new int[x+y+z];
		iy=y;
		iz=z;
		for(int i=0; i<y; ++i)
			choose(yPairs.get(i).a, 1);
		for(int i=0; i<z; ++i)
			choose(zPairs.get(i).a, 2);
		long sum=0;
		for(int i=0; i<x+y+z; ++i)
			if(chosenBy[i]==0)
				sum+=xAr[i];
			else if(chosenBy[i]==1)
				sum+=yAr[i];
			else
				sum+=zAr[i];
		System.out.println(sum);
	}
	
	static void choose(int i, int type) {
		//System.out.println((yAr[i]-xAr[i])+" "+(zAr[i]-xAr[i]));
		if(chosenBy[i]==0) {
			chosenBy[i]=type;
			return;
		}
		Pair nextY=yPairs.get(iy), nextZ=zPairs.get(iz);
		if((yAr[i]-xAr[i])-nextY.b>(zAr[i]-xAr[i])-nextZ.b) {
			chosenBy[i]=1;
			++iz;
			choose(nextZ.a, 2);
		} else {
			chosenBy[i]=2;
			++iy;
			choose(nextY.a, 1);
		}
	}
	
	static class Pair implements Comparable<Pair> {
		int a, b;
		Pair(int a, int b) {
			this.a=a;
			this.b=b;
		}
		public int compareTo(Pair p) {
			return -Integer.compare(b, p.b);
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
		final private int STRING_SIZE = 1 << 6;
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
			byte[] buf = new byte[STRING_SIZE]; // string length
			int cnt = 0, c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			while (c != -1)
			{
				if (c == ' ' || c == '\n'||c=='\r')
					break;
				buf[cnt++] = (byte) c;
				c=read();
			}
			return new String(buf, 0, cnt);
		}

		public String nextLine() {
			byte[] buf = new byte[STRING_SIZE]; // line length
			int cnt = 0, c;
			while((c=read())!=-1&&(c==' '||c=='\n'||c=='\r'));
			while (c != -1)
			{
				if (c == '\n'||c=='\r')
					break;
				buf[cnt++] = (byte) c;
				c = read();
			}
			return new String(buf, 0, cnt);
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
