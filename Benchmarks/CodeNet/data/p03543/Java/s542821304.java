import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char c1 = n.toCharArray()[0];
		int count = 0;
		for(char c : n.toCharArray()) {
			if(c1 == c) {
				count++;
			}
			if(count >= 3) {
				System.out.println("Yes");
				return;
			}
			c1 = c;
		}
		System.out.println("No");
	}
}