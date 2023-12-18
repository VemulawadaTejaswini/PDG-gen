import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/* several useful subroutines */
	private static BufferedReader brStdin = new BufferedReader(new InputStreamReader(System.in));
	private static String[] readBuf = null;
	private static int readPtr = 0;
	private static String getString() throws IOException {
		while ( readBuf == null || readPtr >= readBuf.length ) {
			readBuf = brStdin.readLine().split(" ");
			readPtr = 0;
		}
		return readBuf[readPtr++];
	}
	private static int getInt() throws IOException {
		return Integer.parseInt(getString());
	}
	private static long getLong() throws IOException {
		return Long.parseLong(getString());
	}
	private static BigDecimal getBD() throws IOException {
		return new BigDecimal(getString());
	}
	@SuppressWarnings("unused")
	private static String[] getStringArray(int size) throws IOException {
		String stringArray[] = new String[size];
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = getString();
		}
		return stringArray;
	}
	@SuppressWarnings("unused")
	private static int[] getIntArray(int size) throws IOException {
		int intArray[] = new int[size];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = getInt();
		}
		return intArray;
	}
	@SuppressWarnings("unused")
	private static long[] getLongArray(int size) throws IOException {
		long longArray[] = new long[size];
		for (int i = 0; i < longArray.length; i++) {
			longArray[i] = getLong();
		}
		return longArray;
	}
	@SuppressWarnings("unused")
	private static BigDecimal[] getBDArray(int size) throws IOException {
		BigDecimal bdArray[] = new BigDecimal[size];
		for (int i = 0; i < bdArray.length; i++) {
			bdArray[i] = getBD();
		}
		return bdArray;
	}
	@SuppressWarnings("unused")
	private static long calculateLCM(long a, long b) throws IOException {
		if ( a  < b ) {
			long t = a;
			a = b;
			b = t;
		}
		while ( b > 0 ) {
			long t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	
	/* main routine */
	
	public static void main(String args[]) throws IOException {
		long n = getLong();
		long x = n+1;

		List<Long> s = new ArrayList<Long>();

		while ( n % 2L == 0 ) {
			n /= 2L;
			s.add(2L);
		}
		while ( n % 3L == 0 ) {
			n /= 3L;
			s.add(3L);
		}
		long l = 5L;
		long e = (long)(Math.sqrt(n))+1;
		while ( l < e ) {
			while ( n % l == 0 ) {
				n /= l;
				s.add(l);
			}
			l += 2L ;
			while ( n % l == 0 ) {
				n /= l;
				s.add(l);
			}
			l += 4L ;
		}
		s.add(n);

		e = 1L << s.size();
		for ( long b = 0 ; b < e ; b++ ) {
			long p=1L, q=1L, f=1L;
			for ( int i = 0 ; i < s.size() ; i++,f<<=1 ) {
				if ( ( b & f ) == 0 ) {
					p *= s.get(i);
				} else {
					q *= s.get(i);
				}
			}
			if ( p + q < x ) {
				x = p + q;
			}
		}
		
		System.out.println( x-2L );
		
	}
}
