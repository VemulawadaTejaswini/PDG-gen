import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int result = 700;
		for (int i = 0; i < c.length; i++) {
			String str = String.valueOf(c[i]);
			if (str.equals("o")) {
				result = result + 100;
			}
		}
		System.out.println(result);
	}
}