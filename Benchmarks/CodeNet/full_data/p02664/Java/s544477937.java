

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		if (t.equals("?")) {
			System.out.println("D");
			return;
		}
		int length = 0;
		boolean startWithP = false;
		for (int i = 0; i < t.length(); i++) {
			boolean is = false;
			if (i!= t.length()-1 && t.charAt(i) == '?' && t.charAt(i+1) == '?') {
				length += 1;
				if (length == 1) {
					if (t.charAt(i) == 'P') {
						startWithP = true;
					} else {
						startWithP = false;
					}
				}
				continue;
			} else if (length != 0) {
				length+=1;
				if (!startWithP) {
					StringBuilder stringBuilder = new StringBuilder(t.substring(0, i-length+1));
					for (int j = 0; j < length/2; j++) {
						stringBuilder.append("PD");
					}
					if (length % 2 == 1) {
						stringBuilder.append("D");
					}
					stringBuilder.append(t.substring(i+1));
					t = stringBuilder.toString();
				} else {
					StringBuilder stringBuilder = new StringBuilder(t.substring(0, i-length+1));
					for (int j = 0; j < length/2; j++) {
						stringBuilder.append("DP");
					}
					if (length % 2 == 0) {
						stringBuilder.append("D");
					}
					stringBuilder.append(t.substring(i+1));
					t = stringBuilder.toString();
				}
				length = 0;
			} else if (t.charAt(i) == '?') {
					if (i >= 1) {
						if (t.charAt(i - 1) == 'P') {
							t = t.substring(0, i) + 'D' + t.substring(i+1);
							is = true;
						} else if (i == t.length() - 1) {
							t = t.substring(0, i) + 'D' + t.substring(i+1);
							is = true;
						}
					}
					if (i != t.length() - 1 && !is) {
						if (t.charAt(i + 1) == 'D' || t.charAt(i + 1) == '?') {
							t = t.substring(0, i) + 'P' + t.substring(i+1);
						} else {
							t = t.substring(0, i) + 'D' + t.substring(i+1);
						}
					}
			}
		}
		System.out.println(t);
	}

}
