import java.util.*;

import java.io.*;
import java.math.*;
public class Main {
	private static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
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
		
		public int readInt() {
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
		
		public String readString() {
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
		
		public double readDouble() {
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
					return res * Math.pow(10, readInt());
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
						return res * Math.pow(10, readInt());
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
		
		public long readLong() {
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
		
		public boolean isSpaceChar(int c) {
			if (filter != null) {
				return filter.isSpaceChar(c);
			}
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
		
		public String next() {
			return readString();
		}
		
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
	
	private static class OutputWriter {
		private final PrintWriter writer;
		
		public OutputWriter(OutputStream outputStream) {
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}
		
		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}
		
		public void print(Object... objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0) {
					writer.print(' ');
				}
				writer.print(objects[i]);
			}
			writer.flush();
		}
		
		public void printLine(Object... objects) {
			print(objects);
			writer.println();
			writer.flush();
		}
		
		public void close() {
			writer.close();
		}
		
		public void flush() {
			writer.flush();
		}
	}
	
	

	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	 
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	          
	   

	public static void main(String args[])
	{
		 InputReader in = new InputReader(System.in);
	     OutputWriter out = new OutputWriter(System.out);
	    int a=in.readInt();
	    int b=in.readInt();
	    int c=in.readInt();
	    int d=in.readInt();
	    int e=in.readInt();
	    int a2=(a/10+1)*10;
	    int b2=(b/10+1)*10;
	    int c2=(c/10+1)*10;
	    int d2=(d/10+1)*10;
	    int e2=(e/10+1)*10;
	    long sum=0;
	    int a1=a%10;int b1=b%10;int c1=c%10;int d1=d%10;int e1=e%10;
	    if(a1==0)
	    	{a1=10;a2=a;}
	    if(b1==0)
	    	{b1=10;b2=b;}
	    if(c1==0)
	    	{c1=10;c2=c;}
	    if(d1==0)
	    	{d1=10;d2=d;}
	    if(e1==0)
	    	{e1=10;e2=e;}
	   if(a1<=b1 && a1<=c1 && a1<=d1 && a1<=e1)
	   { sum=a+b2+c2+d2+e2;}
	   else if(b1<=a1 && b1<=c1 && b1<=d1 && b1<=e1 )
		   {sum=a2+b+c2+d2+e2;}
	   else if(c1<=a1 && c1<=b1 && c1<=d1 && c1<=e1 )
	   { sum=a2+b2+c+d2+e2;}
	   else if(d1<=a1 && d1<=b1 && d1<=c1 && d1<=e1 )
	   { sum=a2+b2+c2+d+e2;}
	   else if(e1<=a1 && e1<=b1 && e1<=c1 && e1<=d1 )
		   {sum=a2+b2+c2+d2+e;}
	   out.printLine(sum);
		   
	}
	
		
	}

