import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		String c = sc.next();
		if(c.matches("[aeiou]")) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}
}
