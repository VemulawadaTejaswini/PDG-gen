import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		String str = sc.next();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'R') {
				count++;
			} else {
				count--;
			}
		}
		if (count > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}