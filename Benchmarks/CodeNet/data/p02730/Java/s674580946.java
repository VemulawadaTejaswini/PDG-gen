import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int n = s.length();
		String palindrome = s.substring(0, (n-1) / 2);
		if (s.substring((n + 3)/2 - 1).equals(palindrome)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
