



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '?') {
				if (i >= 1) {
					if (t.charAt(i-1) == 'P') {
						StringBuilder stringBuilder = new StringBuilder(t);
						stringBuilder.setCharAt(i, 'D');
						t = stringBuilder.toString();
					}
				}
				if (i != t.length()-1) {
					if (t.charAt(i+1) == 'D' || t.charAt(i+1) == '?') {
						StringBuilder stringBuilder = new StringBuilder(t);
						stringBuilder.setCharAt(i, 'P');
						t = stringBuilder.toString();
					}
				}
			}
		}
		System.out.println(t);
	}

}
