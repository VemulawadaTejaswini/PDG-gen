
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long  num = sc.nextLong();
		String result = "" + num;
		int length = result.length();
		int add = 0;
		int keta;
		long mod = 0;
		for (int i=0; i < length; i++) {
			keta = Integer.parseInt((result.charAt(length - (i + 1))) + "");
			add = add + keta;
		}

		mod = num % add;
		String kekka;
		if (mod == 0) {
			kekka = "Yes";
		} else {
			kekka = "No";
		}
		System.out.println(kekka);

	}
}