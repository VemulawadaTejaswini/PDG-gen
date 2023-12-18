import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int sLen = s.length();
		int tLen = t.length();
		char[] sList = new char[sLen];
		char[] tList = new char[tLen];
		sList = s.toCharArray();
		tList = t.toCharArray();

		int start = 0;
		int end = 0;
		boolean flag = false;

		for(int i = 0; i < sLen; i++) {
			start = i;
			for(int j = 0; j < tLen; j++) {
				if(sList[i] == tList[j] || (j > 0 && sList[i] == '?')) {

					i++;
					if(j == tLen - 1) {
						end = i;
						flag = true;
						break;
					}

				} else {
					break;
				}
			}
			if(flag) {
				break;
			}
		}

		if(flag) {
			int counter = 0;
			for(int i = start; i < end; i++) {
				sList[i] = tList[counter];
				counter++;
			}
			for(int i = 0; i < sLen; i++) {
				if(sList[i] == '?') {
					sList[i] = 'a';
				}
				System.out.print(sList[i]);
			}
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}