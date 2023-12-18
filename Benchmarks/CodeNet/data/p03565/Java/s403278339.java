import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		String Sprime = s.nextLine();
		String T = s.nextLine();
		int SprimeLength = Sprime.length();
		int TLength = T.length();
		String SprimeSubstring = "";
		boolean matched = false;
		outer: for (int i = 0; i < SprimeLength - TLength + 1; i++) {
			SprimeSubstring = Sprime.substring(i, i + TLength);
			for (int j = 0; j < TLength; j++) {
				if (!(SprimeSubstring.substring(j, j + 1).equals("?")
						|| SprimeSubstring.substring(j, j + 1).equals(T.substring(j, j + 1)))) {
					continue outer;
				}

			}
			SprimeSubstring = SprimeSubstring.replaceAll("\\?", "\\\\?");
			Sprime = Sprime.replaceFirst(SprimeSubstring, T);
			matched = true;

		}
		if (matched) {
			// マッチしました
			Sprime = Sprime.replaceAll("\\?", "a");
			System.out.println(Sprime);
		} else {
			System.out.println("UNRESTORABLE");
		}
	}

}
