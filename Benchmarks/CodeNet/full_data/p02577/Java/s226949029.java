import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int sum = 0;
		for (int i = 0; i < N.length()-1; i++) {
			sum += N.charAt(i)-'0';
		}
		if (sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}