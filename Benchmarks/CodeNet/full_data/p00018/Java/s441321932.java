import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
		int[]	aNum = null;

		while((aNum = parseNum()) != null) {
			Arrays.sort(aNum);
			for (int n = aNum.length - 1; n >= 0; n--) {
				if (n == 0) {
					System.out.println(aNum[n]);
				}
				else {
					System.out.printf("%d ", aNum[n]);
				}
			}
		}
	}

	private static int[] parseNum() {
		int[]	aNum = null;
		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					String[]	aTmp = line.split(" ");
					aNum = new int[aTmp.length];
					for (int n = 0; n < aNum.length; n++) {
						aNum[n] = Integer.parseInt(aTmp[n]);
					}
				}
			}
		}
		catch (IOException e) {}

		return aNum;
	}
}