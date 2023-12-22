import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] trumps = new boolean[4][54];
		int missingTrumps = sc.nextInt();
		String character;
		int number;
		int trumpsIndex = 0;

		for (int i = 0; i < missingTrumps; i++) {
			character = sc.next();
			number = sc.nextInt() - 1;
			switch (character) {
			case "S":
				trumpsIndex = 0;
				break;
			case "H":
				trumpsIndex = 1;
				break;
			case "C":
				trumpsIndex = 2;
				break;
			case "D":
				trumpsIndex = 3;
				break;
			}
			trumps[trumpsIndex][number] = true;
		}
		character = "";
		for (int i = 0; i < trumps.length; i++) {
			for (int j = 0; j < trumps[i].length; j++) {
				if (trumps[i][j] == false) {
					switch (i) {
					case 0:
						character = "S";
						break;
					case 1:
						character = "H";
						break;
					case 2:
						character = "C";
						break;
					case 3:
						character = "D";
						break;
					}
					System.out.println(character + " " + (j + 1));
				}
			}
		}
		sc.close();
	}
}
