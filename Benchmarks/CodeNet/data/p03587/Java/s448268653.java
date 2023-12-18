import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		int count = 0;
		for (char c : S.toCharArray()) {
			if (c == '1') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}