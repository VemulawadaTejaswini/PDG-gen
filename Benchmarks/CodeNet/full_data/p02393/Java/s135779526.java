import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int num1, num2, num3;
		
		if ((a < b) && (a < c)) {
			num1 = a;
			if (b < c) {
				num2 = b;
				num3 = c;
			} else {
				num2 = c;
				num3 = b;
			}
		} else if ((b < a) && (b < c)) {
			num1 = b;
			if (a < c) {
				num2 = a;
				num3 = c;
			} else {
				num2 = c;
				num3 = a;
			}
		} else {
			num1 = c;
			if (a < b) {
				num2 = a;
				num3 = b;
			} else {
				num2 = b;
				num3 = a;
			}
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}