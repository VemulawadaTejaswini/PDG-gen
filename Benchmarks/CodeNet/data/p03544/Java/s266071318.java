import java.util.Scanner;

class LucasNumber {
	public static long calcLucasNumber(int n) {
		if (n <= 1) {
			switch (n) {
			case 0:
				return 2;
			case 1:
				return 1;
			}
		} else if (n >= 2) {
			long lucasNumber[] = { 2, 1, 0 };
			for (int i = 2; i <= n; i++) {
				lucasNumber[2] = lucasNumber[0] + lucasNumber[1];
				lucasNumber[0] = lucasNumber[1];
				lucasNumber[1] = lucasNumber[2];
			}
			return lucasNumber[2];
		}
		return -1;
	}
}

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		long lucasNumber=LucasNumber.calcLucasNumber(number);
		if(lucasNumber!=1) {
			System.out.println(lucasNumber);
		} else {
			System.out.println("Invalid value N");
		}
	}
}
