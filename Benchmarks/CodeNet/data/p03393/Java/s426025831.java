import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String max = "zyxwvutsrqponmlkjihgfedcba";
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String S = sc.next();
		String s = "";
		String ss = "";
		int usedA[] = new int[26];
		int usedB[] = new int[26];
		int usedC[] = new int[26];
		int pointerA = 0;
		int pointerB = 0;
		int pointerC = 0;
		int pointerZ = 25;
		for (int i = 0; i < usedA.length; i++) {
			usedA[i] = 0;
		}
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < max.length(); j++) {
				if (S.charAt(i) == max.charAt(j)) {
					usedA[j] = 1;
				} else if (S.charAt(i) == 'z') {
					pointerZ = i;
				}
			}
		}
		for (int i = 0; i < usedA.length; i++) {
			if (usedA[i] == 0) {
				pointerA = i;
			}
		}
		if (pointerA == 0) {
			ss = S.substring(pointerZ + 1);
//			System.out.println(ss);
			for (int i = 0; i < ss.length(); i++) {
				for (int j = 0; j < max.length(); j++) {
					if (ss.charAt(i) == abc.charAt(j)) {
						usedB[i] = 1;
					}
				}
			}
			for (int i = 0; i < usedB.length; i++) {
				if (usedB[i] == 1) {
					pointerB = i;
				}
			}
//			System.out.println(pointerB);
		}
		if (S.equals(max)) {
			System.out.println(-1);
//		} else if (S.length() == 26 && S.charAt(25) == 'z') {
//			System.out.println("b");
		} else if (pointerA == 0) {
			System.out.println(S.substring(0, pointerZ - 1) + ss.charAt(pointerB));
		} else if (pointerA > 0) {
			System.out.println(S + max.charAt(pointerA));
		}
	}
}