import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() - 2;
		sc.close();

		StringBuilder sb = new StringBuilder();
		sb.append("3 9 ");
		int a = 15;
		int c = 0;
		while (n > 15000) {
			sb.append(a).append(' ');
			a += 6;
			n--;
			c++;
		}
		if (c % 2 == 1) {
			sb.append(a).append(' ');
			n--;
		}
		for (int i = 1; i <= n; i++) {
			sb.append(i * 2).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
