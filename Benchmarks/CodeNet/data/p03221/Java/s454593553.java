import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
public class Main{
	public static void main(String[] args){
		int N = IO.nextInt();
		int M = IO.nextInt();
		int[][] data = new int[M][4];
		for(int i=0; i<M; i++){
			data[i][0] = i;
			data[i][1] = IO.nextInt();
			data[i][2] = IO.nextInt();
			data[i][3] = 0;
		}
		Arrays.sort(data, (x, y) -> x[1]==y[1] ? x[2]-y[2] : x[1]-y[1]);
		int a = 0;
		int b = 0;
		for(int i=0; i<M; i++){
			if(data[i][1] != a){
				a = data[i][1];
				b = 0;
			}
			data[i][3] = ++b;
		}
		Arrays.sort(data, (x, y) -> x[0]-y[0]);
		for(int i=0; i<M; i++){
			int data1 = data[i][1];
			int data3 = data[i][3];
			String s = "";
			if (data1 < 10){s = "00000";}
			else if (data1 < 100){s = "0000";}
			else if (data1 < 1000){s = "000";}
			else if (data1 < 10000){s = "00";}
			else if (data1 < 100000){s = "0";}
			s += data1;
			if (data3 < 10){s += "00000";}
			else if (data3 < 100){s += "0000";}
			else if (data3 < 1000){s += "000";}
			else if (data3 < 10000){s += "00";}
			else if (data3 < 100000){s += "0";}
			s += data3;
			IO.out(s);
		}
		IO.flush();
		return;
	}
}


final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;
 
	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}
 
	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
 
	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}
 
	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}
 
	static char nextChar() {
		if (!hasNext())
			throw new NoSuchElementException();
		return (char) readByte();
	}
 
	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}
 
	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}
 
	static double nextDouble() {
		return Double.parseDouble(next());
	}
 
	static void out(String val) {
		out.println(val);
	}
 
	static void flush() {
		out.flush();
	}
}