import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		/*
		String character[] = new String[S.length()];

		for(int i = 0; i < S.length(); i++) {
			character[i] = S.substring(0, S.length());
		}
		*/

		String charArray[] = new String[S.length()];
		charArray = S.split("");

		String str = "";
		boolean isDifferent = false;

		for(int i = 0; i < S.length(); i++) {
			if(str.equals(charArray[i])) {
				isDifferent = false;
				break;
			}else {
				isDifferent = true;
				str = charArray[i];
			}
		}

		if(isDifferent) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
