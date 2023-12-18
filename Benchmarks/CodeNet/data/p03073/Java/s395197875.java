import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		int diff0 = 0;
		int diff1 = 0;
		for (int i=0; i<num.length(); i++) {
			int sheet = Character.getNumericValue(num.charAt(i));
			if (i % 2 == 0) {
				if (sheet == 0) {
					diff1++;
				} else {
					diff0++;
				}
			} else {
				if (sheet == 0) {
					diff0++;
				} else {
					diff1++;
				}
			}
		}

		if (diff0 > diff1) {
			System.out.println(diff1);
		} else {
			System.out.println(diff0);
		}
	}
}