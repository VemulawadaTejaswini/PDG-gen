import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	private static BufferedReader brStdin = new BufferedReader(new InputStreamReader(System.in));
	private static String[] readBuf = null;
	private static int readPtr = 0;
	private static String getString() throws IOException {
		while ( readBuf == null || readPtr >= readBuf.length ) {
			readBuf = brStdin.readLine().split(" ");
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
	
	public static void main(String args[]) throws IOException {
		long a = getLong();
		long b = getLong();
		long c = getLong();
		long d = getLong();

		long x = c;
		long y = d;
		if ( c < d ) {
			x = d;
			y = c;
		}
		while ( y != 0L ) {
			long m = x % y ;
			x = y;
			y = m;
		}
		long g = c * d / x;

		long s0 = b - a + 1;
		long s1 = (b+1)/c - a/c ;
		long s2 = (b+1)/d - a/d ;
		long s3 = (b+1)/g - a/g ;

		System.out.println(s0 - s1 - s2 + s3);
	}
}
