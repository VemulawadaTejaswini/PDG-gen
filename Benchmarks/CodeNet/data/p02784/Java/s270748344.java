
import java.util.Scanner;

public class Main {

	private static String YES = "Yes";
	private static String NO = "No";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long monsterHP = scan.nextLong();
		long nunberSPATK = scan.nextLong();

		String str = scan.nextLine();
		String[] arrInput = str.split(" ");

		scan.close();

		for(int i = 0; i < nunberSPATK; i++) {
			monsterHP -= Long.valueOf(arrInput[i]);
			if (monsterHP <= 0) {
				System.out.println(YES);
				return;
			}
		}
		System.out.println(NO);
	}
}