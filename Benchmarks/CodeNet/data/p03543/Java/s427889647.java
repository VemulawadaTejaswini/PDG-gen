import java.util.Scanner;

public class GoodInteger {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		int flag = 0;
		for (int l = 0; l <= 1; l++) {
			if (number.charAt(l)==number.charAt(l+1)
					&& number.charAt(l+1)==number.charAt(l+2)) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}