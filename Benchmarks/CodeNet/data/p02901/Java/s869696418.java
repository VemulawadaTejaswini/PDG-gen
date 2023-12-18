import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

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

	
	/* main routine */
	public static void main(String args[]) throws IOException {
		int n = getInt();
		int m = getInt();
		int a[] = new int[m];
		int b[] = new int[m];
		int bf[] = new int[m];
		for ( int i = 0 ; i < m ; i++ ) {
			a[i] = getInt();
			b[i] = getInt();
			bf[i]=0;
			for ( int j = 0 ; j < b[i] ; j++ ) {
				bf[i] |= ( 1 << (getInt()-1) );
			}
		}
		int mp = Integer.MAX_VALUE;
		for ( int x = 0 ; x < 1<<m ; x++ ) {
			int p = 0;
			int tbf = 0;
			for ( int y=0 , f=1 ; y < m ; y++, f<<=1 ) {
				if ( ( x & f ) != 0 ) {
					p += a[y];
					tbf |= bf[y];
				}
			}
			if ( tbf == (1<<n) - 1 ) {
				if ( mp > p ) {
					mp = p;
				}
			}
		}
		if ( mp == Integer.MAX_VALUE ) {
			mp = -1;
		}
		System.out.println(mp);
	}
}
