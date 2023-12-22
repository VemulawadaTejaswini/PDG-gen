import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int RECT_COUNT = 0;
	public static final int Q_NUMBER = 1;


	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] arrMemberA = bufferedReader.readLine().split(" ");
		String[] arrMemberB = bufferedReader.readLine().split(" ");

		int memberAScore = Integer.parseInt(arrMemberA[0]) + Integer.parseInt(arrMemberA[1]) + Integer.parseInt(arrMemberA[2]) + Integer.parseInt(arrMemberA[3]);
		int memberBScore = Integer.parseInt(arrMemberB[0]) + Integer.parseInt(arrMemberB[1]) + Integer.parseInt(arrMemberB[2]) + Integer.parseInt(arrMemberB[3]);

		if(memberAScore < memberBScore) System.out.println(memberBScore);
		else System.out.println(memberAScore);

	}

	public static String getStringCharAt(String str, int position) {
		return String.valueOf(str.charAt(position));
	}

	public static String[] getStringCharArr(String str) {

		String[] arrResult = new String[str.length()];

		for(int i = 0; i < str.length(); i++) arrResult[i] = getStringCharAt(str, i);

		return arrResult;
	}

	public static boolean isInnerPosition(int x1, int x2, int searchPosition) {
		return x1 <= searchPosition && searchPosition <= x2;
	}

}