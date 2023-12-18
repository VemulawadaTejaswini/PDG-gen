import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		String a = sc.nextLine();
		
		char[] before = b.toCharArray();
		char[] after = a.toCharArray();
		
		String ans = "Yes";
		for (int i=0; i<before.length; i++) {
			if (!changeChar(before, after, i)) {
				ans = "No";
				break;
			}
		}

		System.out.println(ans);
	}
	
	private static boolean changeChar(char[] before, char[] after, int index) {
		char b = before[index];
		char a = after[index];

		if (b == a) {
			return true;
		}

		for (int i=0; i<before.length; i++) {
			if (before[i] == b) {
				before[i] = a;
			} else if (before[i] == a) {
				before[i] = b;
			} else {
				continue;
			}
			if (i < index) {
				return false;
			}
		}
		return true;
	}
}