import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int min = Integer.MAX_VALUE;
		int tmp;
		for (int i = 0; i < s.length() - 2; i++) {
			tmp = 0;
			tmp += Character.getNumericValue(s.charAt(i)) * 100;
			tmp += Character.getNumericValue(s.charAt(i + 1)) * 10;
			tmp += Character.getNumericValue(s.charAt(i + 2)) * 1;

			min = Math.min(min, Math.abs(753 - tmp));
		}

		System.out.println(min);
	}
}