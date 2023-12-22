import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line;
//		line = br.readLine();
//		System.out.println( reverseShift(line, (byte) 4) );
		while ( (line = br.readLine()) != null ) {
			System.out.println(decrypt(line));
		}

	}

	public static String decrypt(String line) {
		for (byte shift = 0; shift < 26; shift++) {
			String reverse = reverseShift(line, shift);
			String[] array = reverse.split("\\.| ");
			for (String str : array) {
				if (  str.equals("the") || str.equals("this") || str.equals("that")  ) {
					return reverse;
				}
			}
		}
		return "fxxk not find!";
	}

	// 'a' + 25 = 'z'
	// 'z' + 1 = 'a' + 26
	//          a,    b,   c, ... ,  x,  y,  z,
	// 'a'+n :  0,    1,   2,     , 23, 24, 25, 26,
	// 'a'-n :    , -25, -24, ... , -3, -2, -1,  0,
	private static String reverseShift(String line, byte shift) {
		char[] ca = line.toCharArray();
		for (int i=0; i < ca.length; i++) {
			if ( ca[i] != ' ' && ca[i] != '.' ) {
				if (ca[i] - shift >= 'a') {
					ca[i] = (char) (ca[i] - shift);
				} else { // ca[i] - shift < 'a'
					// ca[i] - shift = 'a' - n ??¨????????¨
					// ca[i] ??? ??¢?????????????????????????????????
					// n????????????????????\?????? (z:1??????)
					byte minus = (byte) (ca[i] - shift - 'a');
					ca[i] = (char) ('z' + 1 + minus);
				}
			}
		}
		return String.valueOf(ca);
	}
}