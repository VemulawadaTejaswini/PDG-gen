import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] headlines = new String[n];
		String correctChars = "";
		for (int i = 0; i < n; i++) {
			headlines[i] = sc.next();
		}
		for (int i = 0; i < headlines[0].length(); i++) {
			String isItIn = headlines[0].substring(i, i + 1);
			boolean itIsIn = true;
			for (int j = 1; j < headlines.length; j++) {
				if (headlines[j].indexOf(isItIn) != -1) {
					int k = headlines[j].indexOf(isItIn);
					if (k == headlines[j].length() - 1) {
						headlines[j] = headlines[j].substring(0, k);
					} else {
						headlines[j] = headlines[j].substring(0, k) + headlines[j].substring(k + 1, headlines[j].length());
					}
				} else {
					itIsIn = false;
					break;
				}
			}
			if (itIsIn) {
				correctChars += isItIn;
			}
		}
		boolean isOrdered = false;
		while (!isOrdered) {
			for (int i = 0; i < correctChars.length() - 1; i++) {
				if (correctChars.charAt(i) > correctChars.charAt(i + 1)) {
					if (i == correctChars.length() - 2) {
						correctChars = correctChars.substring(0, i) + correctChars.substring(i + 1, i + 2) + correctChars.substring(i, i + 1);
						isOrdered = false;
						break;
					} else {
						correctChars = correctChars.substring(0, i) + correctChars.substring(i + 1, i + 2) + correctChars.substring(i, i + 1) + correctChars.substring(i + 2, correctChars.length());
						isOrdered = false;
						break;
					}
				} else {
					isOrdered = true;
				}
			}
		}
		System.out.println(correctChars);
	}
}
