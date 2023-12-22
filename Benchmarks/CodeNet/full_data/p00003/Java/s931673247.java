import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int readNum = readInteger(br);
		for (int i = 0; i < readNum; i ++) {
			String readLine = readString(br);
			String ary[] = readLine.split(" ");
			int[] iAry = convertStr2Int(ary);
			if (iAry[0]*iAry[0] + iAry[1]*iAry[1] == iAry[2]*iAry[2]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static String readString(BufferedReader br) {

		String readStr = null;
		try {
			readStr = br.readLine();
		} catch (Exception e) {
			return null;
		}
		return readStr;
	}

	private static Integer readInteger(BufferedReader br) {
		String readStr = readString(br);
		int readInt = 0;
		try {
			readInt = Integer.parseInt(readStr);
		} catch (Exception e) {
			return null;
		}
		return readInt;
	}

	private static int[] convertStr2Int(String[] targetAry) {

		int[] convertAry = new int[targetAry.length];
		for (int i = 0; i < targetAry.length; i ++) {
			try {
				convertAry[i] = Integer.parseInt(targetAry[i]);
			} catch (Exception e) {
				/* do nothing. */
			}
		}
		return convertAry;
	}
}