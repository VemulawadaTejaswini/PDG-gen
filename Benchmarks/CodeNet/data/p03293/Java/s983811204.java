import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder S = new StringBuilder(sc.nextLine());
		String T = sc.nextLine();
		
		boolean matched = false;
		int length = S.length();
		for (int i = 0; i < length; i++) {
			if (S.toString().equals(T)) {
				matched = true;
				break;
			}
			char rotate = S.charAt(length - 1);
			S.deleteCharAt(length - 1);
			S.insert(0, rotate);
		}
		
		System.out.println(matched ? "Yes" : "No");
	}
}