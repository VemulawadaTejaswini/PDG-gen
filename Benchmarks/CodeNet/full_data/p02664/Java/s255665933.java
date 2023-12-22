import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String T = sc.nextLine();
		char[] hoge = new char[T.length()];

		for (int i = 0; i < hoge.length; i++) {
			hoge[i] = T.charAt(i);
		}

		for (int i = 0; i < hoge.length; i++) {
			if (hoge[i] == '?' && i + 1 < hoge.length) {
				if (hoge[i + 1] == '?') {
					hoge[i] = 'P';
					hoge[i + 1] = 'D';
					i++;
				} else {
					if (hoge[i + 1] == 'D') {
						hoge[i] = 'P';
					} else {
						hoge[i] = 'D';
					}
				}
			} else if (hoge[i] == '?' && i + 1 == hoge.length) {
				hoge[i] = 'D';
			}

		}

		for (int i = 0; i < hoge.length; i++) {
			System.out.print(hoge[i]);
		}

		sc.close();
	}

}