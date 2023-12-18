import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] sArray = S.toCharArray();
		String result = "Good";
		for (int i = 0; i < 3; i++) {
			if (sArray[i] == sArray[i + 1]) {
				result = "Bad";
			}
		}
		System.out.println(result);
		sc.close();
	}
}