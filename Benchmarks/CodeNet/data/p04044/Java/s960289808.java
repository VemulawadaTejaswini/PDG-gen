import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN = scan.nextInt();
		int numL = scan.nextInt();

		ArrayList<String> strS = new ArrayList<>();

		for (int i = 0; i < numN; i++) {
			strS.add(scan.next());
		}

		Collections.sort(strS);

		StringBuilder strSB = new StringBuilder();

		for (String str : strS) {
			strSB.append(str);
		}
		System.out.println(strSB);
	}
}
