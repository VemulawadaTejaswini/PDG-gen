import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strStdin = null;

		while((strStdin = parseStdin()) != null) {
			for (int nA = 1; nA < 26; nA += 2) {
				if (nA == 13) {
					continue;
				}
				for (int nB = 0; nB < 26; nB++) {
					if (strStdin.contains(encode("this", nA, nB)) || strStdin.contains(encode("that", nA, nB))) {
						System.out.println(decode(strStdin, nA, nB));
					}
				}
			}
		}
	}

	private static String encode(String strNum, int nA, int nB) {
		String	strTmp = "";
		int		nTmp   = 0;

		for (char c : strNum.toCharArray()) {
			// Ck = APk + K (mod M)
			if (Character.isLowerCase(c)) {
				nTmp = (nA * (c - 'a') + nB) % 26 + 'a';
				c    = (char)nTmp;
			}
			strTmp += c;
		}

		return strTmp;
	}

	private static String decode(String strNum, int nA, int nB) {
		String	strTmp = "";
		int		nInvA  = inverse(nA);
		int		nTmp   = 0;

		for (char c : strNum.toCharArray()) {
			// Pk = A-1(Ck - K) (mod M)
			if (Character.isLowerCase(c)) {
				nTmp = (nInvA * (c - 'a' - nB + 26)) % 26 + 'a';
				c    = (char)nTmp;
			}
			strTmp += c;
		}

		return strTmp;
	}

	private static int inverse(int nA) {
		int	nInvA  = 0;

		switch (nA) {
        case 1:
        	nInvA = 1;
        	break;
        case 3:
        	nInvA = 9;
        	break;
        case 5:
        	nInvA = 21;
        	break;
        case 7:
        	nInvA = 15;
        	break;
        case 9:
        	nInvA = 3;
        	break;
        case 11:
        	nInvA = 19;
        	break;
        case 15:
        	nInvA = 7;
        	break;
        case 17:
        	nInvA = 23;
        	break;
        case 19:
        	nInvA = 11;
        	break;
        case 21:
        	nInvA = 5;
        	break;
        case 23:
        	nInvA = 17;
        	break;
        case 25:
        	nInvA = 25;
        	break;
		}

		return nInvA;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}