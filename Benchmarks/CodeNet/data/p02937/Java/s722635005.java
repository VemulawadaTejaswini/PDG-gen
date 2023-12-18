import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Moji obj = new Moji(scan.next(), scan.next());
		obj.search();
	}

}

class Moji {
	private int loop = 0;
	private char[] c1;
	private char[] c2;
	private int kari = 0;
	int hantei;

	public Moji(String str1, String str2) {

		c1 = str1.toCharArray();
		c2 = str2.toCharArray();
	}

	public void search() {
		for (int i = 0; i < c2.length;) {
			hantei = 0;
			for (int j =0; j < c1.length; j++) {
				if (c2[i] == c1[j]) {
					kari = (loop * c1.length) + j;
					i++;
					hantei = 1;
					if(i==c2.length){
						break;
					}
				}
			}
			if (hantei == 1) {
				loop++;
			} else {
				kari = -2;
				break;
			}
		}
		System.out.print(kari + 1);

	}

}