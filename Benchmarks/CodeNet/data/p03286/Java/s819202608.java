import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			if (n % 2 != 0) {
				sb.append(1);
				n--;
			} else {
				sb.append(0);
			}
			n /= -2;
		}

		if (sb.length() == 0) sb.append(0);
		System.out.println(sb.reverse().toString());
	}
}
