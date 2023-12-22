import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String ans = "";
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (Character.isLowerCase(c)) {
				ans += Character.toUpperCase(c);
			} else {
				ans += Character.toLowerCase(c);
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
