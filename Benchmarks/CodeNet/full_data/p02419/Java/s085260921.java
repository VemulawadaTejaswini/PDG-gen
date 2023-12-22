import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> lisT = new ArrayList<String>();
	public static void main(String[] args) {

		String W = sc.nextLine();
		String[] T = inpStr();

		findingAword(W, T);
		sc.close();

	}

	private static void findingAword(String W, String[] T) {
		int wd = 0;

		for (int i = 0; i < T.length; i++) {
			if( T[i].equals(W) ) {
				wd++;
			}
		}

		System.out.println(wd);

	}



	private static String[] inpStr() {
		while (sc.hasNextLine()) {
			String t = " " + sc.nextLine() + " ";

			if (t.equals(" END_OF_TEXT ")) {
				break;
			} else {
				lisT.add(t);
			}

		}
		String str = lisT.toString();

		str = str.toLowerCase();


		String[] strs = str.split(" ");

		return strs;
	}

}
