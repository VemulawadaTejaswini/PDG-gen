import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int w = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < S.length(); i += w) {
			sb.append(S.charAt(i));
		}

		System.out.println(sb);

		return;
	}
}
