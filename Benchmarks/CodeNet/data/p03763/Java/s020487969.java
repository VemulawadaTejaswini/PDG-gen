import java.io.*;
import java.util.*;

public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int numberOfForces = sc.nextInt();
		// int sum = 0;
		//
		// for (int i = 0; i < numberOfForces * 3; i++) {
		// sum += sc.nextInt();
		// }
		//
		// if (sum == 0) {
		// System.out.println("YES");
		// } else {
		// System.out.println("NO");
		// }

		int inputs = sc.nextInt();
		String[] letters = new String[inputs];
		for (int i = 0; i < inputs; i++) {
			letters[i] = sc.next();
		}

		boolean add = false;
		ArrayList<String> sameLetters = new ArrayList<>();
		for (int c = 0; c < letters[0].length(); c++) {
			String letter = letters[0].substring(c, c + 1);
			for (int r = 0; r < letters.length - 1; r++) {

				if (letters[r + 1].toString().contains(letter)) {
					int index = letters[r + 1].indexOf(letter);
					letters[r + 1] = letters[r + 1].substring(0, index)
							+ letters[r + 1].substring(index + 1, letters[r + 1].length());	
					add = true;
				} else {
					add = false;
					break;
				}
			}
			if(add) {
				sameLetters.add(letter);
			}
		}

		Collections.sort(sameLetters);
		for (String letter : sameLetters) {
			System.out.print(letter);
		}

		sc.close();
	}
}