import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char ca[]=s.toCharArray();
		int a=Character.getNumericValue(ca[0]);
		int b=Character.getNumericValue(ca[1]);
		int c=Character.getNumericValue(ca[2]);
		int d=Character.getNumericValue(ca[3]);
		if (a + b + c + d == 7) {
			System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
		} else if (a + b + c - d == 7) {
			System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
		} else if (a + b - c + d == 7) {
			System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
		} else if (a + b - c - d == 7) {
			System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
		} else if (a - b + c + d == 7) {
			System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
		} else if (a - b + c - d == 7) {
			System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
		} else if (a - b - c + d == 7) {
			System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
		} else if (a - b - c - d == 7) {
			System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
		}

	}

}