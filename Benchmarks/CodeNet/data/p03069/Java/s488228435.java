import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int count = 0;
		String black = "#";
		String white = ".";

		for (int i = 1; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals(white)) {
				if (String.valueOf(s.charAt(i - 1)).equals(black)) {
					count++;
				}
			}
		}
//		for (int i = 0; i < s.length(); i++) {
//			int index = s.indexOf(black);
//			if (String.valueOf(s.charAt(index + 1)).equals(white)) {
//				s = s.substring(index);
//				count++;
//			}
//		}

		System.out.println(count);
	}

}
