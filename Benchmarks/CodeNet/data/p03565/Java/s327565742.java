import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String t = input.next();
		boolean canD = false;
		String finalCheck = "";
		for (int i = s.length() - t.length(); i >= 0; i--) {
			String check = "";
			int counter = 0;
			for (int j = i; j < t.length() + i; j++) {
				if (s.charAt(j) == t.charAt(counter)) {
					check += s.charAt(j);
					counter++;
				} else if (s.charAt(j) == '?') {
					check += t.charAt(counter);
					counter++;
				} else{
					break;
				}
			}
			if (check.equals(t)) {
				for (int k = 0; k < i; k++) {
					if (s.charAt(k) == '?') {
						finalCheck += 'a';
					} else {
						finalCheck += s.charAt(k);
					}
				}
				finalCheck += check;
				for (int l = i + t.length(); l < s.length(); l++) {
					if (s.charAt(l) == '?') {
						finalCheck += 'a';
					} else {
						finalCheck += s.charAt(l);
					}
				}
				canD = true;
				break;
			}
		}
		if (canD) {
			System.out.println(finalCheck);
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}





