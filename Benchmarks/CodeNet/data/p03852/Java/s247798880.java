import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String c = sc.next();
		String b = "aiueo";
		
		if (b.contains(c)) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}

		sc.close();
	}
}
