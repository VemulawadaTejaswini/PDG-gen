import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String result = isFulfill(input) ? "AC" : "WA";
		System.out.println(result);
	}

	public static boolean isFulfill(String input) {

		int size = input.length();
		int countC = 0;
		for (int i = 0; i < size; i++) {
			if (i == 0) {
				if (!Character.isUpperCase(input.charAt(i))) {
					return false;
				}
				if (!"A".equals(String.valueOf(input.charAt(i)))) {
					return false;
				}
			} else if (i == 1 || i == size-1) {
				if (Character.isUpperCase(input.charAt(i))) {
					return false;
				}
			} else  {
				if (Character.isUpperCase(input.charAt(i)) && !"C".equals(String.valueOf(input.charAt(i)))) {
					return false;
				}
				if (countC == 1) {
					if (Character.isUpperCase(input.charAt(i))) {
						return false;
					}
				}
				if (Character.isUpperCase(input.charAt(i)) && "C".equals(String.valueOf(input.charAt(i)))) {
					countC++;
					if (countC == 2) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
