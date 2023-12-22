import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br  = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strNum = null;

		while ((strNum = parseStdin()) != null) {
			calc(strNum);
		}
	}

	private static void calc(String strNum) {
		int		nNum    = 0;
		int		nLen    = strNum.length();
		String	strWork = null;

		for (int n = 0; n < nLen;) {
			strWork = strNum.substring(n, nLen);
			if (strWork.startsWith("IV")) {
				nNum += 4;
				n    += 2;
			}
			else if (strWork.startsWith("IX")) {
				nNum += 9;
				n    += 2;
			}
			else if (strWork.startsWith("XL")) {
				nNum += 40;
				n    += 2;
			}
			else if (strWork.startsWith("XC")) {
				nNum += 90;
				n    += 2;
			}
			else if (strWork.startsWith("CD")) {
				nNum += 400;
				n    += 2;
			}
			else if (strWork.startsWith("CM")) {
				nNum += 900;
				n    += 2;
			}
			else if (strWork.startsWith("I")) {
				nNum += 1;
				n    += 1;
			}
			else if (strWork.startsWith("V")) {
				nNum += 5;
				n    += 1;
			}
			else if (strWork.startsWith("X")) {
				nNum += 10;
				n    += 1;
			}
			else if (strWork.startsWith("L")) {
				nNum += 50;
				n    += 1;
			}
			else if (strWork.startsWith("C")) {
				nNum += 100;
				n    += 1;
			}
			else if (strWork.startsWith("D")) {
				nNum += 500;
				n    += 1;
			}
			else if (strWork.startsWith("M")) {
				nNum += 1000;
				n    += 1;
			}
		}

		System.out.println(nNum);
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