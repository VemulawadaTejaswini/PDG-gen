import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	/* several useful subroutines */
	private static final BigDecimal BD1000000007 = new BigDecimal(1000000007);
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
	private static BigDecimal mod1000000007(BigDecimal bd) {
		return bd.subtract(BD1000000007.multiply(bd.divide(BD1000000007, BigDecimal.ROUND_DOWN))) ;
	}
	@SuppressWarnings("unused")
	private static BigDecimal mod1000000007(int i) {
		return mod1000000007(new BigDecimal(i)) ;
	}
	@SuppressWarnings("unused")
	private static BigDecimal mod1000000007(long l) {
		return mod1000000007(new BigDecimal(l)) ;
	}

	
	/* main routine */
	public static void main(String args[]) throws IOException {
		int n = getInt();
		Map<String,Integer> m = new HashMap<String,Integer>();

		int max = 1;
		for ( int i = 0 ; i < n ; i++ ) {
			char[] ca = getString().toCharArray();
			Arrays.sort(ca);
			String key = new String(ca);
			if ( m.containsKey(key) ) {
				int j = m.get(key)+1;
				m.put( key, j );
				if ( max < j ) {
					max = j;
				}
			} else {
				m.put( key, 1 );
			}
		}
		long c[] = new long[max+1];
		c[1] = 0L;
		for ( int i = 1 ; i < max ; i++ ) {
			c[i+1] = c[i] + i;
		}
		
		long ans = 0;
		for ( int cnt : m.values() ) {
			ans += c[cnt];
		}
		
		System.out.println(ans);
	}
}
