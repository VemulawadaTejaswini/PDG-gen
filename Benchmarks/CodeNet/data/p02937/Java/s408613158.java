import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Moji obj = new Moji(scan.next(), scan.next());
		obj.search();
	}

}

class Moji {
	private char[] c0;
	private char[] c1;
	private char[] c2;
	private char[] concatenatedArray;
	private int kari = 0;
	int hantei;

	public Moji(String str1, String str2) {
		c0 = str1.toCharArray();
		c1 = str1.toCharArray();
		c2 = str2.toCharArray();
	}

	public void search() {
		for (int i = 0; i < c2.length;) {
			for (int j = kari; j < c1.length; j++) {
				hantei = 0;
				if (c2[i] == c1[j]) {
					kari = j;
					i++;
					hantei = 1;
					break;
				}
			}
			if (hantei == 1) {
				concatenatedArray = new char[c1.length + c0.length];
				System.arraycopy(c1, 0, concatenatedArray, 0, c1.length);
				System.arraycopy(c1, 0, concatenatedArray, c1.length, c0.length);
				c1 = concatenatedArray;
			} else {
				kari=-2;
				break;
			}

		}
		System.out.print(kari + 1);

	}

}